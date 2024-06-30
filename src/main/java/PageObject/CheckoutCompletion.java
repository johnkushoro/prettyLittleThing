package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckoutCompletion extends CommonPage{

    public static final String CHECKOUT_COMPLETION_ELEMENT = ".complete-header";



        public String getCheckoutCompletionTextElement() {
            WebElement checkoutElement = driver.findElement(By.cssSelector(CHECKOUT_COMPLETION_ELEMENT));
            return checkoutElement.getText();
    }
}
