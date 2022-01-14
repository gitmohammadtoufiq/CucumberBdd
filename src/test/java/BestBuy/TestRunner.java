package BestBuy;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		features="/Users/mohammadtoufiq/eclipse-workspace/CucumberProject/Feature/login.feature",
		glue=
//		plugin={"html:target/cucumber-html-report"},
//		monochrome=true,
//		dryRun=false
		
		)

public class TestRunner {

}
