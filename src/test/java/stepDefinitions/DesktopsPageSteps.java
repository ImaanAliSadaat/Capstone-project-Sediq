package stepDefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import pageObject.DesktopsPageObject;
import utilities.Utilities;

public class DesktopsPageSteps extends Base{
	
	
	DesktopsPageObject desktop = new DesktopsPageObject();
	
	@When("User click on Desktops tab")
	public void user_click_on_desktops_tab() {
	  desktop.clickDestopsTab();
	  logger.info("User clicked on Desktop tab successfully!");
	}

	@When("User click on Show all desktops")
	public void user_click_on_show_all_desktops() {
	    desktop.clickShowAllDesktops();
	    logger.info("User clicked on Show all Destops successfully!");
	}

	@Then("User should see all items are present in Desktop page")
	public void user_should_see_all_items_are_present_in_desktop_page() throws IOException {
	    desktop.verifyAllelementsInDesktop();
	    logger.info("Show all elements in Desktop displayed successfully!");
	}

	@When("User click  ADD TO CART option on ‘HP LP3065’ item")
	public void user_click_add_to_cart_option_on_hp_lp3065_item() {
	   desktop.clickHpLp3065AddToCartOption();
	   logger.info("User clicked on HP LP 3065 'Add to Cart' option successfully!");
	}

	@When("User select quantity one HP LP3065")
	public void user_select_quantity_one_HP_LP3065() {
	    desktop.select1QtyHPLP3065();
	    desktop.addToCartBtn();
	    logger.info("User selected one quantity Hp Lp 3065 successfully!");
	    
	}

	@Then("User should see a message along {string}")
	public void user_should_see_a_message_along(String msg) throws IOException{
		desktop.verifySuccessMsgForAddingHpLp3065("HpLp3065 success msg");
		logger.info("Adding HPLP 3065 to shopping cart success message displyed successfully!");
	}

	@When("User click  ADD TO CART option on Canon EOS 5D item")
	public void user_click_add_to_cart_option_on_canon_eos_5d_item() {
	   desktop.clickCanonEOS5DAddToCartOption();
	   logger.info("User clicked on Canon EOS 5D 'Add to cart' option successfully!");
	}

	@When("User select color from dropdown Red")
	public void user_select_color_from_dropdown_red() {
	    desktop.selectRedColor();
	    logger.info("User selected red color successfully!");
	}
	
	@When("User select quantity one Canon EOS 5D")
	public void user_select_quantity_one_canon_eos_5d() {
	    desktop.select1CanonQtyTextField();
	    logger.info("User selected one quantity Canon EOS 5D camera successfully!");
	}
	
	@Then("User should see a message along with {string}")
	public void user_should_see_a_message_along_with(String string) throws IOException {
	   desktop.verifySuccessMsgAddingCanonToCart("canonMsg");
	   logger.info("Success: You have added Canon EOS 5D to your shopping cart! message displayed successfully!");
	}

	@When("User click on Canon EOS 5D item")
	public void user_click_on_canon_eos_5d_item() {
	  desktop.clickcanonEOS5DItem();
	  logger.info("User clicked on canon EOS 5D item successfully!");
	}

	@When("User click on write a review link")
	public void user_click_on_write_a_review_link() {
	   desktop.clickWriteAReviewLink();
	   logger.info("User clicked on write a review link successfully!");
	}

	@When("user fill the review information with below information")
	public void user_fill_the_review_information_with_below_information(DataTable dataTable) {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		desktop.enterYourName(data.get(0).get("yourname"));
		desktop.fillYourReveiwField(data.get(0).get("yourReview"));
		logger.info("User filled review field successfully!");
	}

	@When("user click stars review")
	public void user_click_stars_review() {
		desktop.clickFiveStar();
		desktop.clickReviewBtn();
		logger.info("User clicked on review starts successfully!");
	}
	    
	@When("User click on Continue button")
	public void user_click_on_continue_button() {
	  desktop.clickOnContinueBtn();
	  logger.info("User clicked on review continue button successfully!");
	}

	@Then("User should see a message with {string}")
	public void user_should_see_a_message_with(String successMsg) throws IOException {
	    desktop.verifyReviewMsg(successMsg);
	    logger.info("Review message displayed successfully!");
	}
}
