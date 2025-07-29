package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ProductSelection extends basePage{

	public ProductSelection(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath="//div[@class='pt-8 sm:p-12']//div[normalize-space()='Ethereal Ram Darbar Rakhi & Bracelet Combo']")
	public WebElement ProductName;
	
	@FindBy(xpath="(//span[@class='-ml-3'])[2]")
	public WebElement ProductPrice;
	
	

	
	//Action classes
	 public String ItemName=ProductName.getText();
	public String ItemPrice=ProductPrice.getText();
	
	public void Product_Selection() throws InterruptedException {
		ProductName.click();
		Thread.sleep(5000);
	}

	

}
