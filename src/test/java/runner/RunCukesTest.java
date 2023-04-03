package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
 
@CucumberOptions(
//		features="src/test/resources/features/home.feature",
		features="src/test/resources/features/reglasValidacion/itinerario.feature",
		glue="steps"
		)
public class RunCukesTest extends AbstractTestNGCucumberTests{

} 