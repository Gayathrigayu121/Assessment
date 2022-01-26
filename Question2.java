package week4.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Question2 {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://www.ajio.com");
		
		String title = driver.getTitle();
		System.out.println("title of the page is "+title);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.findElement(By.xpath("//div[@class='react-autosuggest__container react-autosuggest__container--open']//input")).sendKeys("bags",Keys.ENTER);
		
		driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-genderfilter facet-linkname-Men']")).click();
		
		driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-l1l3nestedcategory facet-linkname-Men - Fashion Bags']")).click();
		
		String item=driver.findElement(By.xpath("//div[@class='length']")).getText();
		
		System.out.println("The no of items....... "  +item);
		
		
		List<WebElement> brandName= driver.findElements(By.xpath("//div[@class='brand']"));
		for (WebElement brands:brandName)
		{
			System.out.println("the Brand names are :"+brands.getText());
		}
		

	}

}
