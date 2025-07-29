package pageObjects;

import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RakhiGifts extends basePage {

	public RakhiGifts(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath="//span[contains(text(),'Rakhi Gifts')]")
	public WebElement Rakhi;
	
	
	@FindBy(xpath="(//img[@alt='open'])[1]")
	WebElement PriceFilter;

	@FindBy(xpath="//input[@id='checkbox-Price_1']")
	WebElement priceRange;
	
	@FindBy(xpath="(//img[@alt='open'])[1]")
	WebElement RakhiComboFilter;
	
	@FindBy(xpath="//input[@id='checkbox-RakhiCombos_0']")
	WebElement AllRakhiComboType;
	
	@FindBy(xpath="(//span[@class='flex w-[15px] items-center'])[1]")
	WebElement SortFilter;
	
	@FindBy(xpath="//span[@id='listprice_fnp.com_INR|asc']")
	WebElement LowToHighFilter;
	
	@FindBy(xpath="//span[@class='ml-4 mr-2 text-14 font-600']//span[@class='-ml-3']")
	public List<WebElement> prices;
	
	
	
	public void clicks() {
		Rakhi.click();
		PriceFilter.click();
		priceRange.click();
		RakhiComboFilter.click();
		AllRakhiComboType.click();
		SortFilter.click();
		LowToHighFilter.click();
	}
	
	
	
	
	LinkedList<Integer> int_prices=new LinkedList<Integer>();
	public LinkedList<Integer>getPrices(List<WebElement> prices){
		for(WebElement Rs: prices) {
			int_prices.add(Integer.parseInt(Rs.getText()));
		}
		return int_prices;
		
		
	}
	
	
	
}
