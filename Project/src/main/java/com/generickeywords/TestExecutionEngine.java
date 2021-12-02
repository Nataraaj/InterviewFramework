package com.generickeywords;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestExecutionEngine extends GenericKeywords{


	@BeforeMethod
	public void beforeMethod() {
		openBrowser();
	}



	@AfterMethod
	public void afterMethod() {
		closeBrowser();
	}

}
