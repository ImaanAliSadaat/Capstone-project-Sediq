package stepDefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import pageObject.RetailPageObject;

public class RetailPageSteps extends Base{
	
	RetailPageObject retail = new RetailPageObject();
	
	@Given("User click  on MyAccount")
	public void user_click_on_my_account() {
	    retail.clickOnMyAccount();
	    logger.info("User clicked My Account successfully!");
	}

	@When("User click on Login")
	public void user_click_on_login() {
	    retail.clickOnLogin();
	    logger.info("User clicked on login successfully!");
	}

	@When("User enter username {string} and password {string}")
	public void user_enter_username_and_password(String userName, String password) {
	   retail.enterUserNameAndPass(userName, password);
	   logger.info("User entered username and password successfully!");
	}

	@When("User click on Login button")
	public void user_click_on_login_button() {
	    retail.clickLoginBtn();
	    logger.info("User clicked on login button successfully!");
	}

	@Then("User should be logged in to MyAccount dashboard")
	public void user_should_be_logged_in_to_my_account_dashboard() throws IOException {
	    retail.verifyuserlogedIn();
	    logger.info("User loged in and on retail page successfully!");
	}

	@When("User click on Register for an Affiliate Account link")
	public void user_click_on_register_for_an_affiliate_account_link() {
	    retail.clickRegisterForAnAffiliateAcountLink();
	    logger.info("User clicked on register for affiliate account link successfully!");
	}

	@When("User fill affiliate form with below information")
	public void user_fill_affiliate_form_with_below_information(DataTable dataTable) {
		List<Map<String, String>> editAffilate = dataTable.asMaps(String.class, String.class);
		retail.enterCompanyName(editAffilate.get(0).get("company"));
		retail.enterWebsiteName(editAffilate.get(0).get("website"));
		retail.enterTaxID(editAffilate.get(0).get("taxID"));
		retail.enterChequePayeeName(editAffilate.get(0).get("paymentMethod"));
		//retail.verifyChequeRadioButtonIsSelected();
		logger.info("User filled affiliate form information successfully!");
	}

	@When("User check on About us check box")
	public void user_check_on_about_us_check_box() {
		retail.clickAgreeCheckBox();
	}
	
//	@When("User click on Continue button one")
//	public void user_click_on_continue_button_one() {
//	   try {
//		retail.clickOnContinueButton();
//	} catch (Exception e) {
//		e.printStackTrace();
//	}
//	   logger.info("User clicked on continue button successfully!");
//	}
	@When("User click on Continue button one")
	public void user_click_on_continue_button_one() {
		retail.clickOnContinueButton();
	}

	
	@Then("User should see a success message")
	public void user_should_see_a_success_message() throws IOException {
	    retail.verifyAffiliateAccSuccessMessage();
	    logger.info("Affiliate message displayed successfully!");
	}

	@When("User click on Edit your affiliate informationlink")
	public void user_click_on_edit_your_affiliate_informationlink() throws InterruptedException {
	    retail.clickEditYourAffiliateInfoLink();
	    logger.info("Edit your affiliate information link clicked successfully!");;
	}

	@When("user click on Bank Transfer radio button")
	public void user_click_on_bank_transfer_radio_button() {
	    retail.clickBankTransferRadioBtn();
	    logger.info("User clicked Bank transfer radio button successfully!");
	}

	@When("User fill Bank information with below information")
	public void user_fill_bank_information_with_below_information(DataTable dataTable) {
		List<Map<String, String>> bankInfo = dataTable.asMaps(String.class, String.class);
		retail.enterBankNameTextField(bankInfo.get(0).get("bankName"));
		retail.enterAbaNumTextField(bankInfo.get(0).get("abaNumber"));
		retail.enterSwifCodTextField(bankInfo.get(0).get("swiftCode"));
		retail.eneterAccNameTextField(bankInfo.get(0).get("accountName"));
		retail.enterAccNumTextField(bankInfo.get(0).get("accountNumber"));
		logger.info("User filled bank information successfully!");
	}
	
	
	@Then("User should see a success message at the end")
	public void user_should_see_a_success_message_at_the_end() throws IOException {
	    retail.verifyAffiliateEditAccSuccessMessage();
	    logger.info("Affiliate information changed from Cheque payment method to Bank Transfer successfully! ");
	}

	@When("User click on ‘Edit your account information’ link")
	public void user_click_on_edit_your_account_information_link() {
	    retail.clickEditYourAccInfoLink();
	    logger.info("User clicked on edit your account info link successfully!");
	}

	@When("User modify below information")
	public void user_modify_below_information(DataTable dataTable) throws InterruptedException {
		List<Map<String, String>> editAccInfo = dataTable.asMaps(String.class, String.class);
		retail.enterFirstName(editAccInfo.get(0).get("firstname"));
		retail.enterLastName(editAccInfo.get(0).get("lastName"));
		retail.enterEmail(editAccInfo.get(0).get("email"));
		retail.enterTelephone(editAccInfo.get(0).get("telephone"));
		logger.info("User modified info successfully!");
	}
	
//	@When("User click on Continue button")
//	public void user_click_on_continue_button() {
//	   try {
//		retail.clickOnContinueButton();
//	} catch (Exception e) {
//		e.printStackTrace();
//	}
//	   logger.info("User clicked on continue button successfully!");
//	}

	@Then("User should see a message as following ‘Success: Your account has been successfully updated.’")
	public void user_should_see_a_message_as_following_success_your_account_has_been_successfully_updated() throws IOException {
	    retail.verifyAffiliateModifyAccSuccessMessage();
	    logger.info("User modified information successfully!");
	    
	}

}
