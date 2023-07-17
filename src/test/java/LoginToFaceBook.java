import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import GenricUtils.BaseClass;
import objectRepo.LoginPage;

public class LoginToFaceBook extends BaseClass
{
	@Test
	public void fb() throws IOException
	{
		
//		FileInputStream fis = new FileInputStream("./src/maink,/resources/config.properties");
//		Properties prop = new Properties();
//		prop.load(fis);
//		String usn = prop.getProperty("username");
//		String pswd = prop.getProperty("password");
		LoginPage lp = new LoginPage(driver);
		lp.loginToFB("adarsh", "99886622");
	}

}
