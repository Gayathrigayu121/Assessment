package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Question7Alerts {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoqa.com/alerts");

		// Simple alert
		driver.findElement(By.xpath("(//button[text()='Click me'])[1]")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();

		// Confirmation alert
		driver.findElement(By.xpath("(//button[text()='Click me'])[3]")).click();
		Thread.sleep(2000);
		alert.dismiss();

		// prompt alert
		driver.findElement(By.xpath("(//button[text()='Click me'])[4]")).click();
		String text = alert.getText();
		System.out.println(text);
		Thread.sleep(2000);
		alert.sendKeys("KK");
		alert.accept();

	}

}
