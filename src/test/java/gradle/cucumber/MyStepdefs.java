package gradle.cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertTrue;

public class MyStepdefs {
    @Given("a regular merchant")
    public void aRegularMerchant() {
        // TODO implement this
    }

    @When("customer pays {int}")
    public void customerPays(int arg0) {
        // TODO implement this
    }

    @Then("customer receives {double}")
    public void customerReceives(double arg0) {
        // simulate a failure case
        assertTrue(arg0 >= 1);
    }
}
