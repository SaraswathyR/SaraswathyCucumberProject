package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import generic.Base;

public class BuzzPage  {
	
	WebDriver driver;
	Base base = new Base();
	
	
	public BuzzPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
}
