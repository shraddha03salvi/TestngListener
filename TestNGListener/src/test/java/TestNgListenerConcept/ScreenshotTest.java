package TestNgListenerConcept;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomListener.class)
public class ScreenshotTest extends BaseCalss 
{
 @BeforeMethod
 public void setUp() 
 {
	 intialization();
 }
 @AfterMethod
 public void tearDown() 
 {
	 driver.quit();
 }
 @Test
 public void LoginTest() {
	 Assert.assertEquals(false,true);
 }
 @Test
 public void SearchTest() {
	 Assert.assertEquals(false,true);
 }
 @Test
 public void createDealTest() {
	 Assert.assertEquals(false,true);
 }
 
 
}
