package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Resources.base;

//rahulonlinetutor@gmail.com
public class LoginPage extends base{

	public WebDriver driver;

	By email = By.cssSelector("[id='user_email']");
	By password = By.cssSelector("[type='password']");
	By login = By.xpath("//span[text()='Login']/ancestor::a[1]");      //By.cssSelector("[value='Log In']");
	By forgotPassword = By.cssSelector("[href*='password/new']");

	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub

		this.driver = driver;

	}

	public ForgotPassword forgotPassword() {
		driver.findElement(forgotPassword).click();
		return new ForgotPassword(driver);

	}
	
	/*public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}*/

	public WebElement getEmail() {
		return driver.findElement(email);
		//return getElement(email);
	}

	public WebElement getPassword() {
		return driver.findElement(password);
		//return getElement(password);
	}

	public WebElement getLogin() {
		return driver.findElement(login);
		//return getElement(login);
	}
	
	public void login(String uname,String upassword) {
		getLogin().click();
		getEmail().sendKeys(uname);
		getPassword().sendKeys(upassword);
		//getLogin().click();
		
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		
	}

}
