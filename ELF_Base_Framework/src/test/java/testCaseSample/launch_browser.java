package testCaseSample;

import org.automation.base.Base_Page;
import org.automation.base.Base_Test;
import org.automation.element_repository.Login_Page;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.Test;

public class launch_browser extends Base_Test{
@Test
	public void search() throws Exception  {
	homePage.getCustomerProfileLink(emailId).click();
	
	}
}
