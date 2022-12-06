package testDataSample;

import org.automation.base.Base_Page;
import org.automation.base.Base_Test;
import org.automation.generic_utilities.ActionsUtil;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Tricentis_Solutions_TestScript extends Base_Test{

	
@Test
public void solution() throws InterruptedException {
	Base_Page page=new Base_Page(driver);
	Actions util=new Actions(driver);
	page.Request_Demo().click();
	util.moveToElement(page.solution);
}
}
