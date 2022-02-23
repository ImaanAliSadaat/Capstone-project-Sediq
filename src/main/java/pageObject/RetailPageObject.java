package pageObject;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.Utilities;

public class RetailPageObject extends Base{
	
	public RetailPageObject() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[text()='My Account']")
	private WebElement myAccount;
	
	public void clickOnMyAccount() {
		myAccount.click();
	}
	
	@FindBy(xpath = "//a[text()='Login']")
	private WebElement login;
	
	public void clickOnLogin() {
		login.click();
	}
	
	@FindBy(id = "input-email")
	private WebElement emailTextField;
	@FindBy(id = "input-password")
	private WebElement passwordTextField;
	
	public void enterUserNameAndPass(String userName, String Pass) {
		emailTextField.sendKeys("khan6@gmail.com");
		passwordTextField.sendKeys("12345");
	}
	
	@FindBy(xpath = "//input[@value='Login']")
	private WebElement loginbtn;
	
	public void clickLoginBtn() {
		loginbtn.click();
	}
	
	@FindBy(xpath = "//h2['My Account'][1]")
	private WebElement myAccountDash; 
	@FindBy(xpath = "//h2[text()='My Orders']")
	private WebElement myOrderDash;
	
	public void verifyuserlogedIn() throws IOException {
		myAccountDash.isDisplayed();
		myOrderDash.isDisplayed();
		Utilities.highlightelementRedBorder(myAccountDash);
		Utilities.highlightelementRedBorder(myOrderDash);
		Utilities.takeScreenShot("User is in retail page");
	}
	
	@FindBy(xpath = "//a[text()='Register for an affiliate account']")
	private WebElement registerForAnAffiliateAcountLink;
	
	public void clickRegisterForAnAffiliateAcountLink() {
		registerForAnAffiliateAcountLink.click();
	}
	
	@FindBy(id = "input-company")
	private WebElement companyTextField;
	
	public void enterCompanyName(String companyName) {
		companyTextField.sendKeys(companyName);
	}
	
	@FindBy(id = "input-website")
	private WebElement websiteTextField;
	
	public void enterWebsiteName(String websiteName) {
		websiteTextField.sendKeys(websiteName);
	}
	
	@FindBy(id = "input-tax")
	private WebElement taxIdTextField;
	
	public void enterTaxID(String taxId) {
		taxIdTextField.sendKeys(taxId);
	}
	
//	@FindBy(xpath = "//input[@checked='checked']")
//	private WebElement chequeRadioButton;
//	
//	public void verifyChequeRadioButtonIsSelected() {
//		chequeRadioButton.click();
//		boolean isChequeRadioButtonSelected = chequeRadioButton.isSelected();
//		boolean expectedBlm = true;
//		try {
//			Assert.assertEquals(expectedBlm, isChequeRadioButtonSelected);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//	
	@FindBy(id = "input-cheque")
	private WebElement chequePayeeNameTextField;
	
	public void enterChequePayeeName(String chequePayeeName) {
		chequePayeeNameTextField.sendKeys(chequePayeeName);
	}
	
	@FindBy(xpath = "//input[@name='agree']")
	private WebElement agreeCheckBox;
	
	public void clickAgreeCheckBox() {
		agreeCheckBox.click();
	}
	
	@FindBy(xpath = "//input[@class='btn btn-primary']")
	private WebElement continueBtn;
	
	public void clickOnContinueButton(){
		continueBtn.click();
	}
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement affiliateAccSuccessMessg;
	
	public void verifyAffiliateAccSuccessMessage() throws IOException {
		String expectedMssg = "Success: Your account has been successfully updated.";
		String actualMessage = affiliateAccSuccessMessg.getText();
		try {
			Assert.assertEquals(expectedMssg, actualMessage);
		} catch (Exception e) {
			e.printStackTrace();
		}
		Utilities.highlightelementRedBorder(affiliateAccSuccessMessg);
		Utilities.takeScreenShot("AffiliateAccSuccessMessg");
	}
	
