package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{

	@FindBy(xpath="//input[@id='email']")
	private WebElement userName;
	
	@FindBy(xpath="//input[@id='pass']")
	@CacheLookup
	private WebElement pswd;
	
	
	@FindBy(xpath = "//button[@name='login']")
	private WebElement button;


	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getUserName() {
		return userName;
	}


	public WebElement getPswd() {
		return pswd;
	}


	public WebElement getButton() {
		return button;
	}
	
	
	public void loginToFB(String userName, String Pswd)
	{
		getUserName().sendKeys(userName);
		getPswd().sendKeys(Pswd);
		getButton().click();
		
	}

}
