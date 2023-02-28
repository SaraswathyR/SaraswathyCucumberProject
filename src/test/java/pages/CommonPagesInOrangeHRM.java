package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CommonPagesInOrangeHRM {

	private WebDriver driver;

	public CommonPagesInOrangeHRM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@placeholder='Search']")
	WebElement link_Search;

	@FindBy(xpath = "//span[text()='Admin']")
	WebElement link_Admin;

	@FindBy(xpath = "//span[text()='PIM']")
	WebElement link_PIM;

	@FindBy(xpath = "//span[text()='Leave']")
	WebElement link_Leave;

	@FindBy(xpath = "//span[text()='Time']")
	WebElement link_Time;

	@FindBy(xpath = "//span[text()='Recruitment']")
	WebElement link_Recruitment;

	@FindBy(xpath = "//span[text()='My Info']")
	WebElement link_MyInfo;

	@FindBy(xpath = "//span[text()='Performance']")
	WebElement link_Performance;

	@FindBy(xpath = "//span[text()='Dashboard']")
	WebElement link_Dashboard;

	@FindBy(xpath = "//span[text()='Directory']")
	WebElement link_Directory;

	@FindBy(xpath = "//span[text()='Maintenance']")
	WebElement link_Maintenance;

	@FindBy(xpath = "//span[text()='Buzz']")
	WebElement link_Buzz;

	@FindBy(xpath = "//p[@class='oxd-userdropdown-name']")
	WebElement text_NameDropdown;

	@FindBy(xpath = "//a[text()='About']")
	WebElement link_About;

	@FindBy(xpath = "//a[text()='Support']")
	WebElement link_Support;

	@FindBy(xpath = "//a[text()='Change Password']")
	WebElement link_ChangePassword;

	@FindBy(xpath = "//a[text()='Logout']")
	WebElement link_Logout;

	@FindBy(xpath = "//i[@class='oxd-icon bi-chevron-left']")
	WebElement class_maximize;

	@FindBy(xpath = "//h6[text()='Dashboard']")
	WebElement text_LandingPageTitle;

	@FindBy(xpath = "//h6[text()='Administrator Access']")
	WebElement text_AdministratorAccess;

	@FindBy(xpath = "//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")
	WebElement text_Admin;

	@FindBy(xpath = "//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")
	WebElement text_PIM;

	@FindBy(xpath = "//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")
	WebElement text_Leave;

	@FindBy(xpath = "//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")
	WebElement text_Time;

	@FindBy(xpath = "//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")
	WebElement text_Recruitment;

	@FindBy(xpath = "//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")
	WebElement text_MyInfo;

	@FindBy(xpath = "//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")
	WebElement text_Performance;

	@FindBy(xpath = "//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")
	WebElement text_Dashboard;

	@FindBy(xpath = "//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")
	WebElement text_Directory;

	@FindBy(xpath = "//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")
	WebElement text_Buzz;

	public void validateLandingPage() {
		Assert.assertEquals(text_LandingPageTitle.getText(), "Dashboard");
	}

	public void gotoAnyPagesInOrangeHRM(String pageName) {
		switch (pageName) {
		case "Admin":
			link_Admin.click();
			break;
		case "PIM":
			link_PIM.click();
			break;
		case "Leave":
			link_Leave.click();
			break;
		case "Time":
			link_Leave.click();
			break;
		case "Recruitment":
			link_Recruitment.click();
			break;
		case "MyInfo":
			link_MyInfo.click();
			break;
		case "Performance":
			link_Performance.click();
			break;
		case "Dashboard":
			link_Dashboard.click();
			break;
		case "Directory":
			link_Directory.click();
			break;
		case "Maintenance":
			link_Maintenance.click();
			break;
		case "Buzz":
			link_Buzz.click();
			break;
		}
	}

	public void validateAnyPagesInOrangeHRM(String pageName) {
		switch (pageName) {
		case "Admin":
			Assert.assertEquals(link_Admin.getText(), text_Admin.getText());
			break;
		case "PIM":
			Assert.assertEquals(link_PIM.getText(), text_PIM.getText());
			break;
		case "Leave":
			Assert.assertEquals(link_Leave.getText(), text_Leave.getText());
			break;
		case "Time":
			Assert.assertEquals(link_Time.getText(), text_Time.getText());
			break;
		case "Recruitment":
			Assert.assertEquals(link_Recruitment.getText(), text_Recruitment.getText());
			break;
		case "MyInfo":
			Assert.assertEquals(link_MyInfo.getText(), text_MyInfo.getText());
			break;
		case "Performance":
			Assert.assertEquals(link_Performance.getText(), text_Performance.getText());
			break;
		case "Dashboard":
			Assert.assertEquals(link_Dashboard.getText(), text_Dashboard.getText());
			break;
		case "Directory":
			Assert.assertEquals(link_Directory.getText(), text_Directory.getText());
			break;
		case "Maintenance":
			Assert.assertEquals(link_Maintenance.getText(), text_AdministratorAccess.getText());
			break;
		case "Buzz":
			Assert.assertEquals(link_Buzz.getText(), text_Buzz.getText());
			break;
		}
	}

	public static void main(String[] args) {

	}

}
