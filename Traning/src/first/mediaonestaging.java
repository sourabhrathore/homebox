package first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mediaonestaging {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// navigating to page
		driver.get("http://mediaone-web.staging.quintype.io/");

		// window maximize
		driver.findElement(By.className("story-card__headline")).click();
		Thread.sleep(4000);
		driver.navigate().back();

	}

}