	@FindBy(xpath = "//a[text()='Edit your affiliate information']")
	
	private WebElement editYourAffiliateInfoLink;
	
	public void clickEditYourAffiliateInfoLink() throws InterruptedException {
		Thread.sleep(2000);
		editYourAffiliateInfoLink.click();
	}
	
	@FindBy(xpath = "//input[@value='bank']")
	private WebElement bankTransferRadioBtn;
	
	public void clickBankTransferRadioBtn() {
		bankTransferRadioBtn.click();
	}
	
	@FindBy(id = "input-bank-name")
	private WebElement bankNameTextField;
	
	public void enterBankNameTextField(String bankName) {
		bankNameTextField.sendKeys(bankName);
	}
	
	@FindBy(id = "input-bank-branch-number")
	private WebElement abaNumTextField;
	
	public void enterAbaNumTextField(String abaNum) {
		abaNumTextField.sendKeys(abaNum);
	}
	
	@FindBy(id = "input-bank-swift-code")
	private WebElement swifCodTextField;
	
	public void enterSwifCodTextField(String swiftCode) {
		swifCodTextField.sendKeys(swiftCode);
	}
	
	@FindBy(id = "input-bank-account-name")
	private WebElement accNameTextField;
	
	public void eneterAccNameTextField(String accountName) {
		accNameTextField.sendKeys(accountName);
	}
	
	@FindBy(id = "input-bank-account-number")
	private WebElement accNumTextField;
	
	public void enterAccNumTextField(String accountNumber) {
		accNumTextField.sendKeys(accountNumber);
	}
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement affiliateEditAccSuccessMessg;
	
	public void verifyAffiliateEditAccSuccessMessage() throws IOException {
		String expectedMssg = "Success: Your account has been successfully updated.";
		String actualMessage = affiliateAccSuccessMessg.getText();
		try {
			Assert.assertEquals(expectedMssg, actualMessage);
		} catch (Exception e) {
			e.printStackTrace();
		}
		Utilities.highlightelementRedBorder(affiliateAccSuccessMessg);
		Utilities.takeScreenShot("AffiliateAccSuccessMessg");
	}
	
	@FindBy(xpath = "//a[text()='Edit your account information']")
	private WebElement editYourAccInfoLink;
	
	public void clickEditYourAccInfoLink() {
		editYourAccInfoLink.click();
	}
	
	@FindBy(id = "input-firstname")
	private WebElement firstNameTextField;
	
	public void enterFirstName(String firstname) throws InterruptedException {
		firstNameTextField.clear();
		Thread.sleep(2000);
		firstNameTextField.sendKeys(firstname);
	}
	
	@FindBy(id = "input-lastname")
	private WebElement lastNameTextField;
	
	public void enterLastName(String lastName) throws InterruptedException {
		lastNameTextField.clear();
		Thread.sleep(2000);
		lastNameTextField.sendKeys(lastName);
	}
	
	@FindBy(id = "input-email")
	private WebElement emailField;
	
	public void enterEmail(String email) throws InterruptedException {
		emailField.clear();
		Thread.sleep(2000);
		emailField.sendKeys(email);
	}
	
	@FindBy(id = "input-telephone")
	private WebElement telephoneField;
	
	public void enterTelephone(String telephone) throws InterruptedException {
		telephoneField.clear();
		Thread.sleep(2000);
		telephoneField.sendKeys(telephone);
	}
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement modifyAccSuccessMessg;
	
	public void verifyAffiliateModifyAccSuccessMessage() throws IOException {
		String expectedMssg = "Success: Your account has been successfully updated.";
		String actualMessage = modifyAccSuccessMessg.getText();
		try {
			Assert.assertEquals(expectedMssg, actualMessage);
		} catch (Exception e) {
			e.printStackTrace();
		}
		Utilities.highlightelementRedBorder(modifyAccSuccessMessg);
		Utilities.takeScreenShot("modifyAccSuccessMessg");
	}




	


	
	

	

	
	
	
	
	

}
