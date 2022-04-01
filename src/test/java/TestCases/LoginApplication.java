package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ObjectRepo.SalesForceLogin;

public class LoginApplication {

	@Test
	public void login() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\TestJava\\chromedriverexepath\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://login.salesforce.com");

		SalesForceLogin sf = new SalesForceLogin(driver);
		sf.enterLogin().sendKeys("abc");
		sf.enterPassword().sendKeys("def");
		sf.clickonsubmit().click();

	}

}
