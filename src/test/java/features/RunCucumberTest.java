package features;



import cucumber.api.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/features",
        glue = "StepDefs"
)
public class RunCucumberTest extends AbstractTestNGCucumberTests {
}
