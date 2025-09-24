package com.automate.reports;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

public final class ExtentReportLogger {

	  public static void logPass(String message) {
		  ExtentReportManager.getExtentTest().log(Status.PASS, message);
	    }

	  public static void logFail(String message, Throwable t) {
	    
		  ExtentReportManager.getExtentTest().log(Status.FAIL, message);
	    }
	  

	  public static void logSkip(String message) {
	 
	      ExtentReportManager.getExtentTest().log(Status.SKIP, message);
	    }
	  

	  public static void logInfo(String message) {
	    ExtentReportManager.getExtentTest().log(Status.INFO, message);
	  }

	  public static void warning(String message) {
	    ExtentReportManager.getExtentTest().log(Status.WARNING, message);
	  }
	}
