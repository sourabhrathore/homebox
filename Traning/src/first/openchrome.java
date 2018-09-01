package first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class openchrome {

	public static void main(String[] args) {
		// incognito add
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);

		// set driver path
		System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
		WebDriver driver = new ChromeDriver(capabilities);

		// start using
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("7000112196");
		driver.findElement(By.id("pass")).sendKeys("!@#$%^&*()");
		driver.findElement(By.id("u_0_2")).click();
	}

}
