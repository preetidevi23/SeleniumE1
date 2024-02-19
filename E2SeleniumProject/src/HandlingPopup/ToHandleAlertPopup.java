package HandlingPopup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleAlertPopup {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));// to provide implicit wait
	    driver.get("https://omayo.blogspot.com/");//to launch web application
	    
	   driver.findElement(By.id("alert1")).click();
	   Alert alert=driver.switchTo().alert();
	   Thread.sleep(2000);
	   
	   //alert.accept();             //to click on cancel we used accept method
	   
        alert.dismiss();             //to click on cancel we used dismiss method

	}

}
