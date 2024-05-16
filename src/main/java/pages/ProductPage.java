package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage {

	WebDriver driver;
	WebDriverWait wait;
	
	
	@FindBy (xpath = "//a[@id='nav-cart']")
	private WebElement cartIcon;
	
	
	@FindBy (xpath ="//span[contains(text(),'Sign in to your account')]/parent::a")
	private WebElement signInbutton;
	
	public ProductPage(WebDriver driver) {
		
		this.driver = driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickOnCartIcon() {
		wait.until(ExpectedConditions.elementToBeClickable(cartIcon));
		cartIcon.click();
	}
	
	public void clickOnSignInButton() {
		wait.until(ExpectedConditions.elementToBeClickable(signInbutton));
		signInbutton.click();
	}
	
	
	public String naviToSignInPopUp() {
		
		String title =	driver.getTitle();
		
		return title;
		
	}
}
