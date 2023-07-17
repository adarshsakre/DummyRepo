package GenricUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass 
{
public static WebDriver driver;

	
	
	
	@Parameters("browser")
	@BeforeTest

	public void adf(String browser) throws Throwable
	{
		
				
		if (browser.equals("chrome")) 
		{
			driver = WebDriverManager.chromedriver().create();

		}
		else if (browser.equals("firefox")) 
		{
			driver = WebDriverManager.firefoxdriver().create();

		}

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


	}
	@BeforeMethod
	public void me()
	{
		
		System.out.println("method");
	}
	
	@AfterMethod
	public void afme()
	{
		System.out.println("method");
	}

	@AfterTest
	public void afterMethod()
	{
		driver.quit();
	}

}
