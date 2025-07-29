package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class AddToCartPage extends basePage{

	public AddToCartPage(WebDriver driver) {
		super(driver);
		
	}
	ProductSelection ps= new ProductSelection(driver);
	
	@FindBy(xpath="//h1[@id='productName']")
	public WebElement Product_Name_on_click;
	
	@FindBy(xpath="(//span[@class='-ml-3'])[1]")
	public WebElement Product_Price_on_click;
	
	@FindBy(xpath="//input[@id='pincode-location-input']")
	WebElement Pincode;
	
	
	@FindBy(xpath="//div[@id='delivery_date_slot']")
	WebElement delivery_date_slot;
	
	
	@FindBy(xpath="//img[@alt='arrow-right']")
	WebElement DateArrow;
	
	@FindBy(xpath="//div[contains(text(),'22')]")
	WebElement DateSelection;
	
	@FindBy(xpath="(//span[@class='-ml-3'])[4]")
	WebElement CuriorPrice;
	
	@FindBy(xpath="//input[@id='radio']")
	WebElement CuriorSelection;
	
	@FindBy(xpath="//input[@id='09:00 - 21:00 Hrs']")
	WebElement TimeSlotSelection;
	
	@FindBy(xpath="//input[@id='PersonalizedText']")
	WebElement PersonalizedTExt;
	
	
	@FindBy(xpath="//img[@id='original-image']")
	WebElement ProductImage;


	@FindBy(xpath="//div[@class='p-1 pr-4']//img[@loading='lazy']")
	WebElement ProductImageCross;
	
	@FindBy(xpath="//button[@title='Add To Cart']")
	WebElement AddToCart;
	
	public String CurPrice= CuriorPrice.getText();
	
	public void Product_Name_Validation() {
		Assert.assertEquals(ps.ItemName, Product_Name_on_click.getText(), "Product name mismatch");
	}
	
	public void Product_Price_Validation() {
		Assert.assertEquals(ps.ItemPrice, Product_Price_on_click.getText(), "Product price mismatch");
	}
	
	public void PincodeSelection() {
		Pincode.sendKeys("413106");
		Pincode.sendKeys(Keys.ENTER);

	}
	 public void dateSelection() {
		 try {
			Thread.sleep(2000);
		 } catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		 }
		 delivery_date_slot.click();
		 DateArrow.click();
		 DateSelection.click();
		 CuriorSelection.click();
		
	 }
	 public void timeSelection() {
		 TimeSlotSelection.click();
	 }
	 public void PersonalizedTextSelection() {
		 PersonalizedTExt.sendKeys("Rakhi");
	 }
	 public void imageValidation() {
		 ProductImage.click();
		 
	 }
	 public void AddToCArt() {
		 ProductImageCross.click();
		 AddToCart.click();
	 }
}
