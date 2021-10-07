package com.org.environment;

public class GlobalPath {
	public static final String USERDIRECTORY_PATH = System.getProperty("user.dir");
	public static final String CONFIGPROPERTIES_PATH = USERDIRECTORY_PATH+ "\\src\\resources\\EnvironmentConfig\\config.properties";
	public static final String READEXCELDATA_PATH = USERDIRECTORY_PATH + "\\src\\resources\\ExcelData\\";
	public static final String SCREENSHOT_PATH = USERDIRECTORY_PATH + "//screenshots//";
	public static final String TESTRESOURCE_PATH = USERDIRECTORY_PATH + "\\src\\test\\resources";

}
