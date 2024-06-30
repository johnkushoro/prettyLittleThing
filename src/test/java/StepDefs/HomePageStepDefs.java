package StepDefs;

import PageObject.CommonPage;
import PageObject.ProductPage;
import Utils.Config;
import Utils.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import PageObject.HomePage;

public class HomePageStepDefs {

    private final ProductPage productPage = new ProductPage();
    private final HomePage homePage;
    private final CommonPage pageObject;

    public HomePageStepDefs() {
        homePage = new HomePage();
        this.pageObject = new CommonPage();
    }

//    @Given("I am on the homepage")
//    public void navigateToHomePage() throws Exception {
//        String prettyLittleThingUrl = Config.getPropertyWithException("url");
//        Driver.getWebDriver().get(prettyLittleThingUrl);
//        homePage.clickCookieButtonByText("Accept All");
//    }

    @When("User navigates to PLP by selecting a product category")
    public void userNavigatesToPLPBySelectingAProductCategory() {
        homePage.hoverHeaderNavLinkByText("PINK FRIDAY");
    }


    @And("User verifies PLP is displayed")
    public void userVerifiesPLPIsDisplayed() {
    }

    @And("User selects a product and adds it to the bag")
    public void userSelectsAProductAndAddsItToTheBag() {
    }

    @And("User clicks on the bag icon")
    public void userClicksOnTheBagIcon() {
    }

    @Then("Product in the bag should match the selected product")
    public void productInTheBagShouldMatchTheSelectedProduct() {
    }

    @Given("I am on the homepage")
    public void iAmOnTheHomepage() {
    }


//
//
//
//
//
//    @When("a user logs in with valid credentials")
//    public void logInWithValidCredentials() throws Exception {
//        String username = Config.getPropertyWithException("standard_user_username");
//        String password = Config.getPropertyWithException("secret_sauce_password");
//        homePage.login(username, password);
//    }
//
//    @Then("the error message {string} is displayed")
//    public void verifyErrorMessageIsDisplayed(String errorMessage) {
//        String displayedErrorMessage = homePage.getErrorMessage();
//        Assert.assertEquals("Error message does not match", errorMessage, displayedErrorMessage);
//    }
//
//    @Given("a problem user logs in with an incorrect username")
//    public void logInWithIncorrectUsername() throws Exception{
//        String username = Config.getPropertyWithException("problem_user_username");
//        String password = Config.getPropertyWithException("secret_sauce_password");
//        homePage.login(username, password);
//
//    }
//
//    @When("a user logs in with an incorrect password")
//    public void logInWithIncorrectPassword() throws Exception {
//        String username = Config.getPropertyWithException("secret_sauce_password");
//        String password = Config.getPropertyWithException("incorrect_password");
//        homePage.login(username, password);
//    }
//
//    @When("I select the inventory item with name {string}")
//    public void selectInventoryItemByName(String itemName) {
//        productPage.clickInventoryItemName(itemName);
//    }
//
//
//    @When("a user logs in with a locked-out account")
//    public void aUserLogsInWithALockedOutAccount() throws Exception {
//        String username = Config.getPropertyWithException("locked_out_user_username");
//        String password = Config.getPropertyWithException("secret_sauce_password");
//        homePage.login(username, password);
//    }

}



