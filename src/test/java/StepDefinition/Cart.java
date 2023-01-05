package StepDefinition;

import com.nexttechmeta.PageAction.CartPageAction;
import com.nexttechmeta.PageAction.HomePageAction;
import com.nexttechmeta.PageAction.LoginPageAction;

import Utility.Base_Parent;
import Utility.Utlity;
import cucumber.api.java.en.Then;

public class Cart extends Base_Parent {

	HomePageAction homepageaction= new HomePageAction();
	LoginPageAction loginpageaction= new LoginPageAction();
	CartPageAction cartpageaction= new CartPageAction();
	
	
	@Then("^Click Nokiaa lumia$")
	public void click_Nokiaa_lumia() throws Throwable {
	   homepageaction.clickNokiaLumia();
	}

	@Then("^Click add to cart$")
	public void click_add_to_cart() throws Throwable {
	    homepageaction.ClickAddtoCart();
	}

	@Then("^Click Cart$")
	public void click_Cart() throws Throwable {
		homepageaction.ClickCart();
	}
	
	    @Then("^Verify item added in cart$")
	public void verify_item_added_in_cart() throws Throwable {
	  cartpageaction.VerifyItemAddedInCart();
	  Utlity.takeMyScreenshot(driver, "Cart Page"); //Screen shots should only be for verification
	}


	
	
}
