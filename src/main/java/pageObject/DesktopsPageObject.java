package pageObject;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import core.Base;
import io.cucumber.datatable.DataTable;
import junit.framework.Assert;
import utilities.Utilities;

public class DesktopsPageObject extends Base {
	
	public DesktopsPageObject() {
		PageFactory.initElements(driver, this);
	}
//	@FindBy(xpath = "//a[text()='TEST ENVIRONMENT']")
//	private WebElement textToValidate;
//	
//	public void homePageValidate() throws IOException {
//		String text = textToValidate.getText();
//		if(text.equalsIgnoreCase("TEST ENVIRONMENT")) {
//			logger.info("'" + textToValidate + "'" + "text verified");
//		}else {
//			logger.info("'" + textToValidate + "'" + "text not verified");
//		}
//		Utilities.highlightelementRedBorder(textToValidate);
//		Utilities.takeScreenShot("Test Environment");
//	}
	
	@FindBy(xpath = "//a[text()='Desktops']")
	private WebElement desktopsTab;
	
	public void clickDestopsTab() {
		desktopsTab.click();
	}
	
	@FindBy(className = "see-all")
	private WebElement showAllDesktopsBtn;
	
	public void clickShowAllDesktops() {
		showAllDesktopsBtn.click();
	}
	
	@FindBy(tagName = "div")
	private List<WebElement> allElmenentOnDesktop;

	public void verifyAllelementsInDesktop() throws IOException {
		List<WebElement> list = allElmenentOnDesktop;
		for (WebElement element:list) {
			String elementList = element.getText();
			logger.info(elementList);
		}
		Utilities.takeScreenShot("All Elements on Desktop");
	}
	
	@FindBy(xpath = "(//span[text()='Add to Cart'])[position()=3]")
	private WebElement hpLp3065AddToCart;
	
	public void clickHpLp3065AddToCartOption() {
		hpLp3065AddToCart.click();
	}
	
	@FindBy(id = "input-quantity")
	private WebElement qtyTextField;
	
	public void select1QtyHPLP3065() {
		qtyTextField.clear();
		qtyTextField.sendKeys("1");
	}
	
	@FindBy(id = "button-cart")
	private WebElement addToCartBtn;
	
	public void addToCartBtn() {
		addToCartBtn.click();
	}
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement successMsgForAddingHpLp3065;
	
	public void verifySuccessMsgForAddingHpLp3065(String msg) throws IOException{
		String successMsg = successMsgForAddingHpLp3065.getText();
		if(successMsg.equalsIgnoreCase("Success: You have added HP LP3065 to your shopping cart!")) {
			logger.info("'" + successMsgForAddingHpLp3065 + "'" + "text verified");
		}else {
			logger.info("'" + successMsgForAddingHpLp3065 + "'" + "text not verified");
		}
		Utilities.highlightelementRedBorder(successMsgForAddingHpLp3065);
		Utilities.takeScreenShot("Success message for adding HPLP 3065 to cart");
	}
	
// Scenario: User add Canon EOS 5D from Desktops tab to the cart
	
	@FindBy(xpath = "(//span[text()='Add to Cart'])[position()=2]")
	private WebElement canonEOS5DAddToCartOption;
	
	public void clickCanonEOS5DAddToCartOption() {
		canonEOS5DAddToCartOption.click();
	}
	
	@FindBy(id = "input-option226")
	private WebElement selectOption;
	@FindBy(xpath = "//select[@id='input-option226']//option[@value='15']")
	private WebElement dropDownred;
	
	public void selectRedColor() {
		selectOption.click();
		dropDownred.click();
		Utilities.highlightelementRedBorder(selectOption);
		Utilities.highlightelementRedBorder(dropDownred);
	}
	
	@FindBy(id = "input-quantity")
	private WebElement canonQtySearchField;
	
	public void select1CanonQtyTextField(){
		canonQtySearchField.clear();
		canonQtySearchField.sendKeys("1");
		Utilities.highlightelementRedBorder(canonQtySearchField);
	}
	
	@FindBy(id = "button-cart")
	private WebElement canonAddToCartBtn;
	
	public void clickCanonAddToCartBtn() {
		canonAddToCartBtn.click();
	}
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement successMsgAddingCanon;
	
	public void verifySuccessMsgAddingCanonToCart(String canonMsg) throws IOException {
		String successMsg = successMsgAddingCanon.getText();
		if(successMsg.equalsIgnoreCase("Success: You have added Canon EOS 5D to your shopping cart!")) {
			logger.info("'" + successMsgAddingCanon + "'" + "text verified");
		}else {
			logger.info("'" + successMsgAddingCanon + "'" + "text not verified");
		}
		Utilities.highlightelementRedBorder(successMsgAddingCanon);
		Utilities.takeScreenShot("addingCanonSuccessMsg");
	}
	
	//Scenario: User add a review to Canon EOS 5D item in Desktops tab
	
	@FindBy(xpath = "//a[text()='Canon EOS 5D Camera']")
	private WebElement canonEOS5DBtn;
	
	public void clickcanonEOS5DItem() {
		canonEOS5DBtn.click();
	}
	
	@FindBy(linkText = "Write a review")
	private WebElement writeAReviewLink;
	
	public void clickWriteAReviewLink() {
		writeAReviewLink.click();
	}
	
	@FindBy(id = "input-name")
	private WebElement yourNameInReviewField;
	public void enterYourName(String name) {
		yourNameInReviewField.sendKeys(name);
	}
	@FindBy(id = "input-review")
	private WebElement yourReviewField;
	public void fillYourReveiwField(String review) {
		yourReviewField.sendKeys(review);
	}
	@FindBy(xpath = "//input[@type='radio'][5]")
	private WebElement fiveStarReview;
	
	public void clickFiveStar() {
		fiveStarReview.click();
	}
	
	@FindBy(id = "button-review")
	private WebElement reviewContinueBtn;
	
	public void clickReviewBtn() {
		reviewContinueBtn.click();
	}
	
	@FindBy(xpath = "//button[@id='button-review']")
	private WebElement continueBtn;
	
	public void clickOnContinueBtn() {
		continueBtn.click();
	}
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement reviewMsg;
	
	@SuppressWarnings("deprecation")
	public void verifyReviewMsg(String string) throws IOException {
		String actualText = reviewMsg.getText();
		String expectedText = "Thank you for your review. It has been submitted to the webmaster for approval.";
		Assert.assertEquals(actualText, expectedText);
		Utilities.highlightelementRedBorder(reviewMsg);
		Utilities.takeScreenShot("Review Msg");
	}
}
