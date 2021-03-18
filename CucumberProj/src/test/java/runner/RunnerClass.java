package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/main/java/Features"},glue= {"com"},monochrome=true,tags={"@sanity,@bvt"})
public class RunnerClass {

}
