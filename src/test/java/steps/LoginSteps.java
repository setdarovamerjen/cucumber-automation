package steps;
import io.cucumber.java.en.*;

public class LoginSteps {

    @Given("correct {string} and correct {string}")
    public void correct_and_correct(String username, String password) {
        System.out.println("Given: "+username+" and password: " + password);
    }
    @When("user logs in to the application")
    public void user_logs_in_to_the_application() {
        System.out.println("User  successfully logged in ");
    }
    @Then("verify user is logged in")
    public void verify_user_is_logged_in() {
        System.out.println("User was able to login ");
    }
    @Then("verify user is logged out")
    public void verify_user_is_logged_out() {
        System.out.println("User was able to login");
    }

    @Given("incorrect {string} and correct {string}")
    public void incorrect_and_correct(String username, String password) {
        System.out.println("Incorrect username ");
    }

    @Then("verify user is not logged in")
    public void verify_user_is_not_logged_in() {
        System.out.println("Username is not logged in");
    }
}
