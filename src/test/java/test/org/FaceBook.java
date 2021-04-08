package test.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("rio");

		WebElement userpassword = driver.findElement(By.id("pass"));
	//	userpassword.sendKeys("pass");
	//	 driver.findElement(By.name("login")).click();
		userpassword.sendKeys("pass");
			 driver.findElement(By.name("login")).click();

	}

}
