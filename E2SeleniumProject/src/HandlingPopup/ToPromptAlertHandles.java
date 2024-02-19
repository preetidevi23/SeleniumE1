package HandlingPopup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPromptAlertHandles
{

	public static void main(String[] args) throws InterruptedException
	{
	
			WebDriver driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));// to provide implicit wait
		    driver.get("https://omayo.blogspot.com/");//to launch web application
		    
		    driver.findElement(By.id("prompt")).click();
		    Thread.sleep(2000);
		   
		    Alert promptAlert=driver.switchTo().alert();
		     
			String promptText = promptAlert.getText();
		    System.out.println(promptText);
		    Thread.sleep(1000);
		    
		    promptAlert.sendKeys("My name is qspiders");
		    Thread.sleep(2000);
		    
		    promptAlert.accept();
		    
	}

}
