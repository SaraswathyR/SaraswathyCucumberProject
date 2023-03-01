package runners;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src/test/resources/Features"
		,glue={"stepDefinitions"}
	    ,tags=""
	    ,dryRun = true
		)
public class TestRunner {

}
