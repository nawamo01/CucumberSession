package MyRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = {"D:\\Core Java Training\\SeleniumSession\\CucumberSession\\src\\test\\java\\AppFeatures\\Uber_BG_Tags.feature"},
		glue = {"StepDefinition"},
		tags = "@smoke  or @Regression",  //tags ="Not Production"   //tags = "@smoke and @Regression" //tags = "@production"
		plugin = {"pretty",
						"json:target\\\\MyReports\\\\report.json",
						"junit:target\\\\MyReports\\\\report.xml"
						},
		publish = true
				
		)




public class UberCarTypeTest {

}
