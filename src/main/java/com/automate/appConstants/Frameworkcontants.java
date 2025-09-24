package com.automate.appConstants;

import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.testng.internal.PropertyUtils;

public final class Frameworkcontants {
	
	public static final String PROJECT_PATH = System.getProperty("user.dir");
	public static final String iOS_APP_PATH = "/Users/nbasavalingaiah/Library/Developer/Xcode/DerivedData/DailyNewYorker-azuytexbknysjyetvkrdmjamttge/Build/Products/Release-iphonesimulator/DailyNewYorker.app";
	private static final String EXTENT_REPORT_PATH = PROJECT_PATH + File.separator + "extent-test-report";
	
	public static String getExtentReportPath() {
	      return EXTENT_REPORT_PATH + File.separator + getCurrentDateTime() + File.separator + "index.html";
	    }
	  
	 private static String getCurrentDateTime() {
		    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy_MM_dd-HH_mm_ss");
		    LocalDateTime localDateTime = LocalDateTime.now();
		    return dateTimeFormatter.format(localDateTime);
		  }
}
