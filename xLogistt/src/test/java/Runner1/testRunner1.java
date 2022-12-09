package Runner1;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(
        
        
        features = ".\\Features\\login.feature",
        glue = "step1",
        dryRun=false,
        monochrome = true
)
public class testRunner1 {
	

}
