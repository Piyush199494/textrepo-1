package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features = {"src/test/resources/Features/ActiTimelogin.feature"},
glue= {"stepdefinitions"},
plugin= {"pretty","html:target/cucumber-report.html","json:json_output/cucumber.json","junit:junit_xml/cucumber.xml"},
monochrome = true,dryRun = false,publish = true)


public class TestRunner extends AbstractTestNGCucumberTests{

}
