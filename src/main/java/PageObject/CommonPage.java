package PageObject;

import Utils.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class CommonPage {
    protected final WebDriver driver;
    protected final WebDriverWait wait;
    private static final Duration PAGE_LOAD_TIMEOUT = Duration.ofSeconds(30);

    public CommonPage() {
        this.driver = Driver.getWebDriver();
        wait = new WebDriverWait(this.driver, PAGE_LOAD_TIMEOUT);
    }
}



