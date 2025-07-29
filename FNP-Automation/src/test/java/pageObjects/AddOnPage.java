package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class AddOnPage extends basePage {

	public AddOnPage(WebDriver driver) {
		super(driver);
		
	}
	
	AddToCartPage ac= new AddToCartPage(driver);
	ProductSelection ps= new ProductSelection(driver);
	
//	@FindBy(xpath="(//div[contains(text(),'ADD')])[1]")
	@FindBy(xpath="(//*[text()='Ethnic Rakhi'])[2]")
	WebElement AddOn;

	
	@FindBy(xpath="(//span[contains(text(),'79')])[14]")
	WebElement AddOnPrice;
	
	public String AddonPrice= AddOnPrice.getText();
	
	@FindBy(xpath="(//span[@class='-ml-3'])[151]")
	WebElement AddOnPriceAfter;
	
	@FindBy(xpath="(//span[@class='-ml-3'])[153]")
	WebElement TotalPrice;
	
	@FindBy(xpath="//div[@class='flex h-[40px] w-[311px] items-center justify-center rounded-lg bg-[#737530] p-2.5 px-3 duration-300 ease-in-out hover:bg-opacity-80']")
	WebElement btn_Continue;
	
	@FindBy(xpath="(//img[@class='cursor-pointer w-[20px] h-[20px] shrink-0'])[1]")
	WebElement UpdatingCart;
	
	
	@FindBy(xpath="(//button[contains(@aria-label,'button')])[1]")
	WebElement RemoveButton;
	
	
	public void btn_Add() {
		AddOn.click();
	}
	public void AddOnValidation() {
		Assert.assertEquals(AddonPrice, AddOnPriceAfter.getText(), "Addon price mismatch");
	}
	
	public void totalValidation() {
		int productP= Integer.parseInt(ps.ItemPrice);
		int CuriorP= Integer.parseInt(ac.CurPrice);
		int AddonP= Integer.parseInt(AddonPrice);
		
		int finalTotal =(productP+CuriorP+AddonP);
		
		Assert.assertEquals(finalTotal, TotalPrice.getText(), "Total price mismatch");
		
	}
	public void btn_continue() {
		btn_Continue.click();
	}
	
	public void updateingCart() {
		UpdatingCart.click();
		RemoveButton.click();
	}
}
