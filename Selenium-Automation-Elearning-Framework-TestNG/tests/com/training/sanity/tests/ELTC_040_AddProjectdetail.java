package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.CoursesCatalogPOM;
import com.training.pom.ElearningLoginPOM;
import com.training.pom.MyCoursePOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class ELTC_040_AddProjectdetail {

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
		elearningLoginPOM.sendUserName("koolguru");
		elearningLoginPOM.sendPassword("koolguru");
		elearningLoginPOM.clickLoginBtn();
		Thread.sleep(5000);
		
		screenShot.captureScreenShot("ELTC010_login");
	}
	@Test(priority = 1)
	public void Coursecatalog() throws Exception{
		MyCoursePOM.clickMycourses();
		MyCoursePOM.clickNewCourse();
		MyCoursePOM.clickProject();
		MyCoursePOM.CreateNewProject();
		MyCoursePOM.EntervalidTitle("e learning");
		MyCoursePOM.EntervalidSubTitle("e learning project");
		MyCoursePOM.clicksaveproject();
		MyCoursePOM.clickprojectlink();
		MyCoursePOM.clicknewtask();
		MyCoursePOM.Entertasktitle("design");
		MyCoursePOM.clickSaveTask();
		MyCoursePOM.ClickRoleManagement();
		MyCoursePOM.clickaddnewrole();
		MyCoursePOM.EnterRoleTitle("developer");
		MyCoursePOM.ClickSaveRole();
		MyCoursePOM.clickAssignRole();
		MyCoursePOM.selectusertoassign();
		MyCoursePOM.clickValidateUser();
		MyCoursePOM.clickUserMgmt();
		MyCoursePOM.selectusercheckbox();
		MyCoursePOM.clickregister();
		MyCoursePOM.uservalidate();
		screenShot.captureScreenShot("ELTC040_validate");
	}
}
