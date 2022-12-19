package test_Cases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import home_Page.Amezon;


public class TC001_validateChar {
	@Test
     void ValidateCharacter() throws InterruptedException{
	
		System.setProperty("webdriver.chrome.driver","D:\\Testing\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();	
		Amezon homepage=new Amezon(driver);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		homepage.enterProduct("T-shirt");
		homepage.submitButton();
	}
	
}
