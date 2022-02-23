package pageObject;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import core.Base;
import io.cucumber.java.en.Given;
import utilities.Utilities;

public class LaptopsNoteBooksPageObject extends Base{
	public LaptopsNoteBooksPageObject() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[text()='TEST ENVIRONMENT']")
	private WebElement textToValidate;
	
	public void retailPageValidate() {
		String text = textToValidate.getText();
		if(text.equalsIgnoreCase("TEST ENVIRONMENT")) {
			logger.info("'" + textToValidate + "'" + "text verified");
		}else
			logger.info("'" + textToValidate + "'" + "text not verified");
	}
	
	@FindBy(xpath = "//a[text()='Laptops & Notebooks']")
	private WebElement laptopsAndNotebooksTab;
	
	public void clickLaptopsAndNotebooksTab() {
		laptopsAndNotebooksTab.click();
	}
	@FindBy(xpath = "//a[text()='Show All Laptops & Notebooks']")
	private WebElement showAllLaptopsAndNotebooksBtn;
	
	public void clickShowAllLaptopsAndNotebooksOption() {
		showAllLaptopsAndNotebooksBtn.click();
	}
	@FindBy(linkText = "MacBook")
	private WebElement macbook;
	
	public void clickMacbookItem() {
		macbook.click();
	}
	@FindBy(id = "button-cart")
	private WebElement addToCartBtn;
	
	public void clickAddToCartBtn() {
		addToCartBtn.click();
	}
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement successMsg;
	
	public void verifySuccesMsgAddingMacbookToCart() throws IOException {
		
//		String expectedMssg = "Success: You have added MacBook to your shopping cart!";
//		String actualMessage = successMsg.getText();
//		try {
//			Assert.assertEquals(expectedMssg, actualMessage);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		Utilities.highlightelementRedBorder(successMsg);
//		Utilities.takeScreenShot("succesMsgAddingMacbookToCart");
		
		
		String text = successMsg.getText();
		if(text.equalsIgnoreCase("Success: You have added MacBook to your shopping cart!")) {
			logger.info("'" + successMsg + "'" + "text verified");
		}else
			logger.info("'" + successMsg + "'" + "text not verified");
		
		Utilities.highlightelementRedBorder(successMsg);
		Utilities.takeScreenShot("succesMsgAddingMacbookToCart");
		
	}
	
	@FindBy(xpath = "//span[@id='cart-total']")
	private WebElement itemQtyAndTotalCostInCart;
	
	public String displayCartItemAndCost(String qtyTotal) throws IOException {
		String qtyTotalAndCost = itemQtyAndTotalCostInCart.getText();
		Utilities.takeScreenShot("qtyTotalAndCost");
		Utilities.highlightelementRedBorder(itemQtyAndTotalCostInCart);
		return qtyTotalAndCost;
		
//		String expectedMssg = "1 tem(s)-602.00";
//		String actualMessage = itemQtyAndTotalCostInCart.getText();
//		try {
//			Assert.assertEquals(expectedMssg, actualMessage);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return qtyTotalAndCost;
	}
	
	public void clickCartOption() {
		itemQtyAndTotalCostInCart.click();
	}
	
	@FindBy(xpath = "//button[@title='Remove']")
	private WebElement redXbtn;
	
	public void clickRedXbtn() {
		redXbtn.click();
	}
	
	public String removeCartItem(String item) {
		String itemInCart = itemQtyAndTotalCostInCart.getText();
		Utilities.highlightelementRedBorder(itemQtyAndTotalCostInCart);
		return itemInCart;
	}
	
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[2]/div[1]/div[2]/div[2]/button[3]")
	private WebElement macbookCompareBtn;
	
	public void clickMacbookCompareIcon() {
		macbookCompareBtn.click();
	}
	
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[3]/div[1]/div[2]/div[2]/button[3]/i[1]")
	private WebElement macbookAirCompareBtn;
	
	public void clickMacbookAirCompareIcon() {
		macbookAirCompareBtn.click();
	}
	
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]")
	private WebElement succesMsgCompareMacAir;
	
	public void showSuccessMsgCompareMacAir() throws IOException {
		succesMsgCompareMacAir.getText();
		Utilities.highlightelementRedBorder(succesMsgCompareMacAir);
		Utilities.takeScreenShot("Mac Air compare success msg");
	
	}
	
	@FindBy(xpath = "//a[text()='product comparison']")
	private WebElement productComparisonLink;
	
	public void clickProductComparisonLink() {
		productComparisonLink.click();
	}
	
	@FindBy(xpath = "//h1[text()='Product Comparison']")
	private WebElement productCompareChart;
	
	public void showProductCompareChart() throws IOException {
		productCompareChart.isDisplayed();
		Utilities.takeScreenShot("productCompareChart");
	}
	
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[5]/div[1]/div[2]/div[2]/button[2]")
	private WebElement sonyVaioHeartIcon;
	
	public void clickSonyVaioHeartIcon() {
		sonyVaioHeartIcon.click();
	}
	
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]")
	private WebElement sonyVioWishLoginMsg;
	
	public void verifySonyVioWishLoginMsg() throws IOException {
		sonyVioWishLoginMsg.isDisplayed();
		Utilities.highlightelementRedBorder(sonyVioWishLoginMsg);
		Utilities.takeScreenShot("sony Vaio Wish Login Msg");
	}
	
	@FindBy(linkText = "MacBook Pro")
	private WebElement macBookPro;
	
	public void clickMacBookPro() {
		macBookPro.click();
	}
	
	@FindBy(xpath = "//h2[text()='$2,000.00']")
	private WebElement macBookProPrice;
	
	public String macBookProPrice(String macProPrice) throws IOException {
//		 macProPrice = macBookProPrice.getText();
//		 Utilities.highlightelementRedBorder(macBookProPrice);
//		return macProPrice;
		
		
		String expectedMssg = "$2,000.00";
		String actualMessage = macBookProPrice.getText();
		try {
			Assert.assertEquals(expectedMssg, actualMessage);
		} catch (Exception e) {
			e.printStackTrace();
		}
		Utilities.highlightelementRedBorder(macBookProPrice);
		Utilities.takeScreenShot("macBookProPrice");
		
		return macProPrice;
	}
	
}
