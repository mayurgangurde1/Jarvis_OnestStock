package com.Jarvis.Protect;

import com.TechStalWarts.constants.FrameWorkConstants;

public class FrameworkConstant {

	
	private static final String RESOURCEPATH=System.getProperty("user.dir")+"/src/main/resources";
	private static final String filePath=FrameWorkConstants.getResourcepath()+"/Excel/PortfolioSyncUpload.xlsx";
	
	public FrameworkConstant() {

	}
	
	public static String getFilePath() {
		return filePath;
	}
	
	public static String getResourcepath() {
		return RESOURCEPATH;
	}
	
	
	
}
