 package assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ToScrollDownwords {

	public static void main(String[] args) throws IOException {
	       

WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
driver.get("https://www.selenium.dev/");


	  ts = () driver;


            File src = (File) ts.getScreenshotAs(OutputType.FILE);
            File dest = new File("https://www.selenium.dev/");
Files.copy(src, dest);
driver.quit();
}ToScrollDownwords
}   
 