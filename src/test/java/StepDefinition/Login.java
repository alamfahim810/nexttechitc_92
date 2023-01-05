package StepDefinition;

import com.nexttechmeta.PageAction.AccountPageAction;
import com.nexttechmeta.PageAction.HomePageAction;
import com.nexttechmeta.PageAction.LoginPageAction;

import Utility.Base_Parent;
import Utility.Utlity;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Login extends Base_Parent {

	HomePageAction homepageaction=new HomePageAction();
	LoginPageAction loginpageaction=new LoginPageAction();
	AccountPageAction accountpageaction=new AccountPageAction();
	@Given("^MetaLaunch \"([^\"]*)\"$")
	public void metalaunch(String URL) throws Throwable {
	   metaLaunchURL(URL);
	}
	
	@Then("^Click Login Link$")
	public void click_Login_Link() throws Throwable {
	   homepageaction.ClickLoginlink();
	}

	@Then("^Enter Username and Enter Password and Click Login button$")
	public void enter_Username_and_Enter_Password_and_Click_Login_button() throws Throwable {
	   loginpageaction.metaLoginCard(metaprop.getProperty("UserName1"), metaprop.getProperty("Password1"));
	}

	@Then("^Verify user can login with valid credentials$")
	public void verify_user_can_login_with_valid_credentials() throws Throwable {
	   accountpageaction.Verifyusercanloginwithvalidatecard();
	   Utlity.takeMyScreenshot(driver, "Account Profile Page");
	}


	
	
	
}
