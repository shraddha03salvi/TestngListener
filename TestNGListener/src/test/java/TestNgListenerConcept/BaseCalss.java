package TestNgListenerConcept;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseCalss 
{
 public static WebDriver driver;
 
 public static void intialization() 
 {
	 System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
 }
  public void failed(String testMethodName) 
  {
	 File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 try {
 FileUtils.copyFile(srcFile,new File("./Screenshot/"+testMethodName+"_"+".png"));
	} catch (IOException e) {
		e.printStackTrace();
	}
  }
}
