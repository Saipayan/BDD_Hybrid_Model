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

import Core.PageObjectRepoManager;
import Core.WebDriverManagerQA;

public class BrowserActionsImpl extends WebDriverManagerQA implements BrowserActionsInterface  {
	
	
	
	public BrowserActionsImpl(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void OpenURL(String URL)
	{
		driver.get(URL);
	}
	

	public  void selectFROMdropdownBY_VISIBLETEXT(String KeyVAl, String SelectorVAl)
	{
		
		Select selectCArBrand;
		try {
			selectCArBrand = new Select(driver.findElement(PageObjectRepoManager.LocateElement(KeyVAl)));
			selectCArBrand.selectByVisibleText(SelectorVAl);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public  void MoveToELEMENT(String KeyVAl)
	{
		Actions action = new Actions(driver);
		try {
			action.moveToElement(driver.findElement(PageObjectRepoManager.LocateElement(KeyVAl)));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public  void setText(String KeyVAL,String ToSend) 
	{
		try {
			driver.findElement(PageObjectRepoManager.LocateElement(KeyVAL)).clear();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			driver.findElement(PageObjectRepoManager.LocateElement(KeyVAL)).sendKeys(ToSend);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("String is entered successfully");
	}
	
	public  void typeAndSelect(String KeyVAL,String ToSend)
	{
		try {
			driver.findElement(PageObjectRepoManager.LocateElement(KeyVAL)).clear();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			driver.findElement(PageObjectRepoManager.LocateElement(KeyVAL)).sendKeys(ToSend);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		new Actions(driver).pause(1000).sendKeys(Keys.ENTER).perform();
		
		System.out.println("Type and select entered successfully");
	}
	
	public  void SelectDropdownBY_INDEX(String KeyVAL,int Index)
	{
		Select Sel;
		try {
			Sel = new Select(driver.findElement(PageObjectRepoManager.LocateElement(KeyVAL)));
			Sel.selectByIndex(Index);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public  void SelectDropdownBY_VALUE(String KeyVAL,String Value)
	{
		Select Sel;
		try {
			Sel = new Select(driver.findElement(PageObjectRepoManager.LocateElement(KeyVAL)));
			Sel.selectByValue(Value);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public  void WebdriverWait_FUNC_AndClick(String KeyVAL)
	{
		WebDriverWait wait = new WebDriverWait(driver, 10); 
		try {
			WebElement element2 = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(PageObjectRepoManager.LocateElement(KeyVAL))));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(PageObjectRepoManager.getElement(KeyVAL)).click();
	}
	
	public  void mousehoverandClick(String KeyVAL)
	{
		MoveToELEMENT(KeyVAL);
		WebdriverWait_FUNC_AndClick(KeyVAL);
	}
	
	public void clickAndHoldSendKeys(String KeyVAL1,String KeyVAL2,String Value)
	{
		Actions action = new Actions(driver);
		try {
			action.click(driver.findElement(PageObjectRepoManager.LocateElement(KeyVAL1))).build().perform();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			action.sendKeys(driver.findElement(PageObjectRepoManager.LocateElement(KeyVAL2)),Value).perform();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public  void SelectRadioButton(String KeyVAL)
	{
		try {
			if(driver.findElement(PageObjectRepoManager.LocateElement(KeyVAL)).isSelected())
			{
				driver.findElement(PageObjectRepoManager.LocateElement(KeyVAL)).click();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public  String getTextOfElement(String KeyVAL)
	{
		WebDriverWait wait = new WebDriverWait(driver, 10); 
		try {
			return wait.until(ExpectedConditions.visibilityOf(driver.findElement(PageObjectRepoManager.LocateElement(KeyVAL)))).getText();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}
	
	public  void SwitchtoFrame(String Frame)
	{
		driver.switchTo().frame(Frame);
	}
	
	public  void WaitTillPAgeLoad(String KeyVAL)
	{
		try {
		WebDriverWait wait= new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(PageObjectRepoManager.LocateElement(KeyVAL))));
		}
		catch(Exception e)
		{
			
		}
		
	}
	
	public  boolean isElementVisible(String KeyVAL)
	{
		try {
			return driver.findElement(PageObjectRepoManager.LocateElement(KeyVAL)).isDisplayed();
		} catch (IOException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	
	public  String getAttribute(String KeyVAL,String Attribute)
	{
		try {
			return driver.findElement(PageObjectRepoManager.LocateElement(KeyVAL)).getAttribute(Attribute);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	public  void refreshBrowser()
	{
		driver.get(driver.getCurrentUrl());
	}
	
	public  String getPageTitle()
	{
		return driver.getTitle();
	}
	
	public  void SwitchToWindow(String Windowname)
	{
		driver.switchTo().window(Windowname);
	}
	
	public  String getTextOfWebElement(String KeyVAL)
	{
		try {
			return driver.findElement(PageObjectRepoManager.LocateElement(KeyVAL)).getText();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	public  void accept_alert() throws NoAlertPresentException
	{
		driver.switchTo().alert().accept();
	}
	
	public  void dismiss_alert() throws NoAlertPresentException
	{
		driver.switchTo().alert().dismiss();
	}
	
	public  String getAlertText() throws NoAlertPresentException
	{
		return driver.switchTo().alert().getText();
	}
	
	public  void SendKeysinAlert(String SendKeys) throws NoAlertPresentException
	{
		driver.switchTo().alert().sendKeys(SendKeys);
	}
	
	public  String GetURLfromPropfile() throws FileNotFoundException, IOException
	{
		Properties prop = new Properties();
		prop.load(new FileInputStream("/CucumberpageObjects/src/test/resources/EnvironmentVars/EnvVars.properties"));
		return prop.getProperty("URL");
	}
	
	
	
	public  void switchtoWindow(String Windowtitle) throws InterruptedException
	{
		Thread.sleep(2000);
		Set<String> WindowHAndles = driver.getWindowHandles();
		boolean foundHandle = false;
		for(String handle : WindowHAndles)
		{
			driver.switchTo().window(handle);
			Thread.sleep(1000);
			if(driver.getTitle().equalsIgnoreCase(Windowtitle))
			{
				Thread.sleep(1000);
				foundHandle=true;
				System.out.println("Switched to Window");
				break;
			}
			
			
		}
		
	}
	
	public  void MovemouseAndClick(WebDriver driver , String KeyVAL)
	{
		try {
			new Actions(driver).moveToElement(driver.findElement(PageObjectRepoManager.LocateElement(KeyVAL))).click();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public  void BrowserSleep(int waitTime) throws InterruptedException
	{
		try {
			Thread.sleep(waitTime);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}

	

	public void MovemouseAndClick(String str1) {
		try {
			driver.findElement(PageObjectRepoManager.LocateElement(str1)).click();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	
	
}
