package Common;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public interface BrowserActionsInterface {

	public void OpenURL(String Str);
	public  void selectFROMdropdownBY_VISIBLETEXT(String str1 , String SelectorVAl) ;
	
	
	public  void MoveToELEMENT(String str1) ;
	
	public  void setText(String str1,String ToSend) ;
	
	
	public  void typeAndSelect(String str1,String ToSend);
	
	
	public  void SelectDropdownBY_INDEX(String str1,int Index);
	
	public  void SelectDropdownBY_VALUE(String str1,String Value) ;
	
	
	public void WebdriverWait_FUNC_AndClick(String str1);
	
	public  void mousehoverandClick(String str1);
	
	public  void clickAndHoldSendKeys(String ele1,String ele2,String Value);
	
	
	public  void SelectRadioButton(String str);
	
	public  String getTextOfElement(String str1);
	
	public  void SwitchtoFrame(String Frame);
	
	
	public  void WaitTillPAgeLoad(String str1);
	
	
	public  boolean isElementVisible(String str1);
	
	
	public  String getAttribute(String str1,String Attribute);
	
	public  void refreshBrowser();
	
	public  String getPageTitle();
	
	
	public  void SwitchToWindow(String Windowname);
	
	
	public  String getTextOfWebElement(String str1);
	
	
	public  void accept_alert();
	
	public void dismiss_alert();
	
	public  String getAlertText();
	
	
	public  void SendKeysinAlert(String SendKeys);
	
	
	public  String GetURLfromPropfile() throws FileNotFoundException, IOException;
		
	
	
	public  void switchtoWindow(String Windowtitle) throws InterruptedException;
	
	
	public void MovemouseAndClick(String str1);
	
	
	public  void BrowserSleep(int waitTime) throws InterruptedException;
	

	
	
}
