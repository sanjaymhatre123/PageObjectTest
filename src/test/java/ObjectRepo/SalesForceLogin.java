package ObjectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SalesForceLogin {

	WebDriver driver;

	public SalesForceLogin(WebDriver driver) {

		this.driver = driver;
	}

	By username = By.id("username");

	By password = By.xpath("//input[@type='password']");

	By submit = By.cssSelector("input[value='Log In']");

	public WebElement enterLogin() {

		return driver.findElement(username);

	}

	public WebElement enterPassword() {

		return driver.findElement(password);

	}

	public WebElement clickonsubmit() {

		return driver.findElement(submit);

	}

}
