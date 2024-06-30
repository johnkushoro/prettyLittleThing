//package StepDefs;
//
//import PageObject.CartPage;
//import io.cucumber.java.en.And;
//
//import static org.junit.Assert.assertEquals;
//
//public class CartPageStepDefs {
//    private final CartPage cartPage = new CartPage();
//
//
//        @And("the user proceeds to the cart page")
//        public void theUserProceedsToTheCartPage() {
//
//            String inventoryItemDescriptionText = "carry.allTheThings() with the sleek, streamlined Sly Pack that melds uncompromising style with unequaled laptop and tablet protection.";
//            String cartItemElement = cartPage.getCartPageDescriptionElementText();
//            assertEquals("Item description does not match cart item description.", inventoryItemDescriptionText, cartItemElement);
//
//            String inventoryItemElementLinkText = cartPage.getCartPageInventoryItemElementLinkText();
//            assertEquals("Item name does not match inventory details name.", inventoryItemElementLinkText, "Sauce Labs Backpack");
//            cartPage.clickContinueButtonWithText("Checkout");
//
//        }
//    }

