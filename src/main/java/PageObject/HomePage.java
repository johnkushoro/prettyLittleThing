
package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends CommonPage {
    public static final String USERNAME_INPUT = "user-name";
    public static final String PASSWORD_INPUT = "password";
    public static final String LOGIN_BUTTON = "login-button";
    public static final String H3_WITH_TEXT = "h3";
    public static final String COOKIE_BUTTON_IN_DIV_XPATH = "//div[@id='onetrust-button-group']//*[text()='%s']";
    public static final String HEADER_NAVIGATION_BAR_XPATH = "//ul[@id='frame-header-nav']//a[text()='%s']";

    public void login(String username, String password) {
        WebElement usernameInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(USERNAME_INPUT)));
        WebElement passwordInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(PASSWORD_INPUT)));
        WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.id(LOGIN_BUTTON)));

        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginButton.click();
    }

    public String getErrorMessage() {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(H3_WITH_TEXT)));
        return element.getText();
    }

    public void clickCookieButtonByText(String buttonText) {
        String buttonXpath = String.format(COOKIE_BUTTON_IN_DIV_XPATH, buttonText);
        WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(buttonXpath)));
        button.click();
    }

    public void hoverHeaderNavLinkByText(String linkText) {
        String linkXpath = String.format(HEADER_NAVIGATION_BAR_XPATH, linkText);
        WebElement link = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(linkXpath)));

        Actions actions = new Actions(driver);
        actions.moveToElement(link).perform();
    }
}
