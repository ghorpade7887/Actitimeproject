package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryLoginPage {
	
	
	//Declaration
	@FindBy(xpath=" //a[text()= ' GEARS ' ]")
	private WebElement gearsbtn;
	
	@FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]")
			private WebElement skillrarydemoapp;
	
	
	//Initialization
	public SkillraryLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	//utilization
	public void gearbutton()
	{
		gearsbtn.click();
		
	}
	public void skillrarydemoapplication()
	{
		skillrarydemoapp.click();
	}

}
