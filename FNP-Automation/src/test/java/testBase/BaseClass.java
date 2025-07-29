package testBase;
 
import java.time.Duration;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseClass {

public static WebDriver driver;
@BeforeTest
    public static WebDriver driverSet() {
 
		Scanner sc = new Scanner(System.in);

		System.out.println(" Enter the driver name");

		String input = sc.nextLine();
 
		if(input.equalsIgnoreCase("chrome")) {

			driver = new ChromeDriver();

			}
 
		else {

			driver = new EdgeDriver();

			}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 
		driver.manage().window().maximize();
		driver.get("https://www.fnp.com");
		return driver;
		
 
  }
@AfterTest

public void teardown() {

	driver.quit();

}
 
}
