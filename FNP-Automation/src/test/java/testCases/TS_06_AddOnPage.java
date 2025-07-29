package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AddOnPage;
import testBase.BaseClass;

public class TS_06_AddOnPage extends BaseClass {

	AddOnPage ap;
	@Test(priority=18)
	public void Add_Button_Validation() {
		ap = new AddOnPage(driver);
		ap.btn_Add();
		System.out.println("..................Add Button Validated................");
	}	
	
	@Test(priority=19)
	public void Addon_Price_Validation(){
			ap.AddOnValidation();
			System.out.println("..................AddOn Price is Validated................");
		}
	
	@Test(priority=20)
	public void Total_Price_Validation(){
		ap.totalValidation();
		System.out.println("..................Total Price is Validated................");
	}
	
	@Test(priority=21)
	public void Conitune_Button_Validation(){
		ap.btn_continue();
		System.out.println("..................Continue button is Validated................");
	}
	
	@Test(priority=22)
	public void Cart_Updation_Validation(){
		ap.updateingCart();
		System.out.println("..................CArt Updation is Validated................");
	}
	
	}

