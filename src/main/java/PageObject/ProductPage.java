package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;



public class ProductPage extends CommonPage {

    public static final String SPAN_WITH_TEXT = "//span[contains(text(),'%s')]";
    public static final String LINK_WITH_TEXT = "//a[contains(., '%s')]";
    public static final String INVENTORY_DETAILS_NAME = ".inventory_details_name.large_size";
    public static final String BUTTON_WITH_TEXT = "//button[contains(text(), '%s')]";
    public static final String SHOPPING_CART_LINK = "//a[@class='shopping_cart_link']";
    public static final String MESSAGE_TITLE_WITH_TEXT = "//div[contains(text(),'%s')]";


    public WebElement getProductPageTitle(String text) {
        return driver.findElement(By.xpath(String.format(SPAN_WITH_TEXT, text)));
    }

    public void clickInventoryItemName(String linkText) {
        String linkXPath = String.format(LINK_WITH_TEXT, linkText);
        WebElement linkElement = driver.findElement(By.xpath(linkXPath));
        linkElement.click();
    }

    public String getInventoryDetailsTitle() {
        WebElement element = driver.findElement(By.cssSelector(INVENTORY_DETAILS_NAME));
        return element.getText();
    }

    public void clickAddToCartButton(String buttonText) {
        String linkXPath = String.format(BUTTON_WITH_TEXT, buttonText);
        WebElement buttonElement = driver.findElement(By.xpath(linkXPath));
        buttonElement.click();
    }

    public void clickShoppingCartBadge() {
        WebElement shoppingCartLink = driver.findElement(By.xpath(SHOPPING_CART_LINK));
        shoppingCartLink.click();
    }

    public String getInventoryDetailsNameText() {
        WebElement element = driver.findElement(By.xpath(MESSAGE_TITLE_WITH_TEXT));
        return element.getText();
    }
}
