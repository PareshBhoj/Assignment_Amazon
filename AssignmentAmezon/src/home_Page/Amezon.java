package home_Page;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Amezon {
	
	
	WebDriver driver;
	By productName=By.id("twotabsearchtextbox");
	By submit=By.id("nav-search-submit-button");  
	By filter=By.id("searchDropdownBox");
	By search=By.id("nav-search-submit-button");
	By checkbox=By.xpath("//*[@id=\"p_89/Allen Solly\"]/span/a/div/label/i");
	By Range=By.xpath("//*[@id=\"p_36/4595086031\"]/span/a/span");
	By delivertoday=By.xpath("//i[@class='a-icon a-icon-checkbox']");

	public Amezon(WebDriver driver1)
	{
		driver=driver1;
	}
	public void enterProduct (String product) throws InterruptedException
	{
		driver.findElement(productName).sendKeys("Tshirt");
	}
	
	public void Filter() throws InterruptedException
	{
		driver.findElement(filter).click();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		Thread.sleep(4000);
	}
	public void submitButton()
	{
		driver.findElement(submit).click();
	}
	public void applyFilter()
	{
		driver.findElement(productName).sendKeys("Tshirt");
		Select type = new Select (driver.findElement(filter));
		type.selectByVisibleText("Baby");
	}
	public void checkbox()
	{
		driver.findElement(checkbox).click();
	}
	public void range()
	{
		driver.findElement(Range).click();
	}
	public void deliverToday()
	{
		driver.findElement(delivertoday).click();
	}
	 
}
