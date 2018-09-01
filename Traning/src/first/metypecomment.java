package first;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class metypecomment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
		WebDriver driver = new ChromeDriver();

		// navigating to page
		driver.get("https://staging.metype.com/iframe-test-widget");

		// window maximize
		driver.manage().window().maximize();
		// driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		// switch to I-frame
		driver.switchTo().frame("metype-comment-iframe-aHR0cHM6Ly9zdGFnaW5nLm1ldHlwZS5jb20vaWZyYW1lLXRlc3Qtd2lkZ2V0");

		driver.findElement(By.className("login-button")).click();
		driver.findElement(By.id("login-google")).click();
		driver.findElement(By.id("identifierId")).sendKeys("sourabh@quintype.com");
	}

}