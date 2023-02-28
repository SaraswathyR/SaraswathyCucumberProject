package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class AdminPage {
	
	@FindBy(xpath="//span[text()='User Management ']")
	WebElement menu_UserManagement;
	
	@FindBy(xpath="//span[text()='Job ']")
	WebElement menu_Job;
	
	@FindBy(xpath="//span[text()='Organization ']")
	WebElement menu_Organization;
	
	@FindBy(xpath="//span[text()='Qualifications  ']")
	WebElement menu_Qualifications;
	
	@FindBy(xpath="//span[text()='Configuration  ']")
	WebElement menu_Configuration;
	
	@FindBy(xpath="//a[text()='Nationalities']")
	WebElement menu_Nationalities;
	
	@FindBy(xpath="//a[text()='Corporate Branding']")
	WebElement menu_CorporateBranding;
	
	@FindBy(xpath="//a[text()='Users']")
	WebElement link_UserManagement_User;
	
	@FindBy(xpath="//span[text()='Job ']/following-sibling::ul/li[1]")
	WebElement link__Job_JobTitles;
	
	@FindBy(xpath="//span[text()='Job ']/following-sibling::ul/li[2]")
	WebElement link_Job_PayGrades;
	
	@FindBy(xpath="//span[text()='Job ']/following-sibling::ul/li[3]")
	WebElement link_Job_EmploymentStatus;
	
	@FindBy(xpath="//span[text()='Job ']/following-sibling::ul/li[4]")
	WebElement link_Job_JobCategories;
	
	@FindBy(xpath="//span[text()='Job ']/following-sibling::ul/li[5]")
	WebElement link_Job_WorkShifts;
	
	@FindBy(xpath="//span[text()='Organization ']/following-sibling::ul/li[1]")
	WebElement link__Organization_GeneralInformation;
	
	@FindBy(xpath="//span[text()='Organization ']/following-sibling::ul/li[2]']")
	WebElement link__Organization_Locations;
	
	@FindBy(xpath="//span[text()='Organization ']/following-sibling::ul/li[3]")
	WebElement link_Organization_Structure;
	
	@FindBy(xpath="//a[text()='Skills']")
	WebElement link_Qualifications_Skills;
	
	@FindBy(xpath="//a[text()='Education']")
	WebElement link_Qualifications_Education;
	
	@FindBy(xpath="//a[text()='Licenses']")
	WebElement link_Qualifications_Licenses;
	
	@FindBy(xpath="//a[text()='Languages']")
	WebElement link_Qualifications_Languages;
	
	@FindBy(xpath="//a[text()='Memberships']")
	WebElement link_Qualifications_Memberships;
	
	@FindBy(xpath="//a[text()='Email Configuration']")
	WebElement link_Configuration_EmailConfiguration;
	
	@FindBy(xpath="//a[text()='Email Subscriptions']")
	WebElement link_Configuration_EmailSubscriptions;
	
	@FindBy(xpath="//a[text()='Localization']")
	WebElement link_Configuration_Localization;
	
	@FindBy(xpath="//a[text()='Language Packages']")
	WebElement link_Configuration_LanguagePackages;
	
	@FindBy(xpath="//a[text()='Modules']")
	WebElement link_Configuration_Modules;
	
	@FindBy(xpath="//div[@class='oxd-table-filter-header-title']//h5")
	WebElement text_pageSubtitle_SystemUsers;
	
	@FindBy(xpath="//label[text()='Username']")
	WebElement label_UserName;
	
	@FindBy(xpath="//label[text()='User Role']")
	WebElement label_UserRole;
	
	@FindBy(xpath="//label[text()='Employee Name']")
	WebElement label_EmployeeName;
	
	@FindBy(xpath="//label[text()='Status']")
	WebElement label_Status;
	
	@FindBy(xpath="//input[@class='oxd-input oxd-input--active']//preceding::label']")
	WebElement Textbox_box_Username;
	
	@FindBy(xpath="//input[@placeholder='Type for hints...']")
	WebElement Textbox_box_Employeename;
	
	@FindBy(xpath="//div[text()='-- Select --']")
	WebElement dropdown_text_UserRoleSelect;
	
	@FindBy(xpath="//div[text()='Admin' and @tabindex='0']")
	WebElement dropdown_text_UserRoleAdmin;
	
	@FindBy(xpath="//div[text()='ESS' and @tabindex='0']")
	WebElement dropdown_text_UserRoleESS;
	
	@FindBy(xpath="//div[text()='Enabled' and @tabindex='0']")
	WebElement dropdown_text_StatusEnabled;
	
	@FindBy(xpath="//div[text()='Disabled' and @tabindex='0']")
	WebElement dropdown_text_StatusDisabled;
	
	@FindBy(xpath="//button[@type='button' and text()=' Reset ']")
	WebElement button_Reset;
	
	@FindBy(xpath="//button[@type='submit' and text()=' Search ']")
	WebElement button_Search;
	
	@FindBy(xpath="//button[@type=' Add ']")
	WebElement button_Add;
	
	//div[@role='columnheader']/following-sibling::div
	
	@FindBy(xpath="//div[@role='columnheader' and text()='Username']")
	WebElement textbox_AdminUserName;
	
	@FindBy(xpath="//div[@role='columnheader' and text()='User Role']")
	WebElement textbox_AdminUserRole;
	
	@FindBy(xpath="//div[@role='columnheader' and text()='Employee Name']")
	WebElement textbox_AdminEmployeeName;
	
	@FindBy(xpath="//div[@role='columnheader' and text()='Status']")
	WebElement textbox_AdminStatus;
	
	@FindBy(xpath="//div[@role='columnheader' and text()='Actions']")
	WebElement textbox_AdminActions;
	
	
	
	
	
	
	
	
	
	
	
	public void menuTileinUserManagementPage(String menuTitle) {
		switch(menuTitle) {
		case"UserManagement": menu_UserManagement.click();
		break;
		case"Job": menu_Job.click();
		break;
		case"Organization": menu_Organization.click();
		break;
		case"Qualifications": menu_Qualifications.click();
		break;
		case"Configurations": menu_Configuration.click();
		break;
		case"Nationalities": menu_Nationalities.click();
		break;
		case"CorporateBranding": menu_CorporateBranding.click();
		break;
		}
	}
	
	public void validateLinksRouting(String linkName) {
		switch(linkName) {
		case"UserManagement": 
		}
		
	}

	public static void main(String[] args) {
	

	}

}
