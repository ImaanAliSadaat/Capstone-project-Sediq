package stepDefinitions;

import java.io.IOException;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.HomePageObjects;
import utilities.Utilities;

public class HomePageSteps extends Base {
	
	HomePageObjects homepage = new HomePageObjects();
	
	@Given("User is on Retail website")
	public void user_is_on_retail_website() throws IOException {
		homepage.homePageValidate();
		logger.info("Retail page validate successfully!");
	}

	@When("User click on Currency")
	public void user_click_on_currency() {
		homepage.clickCurrancyBtn();
		logger.info("Curruncy button clicked successfully!");
	}

	@When("User Chose Euro from dropdown")
	public void user_chose_euro_from_dropdown() {
		homepage.clickEuro();
		logger.info("Euro button clicked successfully");
	}

	@Then("currency value should change to Euro")
	public void currency_value_should_change_to_euro() throws IOException {
	    homepage.euroSign();
		logger.info("Euro sign displayed");
		
	}
	
	@When("User click on shopping cart")
	public void user_click_on_shopping_cart() {
	    homepage.clickItemsInCartBtnn();
	    logger.info("Shopping cart button clicked successfully!");
	}

	@Then("“Your shopping cart is empty!” message should display")
	public void your_shopping_cart_is_empty_message_should_display() throws IOException {
	   homepage.verifyShoppingCartEmptyMsg();
	   logger.info("Your shopping cart is empty! is displayed successfully!");
	}

}
