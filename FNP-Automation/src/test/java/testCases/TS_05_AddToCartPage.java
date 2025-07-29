package testCases;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AddOnPage;
import pageObjects.AddToCartPage;
import testBase.BaseClass;

public class TS_05_AddToCartPage extends BaseClass {

	AddToCartPage ac;
	@Test(priority=10)
	public void Product_Name_Validation() {
		ac= new AddToCartPage(driver);
		
		Set <String> windowIds = driver.getWindowHandles();

		List<String>winID=new ArrayList<String>(windowIds);
		driver.switchTo().window(winID.get(1));
		ac.Product_Name_Validation();
		System.out.println("..................Product Name is Validated................");
	}
	
	@Test(priority=11)
	public void Product_PRICE_Validation() {
		ac.Product_Price_Validation();
		System.out.println("..................Product Price is Validated................");
	}
	@Test(priority=12)
	public void Pincode_Selection() {
		ac.PincodeSelection();
		System.out.println("..................Pincode Selection is Validated................");
	}
	@Test(priority=13)
	public void Date_Selection() {
		ac.dateSelection();
		System.out.println("..................Date Selection is Validated................");
	}
	
	@Test(priority=14)
	public void time_Selection() {
		ac.timeSelection();
		System.out.println("..................Time Selection is Validated................");
	}
	
	@Test(priority=15)
	public void PersonalizedText_Selection() {
		ac.PersonalizedTextSelection();
		System.out.println("..................Personalized Text is Validated................");
	}
	@Test(priority=16)
	public void imageValidation() {
		 ac.imageValidation();
		 
	 }
	@Test(priority=17)
	public void AddToCartSeection() {
		ac.AddToCArt();
		System.out.println("..................Upadte and remove in  Cart is Validated................");
	}

	
}
