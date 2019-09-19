package com.atmecs.practodoctors.validatescripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.atmecs.practo.utils.ValidateTestResult;
import com.atmecs.practodoctors.testbase.InvokeBrowser;

public class ValidatePractoDoctors extends InvokeBrowser {
	static String Xpath;

	public static void ValidateSpecialities() {
		Xpath = read.readPropertiesFile("loc.field.validate.selectspeciality.dentist.xpath");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String specialityname = driver.findElement(By.xpath("loc.field.validate.selectspeciality.dentist.xpath")).getText();
		Assert.assertEquals(specialityname, "Dentist");
		//ValidateTestResult.validateData(specialityname, "Dentist", "Match found");
	}
}
