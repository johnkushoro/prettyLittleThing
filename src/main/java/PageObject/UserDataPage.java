package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static PageObject.ProductPage.BUTTON_WITH_TEXT;

public class UserDataPage extends CommonPage{

    public static final String FIRST_NAME_INPUT_ELEMENT = "#first-name";
    public static final String LAST_NAME_INPUT_ELEMENT = "#last-name";
    public static final String POSTAL_CODE_INPUT_ELEMENT = "#postal-code";
    public static final String DATA_PAGE_CONTINUE_BUTTON = "#continue";


    public void enterUserData(String firstName, String lastName, String postalCode) {
        WebElement firstNameInput = driver.findElement(By.cssSelector(FIRST_NAME_INPUT_ELEMENT));
        WebElement lastNameInput = driver.findElement(By.cssSelector(LAST_NAME_INPUT_ELEMENT));
        WebElement postalCodeInput = driver.findElement(By.cssSelector(POSTAL_CODE_INPUT_ELEMENT));

        firstNameInput.sendKeys(firstName);
        lastNameInput.sendKeys(lastName);
        postalCodeInput.sendKeys(postalCode);
    }

    public void clickUserDataContinueButton() {
        WebElement continueButton = driver.findElement(By.cssSelector(DATA_PAGE_CONTINUE_BUTTON));
        continueButton.click();
    }

    public void clickFinishButton(String buttonText) {
        String linkXPath = String.format(BUTTON_WITH_TEXT, buttonText);
        WebElement buttonElement = driver.findElement(By.xpath(linkXPath));
        buttonElement.click();
    }
}
