package com.org.environment;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class GetEnvironment {
	static String browser;
	static String url;

	public static void getEnvironment() {

		Properties prop = new Properties();
		InputStream input = null;
		try {
			input = new FileInputStream(GlobalPath.CONFIGPROPERTIES_PATH);
			prop.load(input);
			setBrowser(prop.getProperty("Browser"));
			setUrl(prop.getProperty("URL"));
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static String getBrowser() {
		return browser;
	}

	public static void setBrowser(String browser) {
		GetEnvironment.browser = browser;
	}

	public static String getUrl() {
		return url;
	}

	public static void setUrl(String url) {
		GetEnvironment.url = url;
	}

}
