package com.test.smoke;



import org.testng.Assert;
import org.testng.annotations.Test;

import com.baseTest.BaseTest;
import com.pages.AppsField;
import com.pages.FormPage;
import com.pages.NameField;
import com.pages.SkillField;
import com.pages.WebSiteField;
import com.pages.YearsField;

public class HomeTest extends BaseTest{
	@Test(priority=1)
	public void homePageVisibleTest() {
		FormPage fp = new FormPage(driver);
		Assert.assertTrue(fp.isHeaderVisible());
	}
	@Test(priority=2)
	public void resultCardVisibleTest() {
		FormPage fp = new FormPage(driver);
		Assert.assertTrue(fp.cardDisplayedAfterSubmit());
	}
	@Test(priority=3)
	public void allFieldsEnabledTest() {
		AppsField af = new AppsField(driver);
		NameField nf= new NameField(driver);
		SkillField sf= new SkillField(driver);
		WebSiteField wf = new WebSiteField(driver);
		YearsField yf = new YearsField(driver);
		Boolean flag = af.isEnabled() && nf.isEnabled() && sf.isEnabled() && wf.isEnabled() && yf.isEnabled();
		Assert.assertTrue(flag);
	}
	@Test(priority=4)
	public void neccessaryFieldsMandatoryTest() {
		AppsField af = new AppsField(driver);
		NameField nf= new NameField(driver);
		WebSiteField wf = new WebSiteField(driver);
		Boolean flag = af.isMandatory() && nf.isMandatory() && wf.isMandatory();
		Assert.assertTrue(flag);
	}
	@Test(priority=5)
	public void dropDownVisibleTest() {
		FormPage fp = new FormPage(driver);
		Assert.assertTrue(fp.isDropDownVisible());
	}
	@Test(priority=6)
	public void userImageTest() {
		FormPage fp = new FormPage(driver);
		Assert.assertTrue(fp.isUserImageVisible());
	}
}
