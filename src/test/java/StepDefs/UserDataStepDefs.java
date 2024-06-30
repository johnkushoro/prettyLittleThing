package StepDefs;

import PageObject.CartPage;
import PageObject.UserDataPage;
import io.cucumber.java.en.And;

public class UserDataStepDefs {
    private final UserDataPage dataInformation = new UserDataPage();
    private final CartPage cartPage = new CartPage();


    @And("the user proceeds to the Data Information Page")
    public void theUserProceedsToCheckout() throws InterruptedException {
        dataInformation.enterUserData("firstNameTest", "lastNameTest", "12345");
        dataInformation.clickUserDataContinueButton();
        dataInformation.clickFinishButton("Finish");

    }


}
