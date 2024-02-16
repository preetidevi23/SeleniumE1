package testscreenshot;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class javaExecutorElement {

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			  WebDriver driver = new ChromeDriver();
		        driver.manage().window().maximize();
		        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		        driver.get("https://www.google.co.in");

		        Thread.sleep(2000);
		     driver.findElement(By.xpath("//li[text()=Disabled']")).click();
		     Thread.sleep(1000);
		     //to typecast into javascriptExecutor
		     JavascriptExecutor js=(javaScriptExecuto)drivr;//to passisableElements
		      
		    Thread.sleep(300);
		    // to clear th content from a disable textbox
		    //js.executorScript("document.getElementByid('name').value=''");

		
		
		
		
	}

}
