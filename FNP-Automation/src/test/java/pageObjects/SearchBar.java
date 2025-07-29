package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class SearchBar extends basePage {

	public SearchBar(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath="(//input[@id='search_bar'])[1]")
	WebElement searchBar;
	
	@FindBy(xpath="//div[@class='text-20 font-600 leading-8 text-red-400']")
	By InavlidMsg;
	
	
	public void Searching() {
		searchBar.sendKeys("cake");
		searchBar.sendKeys(Keys.ENTER);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.urlContains("search"));

		String title = driver.getTitle();
		Assert.assertTrue(title.toLowerCase().contains("cake"), "Search result page title doesn't match input");
	}
	 public void invalidInput() {
		 searchBar.sendKeys("bsjjscb");
		 searchBar.sendKeys(Keys.ENTER);

		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 WebElement noResult = wait.until(ExpectedConditions.visibilityOfElementLocated(InavlidMsg));

		 Assert.assertTrue(noResult.isDisplayed(), "Expected no-result message not found");

	 }
	

}
