package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
 
@CucumberOptions(
//		features="src/test/resources/features/home.feature",
//		features="src/test/resources/features/HU01_PantallaLogueo.feature",
//		features="src/test/resources/features/HU02_LogIngresoEgresoDiarios.feature",
//		features="src/test/resources/features/reglasValidacion/itinerario.feature",
//		features="src/test/resources/features/reglasValidacion/HU06_APIS_TSA.feature",
		features="src/test/resources/features/reglasValidacion/HU05_RV1.feature",
		glue="steps"
		)
public class RunCukesTest extends AbstractTestNGCucumberTests{

} 