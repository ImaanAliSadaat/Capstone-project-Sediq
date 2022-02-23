package pageObject;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.Utilities;

public class HomePageObjects extends Base{
	
	public HomePageObjects() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()='TEST ENVIRONMENT']")
	private WebElement textToValidate;
	@FindBy(xpath ="//div[@class='btn-group']//button[@class='btn btn-link dropdown-toggle']")
	private WebElement curruncyBtn;
	@FindBy(xpath ="//button[text()='€ Euro']")
	private WebElement euroBtn;
	@FindBy(xpath ="//strong[text()='€']")
	private WebElement euroSign;
	@FindBy(xpath = "//span[@id='cart-total']")
	private WebElement itemsInCartBtn;
	@FindBy(xpath = "//p[text()='Your shopping cart is empty!']")
	private WebElement shoppingCartText;
	
	public void homePageValidate() throws IOException {
		String text = textToValidate.getText();
		if(text.equalsIgnoreCase("TEST ENVIRONMENT")) {
			logger.info("'" + textToValidate + "'" + "text verified");
		}else {
			logger.info("'" + textToValidate + "'" + "text not verified");
		}
		Utilities.highlightelementRedBorder(textToValidate);
		Utilities.takeScreenShot("Homepage");
	}
	
	public void clickCurrancyBtn() {
		curruncyBtn.click();
	}
	
	public void clickEuro() {
		euroBtn.click();
	}
	
	public void euroSign() throws IOException {
		euroSign.getText();
		Utilities.highlightelementRedBorder(euroSign);
		Utilities.takeScreenShot("euroSign");
	}
	
	public void clickItemsInCartBtnn() {
		itemsInCartBtn.click();
	}
	//Scenario: User empty Shopping cart message displays 
	public void verifyShoppingCartEmptyMsg() throws IOException {
		String expectedMssg = "Your shopping cart is empty!";
		String actualMessage = shoppingCartText.getText();
		try {
			Assert.assertEquals(expectedMssg, actualMessage);
		} catch (Exception e) {
			e.printStackTrace();
		}
		Utilities.highlightelementRedBorder(shoppingCartText);
		Utilities.takeScreenShot("shopping Cart empty Text");
	}
}	