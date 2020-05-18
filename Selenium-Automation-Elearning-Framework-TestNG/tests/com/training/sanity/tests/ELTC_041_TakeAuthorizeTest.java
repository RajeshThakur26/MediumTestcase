package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.CoursesCatalogPOM;
import com.training.pom.ElearningLoginPOM;
import com.training.pom.MyCoursePOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class ELTC_041_TakeAuthorizeTest {

	private WebDriver driver;
	private String baseUrl;
	private ElearningLoginPOM elearningLoginPOM;
	private MyCoursePOM MyCoursePOM;
	private CoursesCatalogPOM CoursesCatalogPOM;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeTest
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeClass
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		elearningLoginPOM = new ElearningLoginPOM(driver);
		MyCoursePOM = new MyCoursePOM(driver);
		CoursesCatalogPOM = new CoursesCatalogPOM(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	
	@AfterClass
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}
	@Test(priority = 0)
	public void validLoginTest() throws Exception{
		elearningLoginPOM.sendUserName("student26");
		elearningLoginPOM.sendPassword("student26");
		elearningLoginPOM.clickLoginBtn();
		Thread.sleep(5000);
		
		screenShot.captureScreenShot("ELTC041_login");
	}
	
	@Test(priority = 1)
	public void Search() throws Exception{
		MyCoursePOM.clickMycourses();
		MyCoursePOM.clickNewCourse();
		MyCoursePOM.clickonTest();
		MyCoursePOM.clickonTestlink();
		MyCoursePOM.clickStartTest();
		MyCoursePOM.SelectAnswer();
		MyCoursePOM.ClickEndTest();
		MyCoursePOM.savetestvalidation();
		Thread.sleep(5000);
		screenShot.captureScreenShot("ELTC041_SampleTest");
	}
	
}
