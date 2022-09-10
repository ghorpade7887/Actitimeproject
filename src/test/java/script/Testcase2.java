package script;

import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import pomPages1.SkillarayLoginPage;

public class Testcase2 extends BaseClass {
	
	
	@Test
	public void tc2() {
	SkillarayLoginPage a = new SkillarayLoginPage(driver);
     a.categories();
     a.testingpage();
     utilies.switchingtabs(driver);
	
	}
}
	
