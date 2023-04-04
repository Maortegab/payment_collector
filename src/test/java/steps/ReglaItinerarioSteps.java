package steps;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.Allure;
import net.pages.DetailsPage;
import net.pages.HomePage;
import net.pages.LoginPage;
import net.util.ConfigFileReader;
import net.util.ExcelReader;

public class ReglaItinerarioSteps {
	
	private WebDriver driver;
    private LoginPage loginPage;
    private HomePage homePage;
    private DetailsPage detailsPage;
    private ConfigFileReader properties;
  
//	String correo="";
//	String contrasena="";
	
	@Given("Logueo")
	public void logueo() throws InterruptedException {
		properties = new ConfigFileReader();
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mortegabuitr\\eclipse-workspace\\payment_collector\\src\\test\\resources\\chromeDriver\\chromeDriver.exe");
		System.setProperty(properties.getConfigkey(),properties.getConfig_value() );
		driver = new ChromeDriver();
//		driver.get("https://azwapppaycollfrontusedev.az-asev3-use-dev-pci.appserviceenvironment.net/login");
		driver.get(properties.getApplicationUrl());
		driver.manage().window().maximize();
		loginPage = new LoginPage(driver);
		homePage =new HomePage(driver);
		detailsPage =new DetailsPage(driver);
		loginPage.autenticacionMicrosoft(properties.getMail());
		loginPage.autenticacionOkta(properties.getMail(), properties.getPassword());
	}
	
	@When("Escribe un {string} de reserva de la row {int} itinerario")
	public void escribe_un_de_reserva_de_la_row(String string, Integer rowNumber) throws InvalidFormatException, IOException, InterruptedException {
		ExcelReader reader = new ExcelReader();
		List<Map<String,String>> testData = 
				reader.getData("src/test/resources/configs/automation.xlsx", string);
		String reserva = testData.get(rowNumber).get("Reserva");
		Allure.description("Reserva: "+reserva);
		homePage.setReserva(reserva);
	}
	
	@When("Escribe un {string} de reserva de la row {int} tipo moneda")
	public void escribe_un_de_reserva_de_la_row_tipo_moneda(String string, Integer rowNumber) throws InvalidFormatException, IOException, InterruptedException {
		ExcelReader reader = new ExcelReader();
		List<Map<String,String>> testData = 
				reader.getData("C:\\Users\\npaezbuitrag\\eclipse-workspace\\payment_collector\\src\\test\\resources\\configs\\automation.xlsx", string);
		String reserva = testData.get(rowNumber).get("Reserva");
		Allure.description("Reserva: "+reserva);
		homePage.setReserva(reserva);
	}
	//----APIS/TSA
	@When("Escribe la {string} de la row <Rownumber> APIS-TSA")
	public void escribe_la_de_la_row_rownumber_apis_tsa(String string, Integer rowNumber) throws InvalidFormatException, IOException, InterruptedException {
		ExcelReader reader = new ExcelReader();
		List<Map<String,String>> testData = 
				reader.getData("src/test/resources/configs/automation.xlsx", string);
		String reserva = testData.get(rowNumber).get("Reserva");
		Allure.description("Reserva: "+reserva);
		homePage.setReserva(reserva);
	}
	//----APIS/TSA
	@Then("Validar que el texto de salida es {string}")
	public void validar_que_el_texto_de_salida_es(String textoEsperado) throws InterruptedException {
		String textoObtenido=homePage.validarPopup();
		Assert.assertEquals(textoObtenido, textoEsperado);
	}

	@When("Dar click en gestionar")
	public void dar_click_en_gestionar() throws InterruptedException {
		homePage.botonGestionar();
	}

	@Then("Aparece popUp con Mensaje {string}")
	public void aparece_pop_up_con_mensaje(String textoEsperado) throws InterruptedException {
		String textoObtenido=homePage.validarPopup();
		Assert.assertEquals(textoObtenido, textoEsperado);
	}
	
	@Then("Pasa a la pantalla de detalles de la resrva")
	public void pasa_a_la_pantalla_de_detalles_de_la_resrva() throws InterruptedException {
		String titulo=detailsPage.validarTitulo();
		Assert.assertEquals(titulo, "Formulario gestión de pagos");
	}
}
