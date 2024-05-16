package pages;


import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	
	WebDriver driver;
	WebDriverWait wait;
	
	@FindBy (xpath = "//a[@id='nav-cart']")
	private WebElement cartIcon;
	
	@FindBy (xpath = "//input[@id='twotabsearchtextbox']")
	private	WebElement searchTextField;
	
	@FindBy (xpath = "//input[@id='nav-search-submit-button']")
	private WebElement searchButton;
	
	@FindBy (xpath ="//span[contains(text(),'Samsung Galaxy M14 5G (ICY Silver')]/parent::a")
	private WebElement samsungMobile;
	

	
	
	public HomePage(WebDriver driver) {
		
		this.driver = driver;	
		wait =	new WebDriverWait(driver, Duration.ofSeconds(20));
		PageFactory.initElements(driver, this);
		
		
	}
	
	
	public String fetchTitle() {
		
		String title = driver.getTitle();
		return title;	
		
	}
	
	
	public boolean isCartDisplayed() {
		
		boolean isGettingDisplayed	= cartIcon.isDisplayed();
		return isGettingDisplayed;
	}
	
	
	public void searchProduct(String product) {
		
		searchTextField.sendKeys(product);
		searchButton.click();
		
	}
	
	
	public void clickOnMobile() throws InterruptedException {
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		wait.until(ExpectedConditions.elementToBeClickable(samsungMobile));
		
		samsungMobile.click();
		Thread.sleep(2000);
	}
	
	
	public String naviToMobilePage() {
		
		String titleOfPage="";
		
		String p =	driver.getWindowHandle();
		
		Set<String> pc = driver.getWindowHandles();
		
		for (String  c : pc) {
			
			if(!c.equalsIgnoreCase(p)) {
				
				driver.switchTo().window(c);
				
				titleOfPage = driver.getTitle();
				
				driver.close();
				
			}
			
		}
		
		
		driver.switchTo().window(p);
		
		return titleOfPage;
		
		
	}
	
	
}
