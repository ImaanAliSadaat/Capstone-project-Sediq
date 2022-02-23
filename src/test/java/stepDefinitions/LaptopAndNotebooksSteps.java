package stepDefinitions;

import java.io.IOException;

import core.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.LaptopsNoteBooksPageObject;
import utilities.Utilities;

public class LaptopAndNotebooksSteps extends Base{
	
	LaptopsNoteBooksPageObject laptop = new LaptopsNoteBooksPageObject();
	
	//Scenario: Add and Remove a Mac book from Cart
	
	@When("User click on Laptop &NoteBook tab")
	public void user_click_on_laptop_note_book_tab() {
	    laptop.clickLaptopsAndNotebooksTab();
	    logger.info("User clicked on Laptop &NoteBook tab successfully!");
	}

	@When("User click on Show all Laptop &NoteBook option")
	public void user_click_on_show_all_laptop_note_book_option() {
	   laptop.clickShowAllLaptopsAndNotebooksOption();
	   logger.info("User clicked on Show all Laptop &NoteBook option succesfully!" );
	}

	@When("User click on MacBook  item")
	public void user_click_on_mac_book_item() {
		laptop.clickMacbookItem();
		logger.info("User clicked on MacBook  item succesfully!");
	}

	@When("User click add to Cart button")
	public void user_click_add_to_cart_button() {
	   laptop.clickAddToCartBtn();
	   logger.info("User clicked add to Cart button successfully!");
	}

	@Then("User should see a message ‘Success: You have added MacBook to your shopping cart!’")
	public void user_should_see_a_message_success_you_have_added_mac_book_to_your_shopping_cart() throws IOException {
	    laptop.verifySuccesMsgAddingMacbookToCart();
	    logger.info("Success: You have added MacBook to your shopping cart! displayed succesfully!");
	}

	@Then("User should see {string} showed to the cart")
	public void user_should_see_showed_to_the_cart(String string) throws IOException {
	   laptop.displayCartItemAndCost(string);
	   Utilities.takeScreenShot("itemQtyAndTotalCostInCart");
	   logger.info("1 tem(s)-602.00 displayed to the cart successfully!");
	}

	@Then("User click on cart option")
	public void user_click_on_cart_option() {
	   laptop.clickCartOption();
	   logger.info("User clicked on cart option successfully!");
	}

	@Then("user click on red X button to remove the item from cart")
	public void user_click_on_red_x_button_to_remove_the_item_from_cart() {
	    laptop.clickRedXbtn();
	    logger.info("user click on red X button successfully!");
	}

	@Then("item should be removed and cart should show {string}")
	public void item_should_be_removed_and_cart_should_show(String string) throws IOException {
	    laptop.removeCartItem("itemIncart");
	    Utilities.takeScreenShot("itemInCart");
	    logger.info("Item removed from cart and displays 0 item in cart");
	}

	
	//Scenario: Product Comparison
	
	@When("User click on product comparison icon on ‘MacBook’")
	public void user_click_on_product_comparison_icon_on_mac_book() {
	    laptop.clickMacbookCompareIcon();
	    logger.info("User clicke on product comparison icon on ‘MacBook’ successfully!");
	}

	@When("User click on product comparison icon on ‘MacBook Air")
	public void user_click_on_product_comparison_icon_on_mac_book_air() {
	    laptop.clickMacbookAirCompareIcon();
	    logger.info("User clicked on product comparison icon on ‘MacBook Air' successfully!");
	}

	@Then("User should see a message ‘Success: You have added MacBook Air to your product comparison!’")
	public void user_should_see_a_message_success_you_have_added_mac_book_air_to_your_product_comparison() throws IOException {
	   laptop.showSuccessMsgCompareMacAir();
	   logger.info("‘Success: You have added MacBook Air to your product comparison!’ message displayed successfully!");
	   
	}

	@Then("User click on Product comparison link")
	public void user_click_on_product_comparison_link() {
	   laptop.clickProductComparisonLink();
	   logger.info("User clicked on Product comparison link successfully!");
	}

	@Then("User should see Product Comparison Chart")
	public void user_should_see_product_comparison_chart() throws IOException {
	   laptop.showProductCompareChart();
	   logger.info("Comparison Chart displayed successfully!");
	   
	}

	
	//Scenario: Adding an item to Wish list
	
	@When("User click on heart icon to add ‘Sony VaIO’ laptop to wish list")
	public void user_click_on_heart_icon_to_add_sony_va_io_laptop_to_wish_list() {
	    laptop.clickSonyVaioHeartIcon();
	    logger.info("User clicked on heart icon to add ‘Sony VaIO’ laptop to wish list successfully!");
	}

	@Then("User should get a message ‘You must login or create an account to save Sony VAIO to your wish list!’")
	public void user_should_get_a_message_you_must_login_or_create_an_account_to_save_sony_vaio_to_your_wish_list() throws IOException {
	    laptop.verifySonyVioWishLoginMsg();
	    logger.info("Sony VAIO must login message displayed successfully!");
	    
	}

	
	//Scenario: Validate the price of MacBook Pro is 2000
	
	@When("User click on ‘MacBook Pro’ item")
	public void user_click_on_mac_book_pro_item() {
	   laptop.clickMacBookPro();
	   logger.info("User clicked on ‘MacBook Pro’ item successfully!");
	}

	@Then("User should see  {string} price tag is present on UI.")
	public void user_should_see_price_tag_is_present_on_ui(String string) throws IOException {
	    laptop.macBookProPrice(string);
	    logger.info("MacBook Pro price tag displayed successfully!");
	    
	}


}
