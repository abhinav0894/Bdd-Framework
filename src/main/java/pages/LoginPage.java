package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginPage {
	WebDriver driver;
	
	public void openBrowser() {
		driver = new FirefoxDriver(); 
	}
	
	public void openLoginPage() {
		driver.get("https://auth.scotiaonline.scotiabank.com/online?oauth_key=SV9iv_TBZ9k&oauth_key_signature=eyJraWQiOiJrUFVqdlNhT25GWUVDakpjMmV1MXJvNGxnb2VFeXJJb2tCbU1oX3BiZXNVIiwidHlwIjoiSldUIiwiYWxnIjoiUlMyNTYifQ.eyJvYXV0aF9rZXkiOiJTVjlpdl9UQlo5ayIsImNvbnNlbnRfcmVxdWlyZWQiOmZhbHNlLCJyZWRpcmVjdF91cmkiOiJodHRwczpcL1wvd3d3LnNjb3RpYW9ubGluZS5zY290aWFiYW5rLmNvbVwvb25saW5lXC9sYW5kaW5nXC9vYXV0aGxhbmRpbmcuYm5zIiwiZXhwIjoxNzE3MzUwMDU0LCJpYXQiOjE3MTczNDg4NTQsImp0aSI6IjcyM2FmZmJmLTllYjctNDVjNy05MDYwLTZlZmNhNjkxYzdiYSIsImNsaWVudF9pZCI6IjhlZTkwYzM5LTFjNTItNGZmNC04YWU2LWE3YjU0YzUzOTkzMyIsImNsaWVudF9tZXRhZGF0YSI6eyJDaGFubmVsSUQiOiJTT0wiLCJBcHBsaWNhdGlvbkNvZGUiOiJINyJ9LCJpc3N1ZXIiOiJodHRwczpcL1wvcGFzc3BvcnQuc2NvdGlhYmFuay5jb20ifQ.NtWr9Ex-uhuXaerZIbPB_LJFM47lBXbOo7fjCPBT3wN-eK-lzLykSGkPkpv82nM39UW_JwBQdceivYBGvOEdsfV8EQxKSbifUt3aprM8saO2cI2Sqf3TilOGXockxkYRFJCVQg3ky_V2V3LHw-MLFyb4Iz9BQd0eEPyywSpd3NLHtGPr3ROBAqQCRM11UhWRLN9kC2081oZ2UBzWvXxPOpB-oJ1xyDtKJmzaeLcsq5gB_aRFtYMr4JzkgwHnbRhHc95slSM5k_w7o-1aJkEarvql-Z_dk5DBlQa9GW8db8o-jd4xCT5T1a6J_6CBTb-Zx3gfAXFTREfEd28iWQVoOA&preferred_environment=");
	}
	
	public void closeBrowser() {
		driver.quit();
	}
	
	public String readTitle() {
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		return actualTitle;
	}
	
	public void enterEmailPassword(String a, String b) {
		driver.findElement(By.id("usernameInput-input")).sendKeys(a);
		driver.findElement(By.name("password")).sendKeys(b);
	}
	
	public void clickOnLoginButton() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", driver.findElement(By.id("signIn")));	
		Thread.sleep(2000);
	}
	
	public String readErr() {
		String actualErr = driver.findElement(By.id("UsernameTextField__errors-usernameInput")).getText();
		System.out.println(actualErr);
		return actualErr;
}
	}
