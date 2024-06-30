//package StepDefs;
//
//import PageObject.ProductPage;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import org.openqa.selenium.WebElement;
//
//
//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertNotNull;
//
//public class ProductPageStepDefs {
//    private final ProductPage productPage = new ProductPage();
//
//
//    @Then("I am on a page with displayed text {string}")
//    public void iAmOnAPageWithText(String text) {
//        WebElement spanElement = productPage.getProductPageTitle(text);
//        assertNotNull("Expected text not found on the page: " + text, spanElement);
//    }
//
//
//    @When("the user adds item\\(s) to the shopping cart {string}")
//    public void theUserAddsItemsToTheShoppingCart(String itemName) {
//        productPage.clickInventoryItemName(itemName);
//
//        String expectedDetailsName = productPage.getInventoryDetailsTitle();
//        assertEquals("Item name does not match inventory details name.", expectedDetailsName, itemName);
//
//        productPage.clickAddToCartButton("Add to cart");
//        productPage.clickShoppingCartBadge();
//
//    }
//    @Then("the displayed link with text {string} should match with the inventory details name")
//    public void displayedLinkWithTextShouldMatchInventoryDetailsName(String linkText) {
//        String expectedDetailsName = productPage.getInventoryDetailsNameText();
//        System.out.println("Expected Details Name: " + expectedDetailsName);
//        assertEquals("Link text does not match inventory details name.", expectedDetailsName, linkText);
//    }
//    }
