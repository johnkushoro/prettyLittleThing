//package StepDefs;
//
//import PageObject.CheckoutCompletion;
//import io.cucumber.java.en.Then;
//import org.junit.Assert;
//
//public class CheckOutCompleteStepDefs {
//    private final CheckoutCompletion checkoutCompletion = new CheckoutCompletion();
//        @Then("user successfully completes checkout with displayed text {string}")
//    public void userSuccessfullyCompletesCheckoutWithDisplayedText(String expectedMessage) throws InterruptedException {;
//        String actualMessage = checkoutCompletion.getCheckoutCompletionTextElement();
//        Assert.assertEquals("Error message does not match", expectedMessage, actualMessage);
//    }
//}
