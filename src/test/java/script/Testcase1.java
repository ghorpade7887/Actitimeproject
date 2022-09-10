package script;

import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import pomPages.AutoCartPage;
import pomPages.SkillraryDemoLoginPage;
import pomPages.SkillraryLoginPage;

public class Testcase1  extends BaseClass{
	@Test
	public void tc1() throws InterruptedException {
	SkillraryLoginPage s=new SkillraryLoginPage(driver);
    s.gearbutton();
	s.skillrarydemoapplication();
	
	utilies.switchingtabs(driver);
	
	   SkillraryDemoLoginPage sd = new SkillraryDemoLoginPage(driver);
	utilies.mouseHover(driver,sd.getCoursetab());
	sd.seleniumtrainingtab();
	
	
	AutoCartPage d = new AutoCartPage(driver);
	utilies.doubleClick(driver, d.getAddbtn());
	d.cattocartbtn();
	utilies.alertPopup(driver);
	}

}
