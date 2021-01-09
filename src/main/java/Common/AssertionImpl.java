package Common;

import Core.WebDriverManagerQA;

import org.testng.Assert;

public class AssertionImpl extends WebDriverManagerQA  {

	public void IgnoreCaseAndcompareTwoStrings(String str1, String str2) {
		
		Assert.assertEquals(str1.toLowerCase().trim(), str2.toLowerCase().trim());
	}

	public void compareTwoStrings(String str1, String str2) {
		
		Assert.assertEquals(str1.trim(), str2.trim());
		
	}

	public void verifyTextnotEquals(String str1, String str2) {
		
		Assert.assertNotEquals(str1.trim(), str2.trim());
	}

	public void TextisnotNULL(String ActualText) {
		Assert.assertNotNull(ActualText);
		
	}

	public void comparetwoStringsIgnorecase(boolean str1, boolean str2) {
		
		Assert.assertEquals(str1, str2);
	}

	
	
}
