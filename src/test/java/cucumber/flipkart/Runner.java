package cucumber.flipkart;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;




@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\aramudhan\\eclipse-workspace\\cucumber\\src\\test\\resources\\fbprofile\\Facebook.feature",
                         glue="cucumber.flipkart", 
                      tags="@smoke",
                       plugin={"html:target/one6.html","json:target/two6.json"},
                    
                       dryRun = false,
                       monochrome =true)

public class Runner {

}
