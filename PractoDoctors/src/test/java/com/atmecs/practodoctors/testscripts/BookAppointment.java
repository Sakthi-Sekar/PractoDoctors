package com.atmecs.practodoctors.testscripts;

import java.io.IOException;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.atmecs.practo.helpers.ReadPropertiesFile;
import com.atmecs.practo.pages.PageActions;
import com.atmecs.practodoctors.testbase.InvokeBrowser;
import com.atmecs.practodoctors.validatescripts.ValidatePractoDoctors;

import com.atmecs.practodoctors.validatescripts.*;

public class BookAppointment extends InvokeBrowser {
	String Xpath;

	@Test(priority = 1)
	public void ClickOnDoctors() {

		Xpath = read.readPropertiesFile("loc.text.doctors.xpath");
		PageActions.ClickElement(driver, Xpath);
		log.info("Clicked on Doctors");
	}

	@Test(priority = 2)
	public void CLickOnDetect() {

		Xpath = read.readPropertiesFile("loc.btn.detect.xpath");
		PageActions.ClickElement(driver, Xpath);
		log.info("Clicked on Detect");

	}

	@Test(priority = 3)
	public void SelectSpecialities() {
		Xpath = read.readPropertiesFile("loc.field.selectdentist.xpath");
		PageActions.ClickElement(driver, Xpath);
		log.info("Selected Dentist");
		ValidatePractoDoctors.ValidateSpecialities();
		log.info("Match found-Dentist");
	}

	@Test(priority = 4)
	public void ClickOnAvailability() {
		Xpath = read.readPropertiesFile("loc.field.clickavailability.xpath");
		PageActions.ClickElement(driver, Xpath);
		log.info("Clicked on Availability");

	}

	@Test(priority = 5)
	public void SelectAvailability() {
		Xpath = read.readPropertiesFile("loc.select.availableweekend.xpath");
		PageActions.ClickElement(driver, Xpath);
		log.info("Selected Available coming weekend");

	}

	@Test(priority = 6)
	public void ClickRelevance() {
		Xpath = read.readPropertiesFile("loc.field.clickrelevance.xpath");
		PageActions.ClickElement(driver, Xpath);
		log.info("Clicked on Relevance");

	}

	@Test(priority = 7)
	public void SelectLowToHigh() {
		Xpath = read.readPropertiesFile("loc.select.lowtohigh.xpath");
		PageActions.ClickElement(driver, Xpath);
		log.info("Selected Low to high");

	}

	@Test(priority = 8)
	public void ClickOnBookAppointment() {
		Xpath = read.readPropertiesFile("loc.btn.bookappointment.xpath");
		PageActions.ClickElement(driver, Xpath);
		log.info("Clicked on book appointment");
	}

	@Test(priority = 9)
	public void ClickOnCallNow() {
		Xpath = read.readPropertiesFile("loc.btn.callnow.xpath");
		PageActions.ClickElement(driver, Xpath);
		log.info("Clicked on Call now button and displays the number to make call");
	}

}
