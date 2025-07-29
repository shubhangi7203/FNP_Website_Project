package testCases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TS_01_HomePage extends BaseClass{
	HomePage hp;
	@Test(priority=1)
	public void popup(){
		hp=new HomePage(driver);
		hp.btn_Notification_Popup();
		System.out.println("..................Notification Pop Up ................");
	}
	@Test(priority=2)
	public void titleValidation() {
		String expectedTitle = "FNP: India's #1 Online Gift Store | Flowers, Cakes, Gift Hampers etc.";
		Assert.assertEquals(driver.getTitle(), expectedTitle, "Page title mismatch");
		System.out.println("..................Title Validated ................");

	}
	@Test(priority = 3)
    public void verifyPageLoadsSuccessfully() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement logo = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='Ferns N Petals']")));
        Assert.assertTrue(logo.isDisplayed(), "Logo not displayed — Page may have loading issues");
        System.out.println("..................Page Load is Validated Succesfully................");
    }
	@Test(priority=4)
	public void MenuVAlidation() throws InterruptedException {
		List<WebElement> ans=hp.elements(hp.Rakhi,hp.Birthday, hp.Occassion,hp.Anniversary,hp.cakes, hp.flowers, hp.personalised, hp.plants, hp.chocolate, hp.luxe, hp.combo, hp.lifestyle, hp.international, hp.ontrend);
		hp.Menuelements(ans);
		System.out.println("..................Menu Validation is Done ................");
	}
}
