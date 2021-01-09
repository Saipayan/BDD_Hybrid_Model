package Core;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.stream.Collectors;

import org.openqa.selenium.By;

import com.google.common.collect.Multiset.Entry;

public  class PageObjectRepoManager {

	public static By LocateElement(String LocatorKey) throws FileNotFoundException, IOException
	{
		HashMap<String,String> map_Val= new HashMap<String,String>();
		Properties properties = new Properties();
		properties.load(new FileInputStream("C:\\Users\\Sreyoshi\\eclipse-workspace\\RestAPI_RestAssured\\BDD_Project_Final\\src\\test\\resources\\PageObjects\\CarSearch.properties"));
		for (String key : properties.stringPropertyNames()) {
		    String value = properties.getProperty(key);
		    map_Val.put(key, value);
		}
		
		return getElement(map_Val.get(LocatorKey));
	}
	
	
	public static By getElement(String locator_Key_Value)
	{
		String locator_Type;
		String locator_Value;
		
		try
		{
			locator_Type=locator_Key_Value.split(":",2)[0];
			locator_Value=locator_Key_Value.split(":",2)[1];
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
		
		if(locator_Type.equalsIgnoreCase("xpath"))
		{
			return By.xpath(locator_Value);
		}
		if(locator_Type.equalsIgnoreCase("id"))
		{
			return By.id(locator_Value);
		}
		
		if(locator_Type.equalsIgnoreCase("LinkText"))
		{
			return By.linkText(locator_Value);
		}
		if(locator_Type.equalsIgnoreCase("class"))
		{
			return By.linkText(locator_Value);
		}
		if(locator_Type.equalsIgnoreCase("tag"))
		{
			return By.tagName(locator_Value);
		}
		return null;
	}
	
	
}
