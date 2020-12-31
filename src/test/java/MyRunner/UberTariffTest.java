package MyRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"D:\\Core Java Training\\SeleniumSession\\CucumberSession\\src\\test\\java\\AppFeatures\\uber.feature"},
		glue = {"StepDefinition"},
		plugin = {"pretty"}
		)

public class UberTariffTest {

}
