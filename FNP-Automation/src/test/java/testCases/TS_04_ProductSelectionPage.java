package testCases;

import org.testng.annotations.Test;

import pageObjects.ProductSelection;
import testBase.BaseClass;

public class TS_04_ProductSelectionPage extends BaseClass{

	ProductSelection ps;
	
	@Test(priority=9)
	public void Selection_of_Product() throws InterruptedException {
		ps= new ProductSelection(driver);
		ps.Product_Selection();
		System.out.println("..................Product is Selected for Validation................");
	}
}
