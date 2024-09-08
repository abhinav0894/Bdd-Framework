package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookPage {

	WebDriver driver;
	
	public void OpenBrowser() {
		driver = new FirefoxDriver();
	}
	public void CloseBrowser() {
		driver.quit();
	}
	public void OpenWebpage() {
		driver.get("https://www.facebook.com/");
	}
	
	public void EnterCredentials(String a, String b ) {
		driver.findElement(By.id("email")).sendKeys(a);
		driver.findElement(By.id("pass")).sendKeys(b);
		driver.findElement(By.id("pass")).sendKeys(Keys.ENTER);
	}
	public String readErr() {
		String actualErr = driver.findElement(By.xpath("//a[contains(text(),'Find your account and log in.')]")).getText();
		System.out.println(actualErr);
		return actualErr;
}
}
