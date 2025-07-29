package pageObjects;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class HomePage extends basePage{

	public HomePage(WebDriver driver) {
		super(driver);
	}

	//locators
	@FindBy(xpath="//button[@id='wzrk-cancel']")
	WebElement Notification_Popup;

	@FindBy(xpath="//div[@class='p-1 pr-4']//img[@loading='lazy']")
	WebElement PersonalizeExp_popup;

	
	@FindBy(xpath="//span[contains(text(),'Rakhi Gifts')]")
	public WebElement Rakhi;
	
	@FindBy(xpath="//span[contains(text(),'Birthday')]")
	public WebElement Birthday;
	
	@FindBy(xpath="(//span[contains(text(),'Occasions')])[1]")
	public WebElement Occassion;
	
	@FindBy(xpath="//span[contains(text(),'Anniversary')]")
	public WebElement Anniversary;
	
	@FindBy(xpath="(//span[contains(text(),'Cakes')])[1]")
	public WebElement cakes;
	
	@FindBy(xpath="(//span[contains(text(),'Flowers')])[1]")
	public WebElement flowers ;
	
	@FindBy(xpath="(//span[contains(text(),'Personalised')])[1]")
	public WebElement personalised ;
	
	@FindBy(xpath="(//span[normalize-space()='Plants'])[1]")
	public WebElement plants;
	
	@FindBy(xpath="//span[contains(text(),'Chocolates')]")
	public WebElement chocolate;
	
	@FindBy(xpath="(//span[normalize-space()='Luxe'])[1]")
	public WebElement luxe;
	
	@FindBy(xpath="(//span[normalize-space()='Combos'])[1]")
	public WebElement combo;
	
	@FindBy(xpath="//span[contains(text(),'Lifestyle')]")
	public WebElement lifestyle;
	
	@FindBy(xpath="//span[contains(text(),'International')]")
	
	public WebElement international;
	
	@FindBy(xpath="//span[contains(text(),'On Trend')]")
	public WebElement  ontrend;
	
	
	
	
	@FindBy(xpath="//a[@class='overflow-hidden rounded-2xl']")
	public List<WebElement> Banner;
	
	
	
	//Action Classes
	public void btn_Notification_Popup() {
		try {
			Notification_Popup.click();
			
	  	}
	catch(Exception e) {
		e.printStackTrace();			
		}
	}
	
	public void btn_PersonalizeExp_popup() {
		try {
			
			PersonalizeExp_popup.click();
	  	}
		catch(Exception e) {			
			}
	}
	
	public  List<WebElement> elements(WebElement Rakhi, WebElement Birthday,WebElement Occassion,WebElement Anniversary, WebElement cakes, WebElement flowers, WebElement personalised,WebElement plants,WebElement chocolate, WebElement luxe,WebElement combo, WebElement lifestyle, WebElement international, WebElement  ontrend ){
		
		List<WebElement> a= new ArrayList<WebElement>();
		a.add(Rakhi);
		a.add(Birthday);
		a.add(Occassion	);
		a.add(Anniversary);
		a.add(cakes);
		a.add(flowers);
		a.add(personalised);
		a.add(plants);
		a.add(chocolate);
		a.add(luxe);
		a.add(combo);
		a.add(lifestyle);
		a.add(international);
		a.add(ontrend);
		
		return a;
		
		}
	
	public void Menuelements(List<WebElement> a) {
		for(WebElement w: a) {
			String name=w.getText();
			w.click();
			btn_PersonalizeExp_popup();
			if(driver.getTitle().contains(name)) {
				
				System.out.println(name+"menu Validated");
			}
			else {
				System.out.println("Invalide"+name+"menu");
			}
		}
	}
		
	
	public void BannerVAlidation(List<WebElement> Banner) {
		for(WebElement slide : Banner) {
			slide.click();
			System.out.println(driver.getTitle());
		}
	}
	
}
