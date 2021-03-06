package MyRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"D:\\Core Java Training\\SeleniumSession\\CucumberSession\\src\\test\\java\\AppFeatures\\Uber_HooksConcept.feature"},
		glue = {"StepDefinition", "MyHooks"},
		tags = "@All",
		plugin = {"pretty"}
		)


public class UberHookstest {

}
