package week4.day1;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Question12 {

	@Test
	public void captureScreenMethod() throws Exception {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		try {
			driver.get("https://www.facebook.com/");
			driver.navigate().refresh();
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys("gaydd");// Statement with correct Xpath
			driver.findElement(By.id("pss")).sendKeys("dd"); // Statement with incorrect Xpath
			driver.findElement(By.xpath("//button[@name='login']")).click();
	      	}
		catch (Exception e) {
			File src = driver.getScreenshotAs(OutputType.FILE);
			// File dst=new File("./snaps/FB.png");
			File dst = new File("D:\\FB.png");
			FileUtils.copyFile(src, dst);
		}

	}

}
