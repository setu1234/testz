package example;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;		
import org.testng.Assert;		
import org.testng.annotations.Test;

import com.paulhammant.ngwebdriver.NgWebDriver;



import org.testng.annotations.BeforeTest;	
import org.testng.annotations.AfterTest;	
public class NewTest {
		WebDriver driver;
		@Test				
		public void testEasy() throws InterruptedException {	
			ChromeOptions options=new ChromeOptions();
			
			options.addArguments("use-fake-ui-for-media-stream");
		//options.addArguments("--headless");
			options.addArguments("--window-size=1920,1080");
			
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "//NewDriver//chromedriver.exe"); //set chromedriver path properties
			driver=new ChromeDriver(options); //initiate chrome driver
		
			driver.manage().window().maximize(); //make window maximize
			driver.manage().deleteAllCookies(); //delete all cookies from browser
		
		  
			driver.get("https://therapdevapp.promactinfo.xyz/client/login");  
			String title = driver.getTitle();				 
			// Assert.assertTrue(title.contains("Demo Guru99 Page")); 	
			driver.findElement(By.xpath("/html/body/theraparea-client-root/theraparea-client-login/section/div/div/div[2]/div/div/div[2]/form/div[1]/input")).sendKeys("setusharaf@gmail.com");
			driver.findElement(By.xpath("/html/body/theraparea-client-root/theraparea-client-login/section/div/div/div[2]/div/div/div[2]/form/div[2]/input")).sendKeys("Promact2018@");
Thread.sleep(3000);
driver.findElement(By.xpath("/html/body/theraparea-client-root/theraparea-client-login/section/div/div/div[2]/div/div/div[2]/form/div[3]/button")).click();
		}	
		
		@AfterTest
		public void afterTest() {
			driver.quit();			
		}	

}
