package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class question11 {

		public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
			
			ChromeDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://erail.in/");
			
			String title=driver.getTitle();
			
			System.out.println("Title of the page : "+title);
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			driver.findElement(By.xpath("//input[@id='txtStationFrom']")).clear();
			
			driver.findElement(By.xpath("//input[@id='txtStationFrom']")).sendKeys("MS",Keys.ENTER);
			
			driver.findElement(By.xpath("//input[@id='txtStationTo']")).clear();
			
			driver.findElement(By.xpath("//input[@id='txtStationTo']")).sendKeys("MDU",Keys.ENTER);
			
			driver.findElement(By.xpath("//input[@id='chkSelectDateOnly']")).click();
			
			List<WebElement> trainName=driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//td[2]"));
			
			int size=trainName.size();
			System.out.println("Total size is = "+size);
			
			List<String> list=new ArrayList<String>();
			
			for(int i=0;i<size;i++)
			{
				list.add(trainName.get(i).getText());
			}
			
		    System.out.println("TrainName ="+list);
	}

}
