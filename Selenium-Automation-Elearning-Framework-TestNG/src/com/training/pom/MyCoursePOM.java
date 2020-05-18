package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class MyCoursePOM {
private WebDriver driver; 
	
	public MyCoursePOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@class='btn btn-primary btn-large']")
		private WebElement Coursecatalog;
	
	@FindBy(xpath ="//li//a[contains(text(),'Edit profile')]")
		private WebElement EditProfile;
	
	@FindBy(xpath ="//a[contains(text(),'MediumSeleniumCourse')]")
		private WebElement NewCourse;
	
	@FindBy(xpath ="//a[contains(text(),'My courses')]")
		private WebElement Mycourses;
	
	@FindBy(xpath ="//img[@id='toolimage_19634']")
		private WebElement Project;
	
	@FindBy(xpath ="//div[@class='actions']//a//img")
		private WebElement CreateProject;
	
	@FindBy(xpath ="//input[@id='add_blog_blog_name']")
		private WebElement validTitletext;
	
	@FindBy(xpath ="//textarea[@id='add_blog_blog_subtitle']")
		private WebElement validsubtitletext;
	
	@FindBy(xpath ="//button[@id='add_blog_submit']")
		private WebElement saveproject;
	
	@FindBy(xpath ="//a[contains(text(),'e learning')]")
		private WebElement projectlink;
	
	@FindBy(xpath ="//a[2]//img[1]")
		private WebElement newtask;
	
	@FindBy(xpath ="//input[@id='add_post_title']")
		private WebElement newtasktitle;
	
	@FindBy(xpath ="//button[@id='add_post_save']")
		private WebElement savetask;
	
	@FindBy(xpath ="//a[3]//img[1]")
		private WebElement Rolemgmticon;
	
	@FindBy(xpath ="//a[contains(text(),'Add a new role')]")
		private WebElement Addnewrole;
	
	@FindBy(xpath ="//input[@name='task_name']")
		private WebElement validroletitle;
	
	@FindBy(xpath ="//button[@name='Submit']")
		private WebElement saverole;
	
	@FindBy(xpath ="//a[contains(text(),'Assign roles')]")
		private WebElement Assignrole;
	
	@FindBy(xpath ="//div[contains(text(),'Teacher RT')]")
		private WebElement selectuser;
	
	@FindBy(xpath = "//button[@id='assign_task_submit']")
		private WebElement Validteuser;
	
	@FindBy(xpath = "//a[4]//img[1]")
		private WebElement usermgmt;
	
	@FindBy(xpath ="//input[@type='checkbox']")
		private WebElement usercheckbox;
	
	@FindBy(xpath ="//img[@id='toolimage_19619']")
		private WebElement Test;
	
	@FindBy(xpath ="//a[contains(text(),'SampleTest')]")
		private WebElement Testlink;
	
	@FindBy(xpath = "//a[@class='btn btn-success btn-large']")
		private WebElement startTest;
	
	@FindBy(xpath = "//input[@id='choice-335-1']")
		private WebElement Answer;
	
	@FindBy(xpath = "//button[@name='save_now']")
		private WebElement EndTest;
	
	@FindBy(xpath = "//img[@id='toolimage_19629']")
		private WebElement Assessment;
	
	@FindBy(xpath ="//a[contains(text(),'AssessmentTest1')]")
		private WebElement Assessment1;
	
	@FindBy(xpath ="//a[@class='btn btn-success btn-large']")
		private WebElement StartAssessment;
	
	@FindBy(xpath ="//input[@id='choice-336-1']")
		private WebElement AssessmentAnswer;
	
	@FindBy(xpath = "//button[@name='save_now']")
		private WebElement EndAssessment;
	
	@FindBy(xpath ="//a[@class='btn btn-primary']")
		private WebElement register;
	
	@FindBy(xpath ="//div[contains(text(),'Saved.')]")
	 	private WebElement testvalidation;
	
	@FindBy(xpath ="//div[contains(text(),'Saved.')]")
		private WebElement assessmentvalidation;
	
	@FindBy(xpath ="\"//button[contains(text(),'Validate')]\"")
		private WebElement validateuser;
	
	
	public void clickEdit() {
		this.EditProfile.click();
	}
	public void ClickCousecatelog() {
		this.Coursecatalog.click();
	}
	public void clickNewCourse() {
		this.NewCourse.click();
	}
	public void clickMycourses() {
		this.Mycourses.click();
	}
	public void clickProject() {
		this.Project.click();
	}
	public void CreateNewProject() {
		this.CreateProject.click();
	}
	public void EntervalidTitle(String validTitletext) {
		this.validTitletext.clear();
		this.validTitletext.sendKeys(validTitletext);
	}
	public void EntervalidSubTitle(String validsubtitletext) {
		this.validsubtitletext.clear();
		this.validsubtitletext.sendKeys(validsubtitletext);
	}
	public void clicksaveproject() {
		this.saveproject.click();
	}
	public void clickprojectlink() {
		this.projectlink.click();
	}
	public void clicknewtask() {
		this.newtask.click();
	}
	public void Entertasktitle(String newtasktitle) {
		this.newtasktitle.clear();
		this.newtasktitle.sendKeys(newtasktitle);
	}
	public void clickSaveTask() {
		this.savetask.click();
	}
	public void ClickRoleManagement() {
		this.Rolemgmticon.click();
	}
	public void clickaddnewrole() {
		this.Addnewrole.click();
	}
	public void EnterRoleTitle(String validroletitle) {
		this.validroletitle.clear();
		this.validroletitle.sendKeys(validroletitle);
	}
	public void ClickSaveRole() {
		this.saverole.click();
	}
	public void clickAssignRole() {
		this.Assignrole.click();
	}
	public void selectusertoassign() {
		this.selectuser.click();
	}
	public void clickValidateUser() {
		this.Validteuser.click();
	}
	public void clickUserMgmt() {
		this.usermgmt.click();
	}
	public void selectusercheckbox() {
		this.usercheckbox.click();
	}
	public void clickonTest() {
		this.Test.click();
	}
	public void clickonTestlink() {
		this.Testlink.click();
	}
	public void clickStartTest() {
		this.startTest.click();
	}
	public void SelectAnswer() {
		this.Answer.click();
	}
	public void ClickEndTest() {
		this.EndTest.click();
	}
	public void ClickonAssessment() {
		this.Assessment.click();
	}
	public void clickonAssessment1Link() {
		this.Assessment1.click();
	}
	public void clickonStartAssessment() {
		this.StartAssessment.click();
	}
	public void SelectAssessmentAnswer() {
		this.AssessmentAnswer.click();
	}
	public void ClickEndAssessment() {
		this.EndAssessment.click();
	}	
	public void clickregister() {
		this.register.click();
	}
		public void savetestvalidation() {
		String act = testvalidation.getText();
		String exp = "Saved";
		Assert.assertEquals(act, exp);
		
}
	public void saveAssessmentvalidation() {
		String act = assessmentvalidation.getText();
		String exp = "Saved";
		Assert.assertEquals(act, exp);
	}
	public void uservalidate() {
		String act = validateuser.getText();
		String exp = "validate";
		Assert.assertEquals(act, exp);
	}
}

