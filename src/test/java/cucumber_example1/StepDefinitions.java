


package cucumber_example1;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import static cucumber_example1.VowelsCounter.*;


public class StepDefinitions {

    String input;
   // int actual;
    Integer actual;         //for junit purpose

    @Given("I enter the text {string}")
    public void i_enter_the_text(String string) {
        input=string;
    }

    @When("I test given text for vowels")
    public void i_test_given_text_for_vowels() {
        actual = VowelsCounter.count(input);
    }

    @Then("I should get result {int}")
    public void i_should_get_result(Integer expected) {
       // if(actual != expected) throw new AssertionError("Actual not equals expected.");
        Assert.assertEquals(expected,actual);      //more simple assertion with junit
    }
}








