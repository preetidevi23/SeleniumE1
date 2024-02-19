package HandlingPopup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHiddenDivisionPopup
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));// to provide implicit wait
	    driver.get("https://www.makemytrip.com/");//to launch web application
	    Thread.sleep(3000);
	    
	    driver.findElement(By.xpath("//(span[text()='Departure']")).click();
	    Thread.sleep(2000);
	
	    
	    driver.findElement(By.xpath("//div[text()='March 2024']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='25']")).click();
	    		
	    Thread.sleep(2000);
	    
	    driver.close();

	}

}
