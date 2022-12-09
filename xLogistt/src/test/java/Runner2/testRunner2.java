package Runner2;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(
        
        
        features = ".\\Features\\login2.feature",
        glue = "step2",
        dryRun=false,
        monochrome = true
)
public class testRunner2 {
	

}
