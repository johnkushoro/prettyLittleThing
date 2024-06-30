package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static PageObject.ProductPage.BUTTON_WITH_TEXT;

public class CartPage extends CommonPage {

    public static final String CART_PAGE_DESCRIPTION_ELEMENT_TEXT = ".cart_item_label .inventory_item_desc:nth-child(2)";
    public static final String LINK_DIV_INVENTORY_ITEM_NAME = "a#item_4_title_link > div.inventory_item_name";


    public String getCartPageDescriptionElementText() {
        WebElement element = driver.findElement(By.cssSelector(CART_PAGE_DESCRIPTION_ELEMENT_TEXT));
        return element.getText();
    }

    public String getCartPageInventoryItemElementLinkText() {
        WebElement element = driver.findElement(By.cssSelector(LINK_DIV_INVENTORY_ITEM_NAME));
        return element.getText();
    }

    public void clickContinueButtonWithText(String buttonText) {
        String linkXPath = String.format(BUTTON_WITH_TEXT, buttonText);
        WebElement buttonElement = driver.findElement(By.xpath(linkXPath));
        buttonElement.click();
    }

}