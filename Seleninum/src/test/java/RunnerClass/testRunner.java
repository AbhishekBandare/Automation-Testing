package RunnerClass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={"src/test/java/Cucumber/login.feature","src/test/java/Cucumber/keybord.feature","src/test/java/stepdef/dataTbaleDemo.java"},
		glue="stepdef",
		plugin = {"html:src\\reports\\rep.html"},
		monochrome = true
		)
public class testRunner {

}
