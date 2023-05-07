package cucumbermap;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.SeleniumOperations;

public class Login {

	@Given("^user landed on gmail page$")
	public void user_landed_on_gmail_page() throws InterruptedException {
		SeleniumOperations.lunch();
		
	}
	@Given ("^user enter url as \"(.*)\"$")
	public void url(String url1) {
		SeleniumOperations.openurl(url1);
	}

	@Given ("^user click on sign up page \"(.*)\"$")
	public void user_click_on_sign_up_page(String string) {
		SeleniumOperations.click(string);
	}

	@Given ("^user \"(.*)\" enter email id (.+)$")
	public void user_enter_email_id(String string, String string2) {
		SeleniumOperations.sendkey(string, string2);
	}

	@Then ("^user enter on submit \"(.*)\"$")
	public void user_enter_on_submit(String str) {
		SeleniumOperations.click(str);
	}

	@When ("^user \"(.*)\"  enter password (.+)$")
	public void user_enter_password(String string, String string2) {
	   
	}



}
