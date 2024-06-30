package Utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Driver {

    public static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
    public void createWebDriver() {
        WebDriverManager.chromedriver().setup();
        driver.set(new ChromeDriver());
        getWebDriver().manage().window().maximize();

    }

    public void closeWebDriver(){
        if (getWebDriver() != null) {
            getWebDriver().quit();
        }
    }

    public static WebDriver getWebDriver(){
        return driver.get();
    }

}
