
package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features = "Feature",
		glue={"stepDefinition"},
		plugin= {"pretty", "html:target/cucumber-reports", "json:target/cukes/report.json", "junit:target/cukes/junit.xml"},
		monochrome = true,
				tags = {"@unitTest"}
		)
public class Test {

}
