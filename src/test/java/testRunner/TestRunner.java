package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
        features = "src\\main\\resources"           //to specify the feature file path
        ,glue={"stepDefs"}                        //to specify the stepDefinition package path
        //,dryRun=true                              //it only checks whether all feature file steps have corresponding step definitions
        ,tags = ""                                  //To run specific tags in scenarios tags = "@FirstTag or @SecondTag"
)
public class TestRunner extends AbstractTestNGCucumberTests {

}
