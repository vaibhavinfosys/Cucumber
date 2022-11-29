package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
        (
		   features="C:\\Users\\DELL PC\\eclipse-workspace\\Cucumber_NewFrameWork\\Features\\Login.feature",
		   glue={"StepDefination"},
		   dryRun = false,
		   monochrome = true,
		   
		    plugin= {"pretty","html:target\\actitime.html"}
		
		)

public class Test_Runner {
	

}


// Well done vaibhav
