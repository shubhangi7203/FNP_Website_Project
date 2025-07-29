package testCases;

import org.testng.annotations.Test;

import pageObjects.SearchBar;
import testBase.BaseClass;

public class TS_02_SearchPage extends BaseClass{

	SearchBar sb;
	@Test(priority = 5)
	public void searching() {
		sb = new SearchBar(driver);
		sb.Searching();
		System.out.println("..................Auto Suggestion Validation is Done ................");
	}
//	@Test(priority = 6)
//	public void InvalidSearching() {
//		sb.invalidInput();
//	}
}
