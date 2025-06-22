package com.test.regression;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.baseTest.BaseTest;
import com.pages.AppsField;
import com.pages.NameField;
import com.pages.SkillField;
import com.pages.WebSiteField;

public class ValidationTest extends BaseTest{
	@Test(priority=1)
	public void nameValidation() {
		NameField nf = new NameField(driver);
		Assert.assertTrue(nf.validateNamewithString(),"Name box validation failed");
		Assert.assertFalse(nf.validateNamewithNumbers(),"Name box validation failed on Numbers");
		Assert.assertFalse(nf.withSpecialCharacters(),"Name box validation failed on special Characters");
	}
	@Test(priority=2)
	public void skillValidation() {
		SkillField sf = new SkillField(driver);
		Assert.assertTrue(sf.validateSkillWithString(),"Skill Field validation failed");
		Assert.assertFalse(sf.validateSkillWithNumber(),"Skill Field validation failed on Number");
		Assert.assertFalse(sf.validateSkillWithSpecialCharacters(),"Skill Field validation failed on Special Characters");
	}
	@Test(priority=3)
	public void websiteValidation() {
		WebSiteField wf = new WebSiteField(driver);
		Assert.assertTrue(wf.validateWebsiteWithNumbers(),"Website Field validation failed on numbers");
		Assert.assertFalse(wf.validateWebsiteWithStrings(),"Website Field validation failed on strings");
		Assert.assertFalse(wf.validateWebsiteWithNegativeNumbers(),"Website Field validation failed on negative numbers");
		Assert.assertFalse(wf.validateWebsiteWithSpecialCharacters(),"Website Field validation failed on special characters");
	}
	@Test(priority=4)
	public void appsValidation() {
		AppsField af = new AppsField(driver);
		Assert.assertTrue(af.validateAppWithNumbers(),"Apps Field validation failed on numbers");
		Assert.assertFalse(af.validateAppWithStrings(),"Apps Field validation failed on strings");
		Assert.assertFalse(af.validateAppWithNegativeNumbers(),"Apps Field validation failed on negative numbers");
		Assert.assertFalse(af.validateAppWithSpecialCharacters(),"Website Field validation failed on special characters");
	}
}
