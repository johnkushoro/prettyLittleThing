package StepDefs;

import Utils.Config;
import Utils.Driver;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;



public class Hooks {
    private final Driver driver;

    public Hooks() {
        driver = new Driver();
    }



    @BeforeAll
    public void beforeClass() {
        Config.setConfig();
        driver.createWebDriver();
    }

    @Before
    public void beforeMethod() {
        // Add any setup steps needed before each test method
    }

    @After
    public void tearDown() {
        driver.closeWebDriver();
    }

    @AfterAll
    public void afterClass() {
        Driver.driver.remove();
    }

}



