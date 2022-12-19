package test_Cases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import home_Page.Amezon;

public class TC003_applyFilter {
	@Test
	void Applyfilter() {
		
		System.setProperty("webdriver.chrome.driver","D:\\Testing\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();	
		Amezon homepage=new Amezon(driver);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		homepage.applyFilter();
		
	}

}
