package Academy;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import PageObjects.Flipkart_Page;
import Resources.base;

public class FlipkartTest_1 extends base{
	public WebDriver driver;
	
	@Test(priority=1)
	public void test() throws IOException {
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
	}
	
	@Parameters({"browser"})
	@Test(priority=2)
	public void test2(String browser) throws InterruptedException {
		
		Flipkart_Page flipkartpage =new Flipkart_Page(driver);
		flipkartpage.AddToCart("apple watch");
	}
}
