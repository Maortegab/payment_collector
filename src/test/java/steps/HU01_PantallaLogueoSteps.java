package steps;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.pages.DetailsPage;
import net.pages.HomePage;
import net.pages.LoginPage;
import net.util.ConfigFileReader;

public class HU01_PantallaLogueoSteps {
	
	private WebDriver driver;
    private LoginPage loginPage;
    private HomePage homePage;
    private DetailsPage detailsPage;
    private ConfigFileReader properties;
	
	
	
	@Given("La conexión con B2B")
	public void la_conexión_con_b2b() throws InterruptedException, IOException {	
		properties = new ConfigFileReader();
		System.setProperty(properties.getConfigkey(),properties.getConfig_value() );
		driver = new ChromeDriver();
		driver.get(properties.getApplicationUrl());
		driver.manage().window().maximize();
		loginPage = new LoginPage(driver);
		homePage =new HomePage(driver);
		detailsPage =new DetailsPage(driver);
		loginPage.autenticacionMicrosoft(properties.getMail());
	
	}

	@When("ingresar usuario")
	public void ingresar_usuario() throws InterruptedException {
		loginPage.ingresarUsuarioOkta(properties.getMail());
	}

	@When("ingresar contraseña")
	public void ingresar_contrasena() throws InterruptedException {
	    loginPage.ingresarContrasenaOkta(properties.getPassword());
	}

	@When("dar click en boton conectar")
	public void dar_click_en_boton_conectar() throws InterruptedException {
	    loginPage.clickConectOcta();
	}

	@Then("validar conexión exitosa")
	public void validar_conexión_exitosa() throws InterruptedException {
		loginPage.sendPushOkta();
		assertTrue(driver.findElement(loginPage.getLogoAvianca()).isDisplayed());
		driver.close();		
	}
	
	//ScenarioAlmErroresConexB2B
	@Given("La conexión Erronea con B2B")
	public void la_conexión_erronea_con_b2b() {		
	    System.out.println("De acuerdo a comentarios de Oscar esta prueba no se puede verificar porque requiere modificar los datos que estan en el código fuente de front y hacen parte del b2b.");
	}

	@When("se tiene un error de conexión con B2B")
	public void se_tiene_un_error_de_conexión_con_b2b() {
		System.out.println("De acuerdo a comentarios de Oscar esta prueba no se puede verificar porque requiere modificar los datos que estan en el código fuente de front y hacen parte del b2b.");
	}

	@Then("validar que se almacena el error")
	public void validar_que_se_almacena_el_error() {
		System.out.println("De acuerdo a comentarios de Oscar esta prueba no se puede verificar porque requiere modificar los datos que estan en el código fuente de front y hacen parte del b2b.");
	}
	
//	# PBI_383190 Validación Informacion Basica del Asesor
//	#ScenarioValidarInfoAsesor
	
	@Given("La conexión exitosa con payment collector")
	public void la_conexión_exitosa_con_payment_collector() throws InterruptedException, IOException {
		driver = new ChromeDriver();
		driver.get(properties.getApplicationUrl());
		driver.manage().window().maximize();
		
		loginPage.autenticacionMicrosoft(properties.getMail());
		loginPage.autenticacionOkta(properties.getMail(), properties.getPassword());
		assertTrue(driver.findElement(loginPage.getLogoAvianca()).isDisplayed());
	}

	@When("aparece la información del asesor")
	public void aparece_la_información_del_asesor() throws InterruptedException {
		loginPage.validarNombreAsesorVisible();
	}

	@Then("Validar que la información es correcta")
	public void validar_que_la_información_es_correcta() throws InterruptedException {
		loginPage.validarNombreAsesorVisible();
		String nombre = driver.findElement(loginPage.getNombreAsesor()).getText();
		boolean validacionNombreAsesor = driver.findElement(loginPage.getNombreAsesor()).getText().equals(nombre);
		assertTrue(validacionNombreAsesor);
		driver.close();	    
	}
	
//	# PBI_383190 Validación Tiempo Activo de Sesión
//	#ScenarioValidarTiempoActivo
	@Given("inicio de sesión exitoso")
	public void inicio_de_sesión_exitoso() throws InterruptedException {
		throw new io.cucumber.java.PendingException();
	}

	@When("pasados {int} minutos")
	public void pasados_minutos(Integer int1) {
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Validar que la sesión deja de estar activa")
	public void validar_que_la_sesión_deja_de_estar_activa() {
	    throw new io.cucumber.java.PendingException();
	}
	
//	# PBI_383190 Validación Usuario Payment Collector
//	#ScenarioValidarUsuarioPaymentC
	@Given("La pantalla de inicio de sesión usuario")
	public void la_pantalla_de_inicio_de_sesión_usuario() throws InterruptedException, IOException {
		driver = new ChromeDriver();
		driver.get(properties.getApplicationUrl());
		driver.manage().window().maximize();
		loginPage.autenticacionMicrosoft(properties.getMail());
	}

	@When("solicita el usuario")
	public void solicita_el_usuario() throws InterruptedException {
	    loginPage.UsuarioOktaVisible();
	}

	@Then("Validar que se ingresa correctamente")
	public void validar_que_se_ingresa_correctamente() throws InterruptedException {
		loginPage.ingresarUsuarioOkta(properties.getMail());
		loginPage.ingresarContrasenaOkta(properties.getPassword());
		loginPage.clickConectOcta();
		loginPage.sendPushOkta();
		assertTrue(driver.findElement(loginPage.getLogoAvianca()).isDisplayed());
		driver.close();   
	}
	
//	#ScenarioValidarContraseñaPaymentC
	@Given("La pantalla de inicio de sesión contraseña")
	public void la_pantalla_de_inicio_de_sesión_contraseña() throws InterruptedException, IOException {
		driver = new ChromeDriver();
		driver.get(properties.getApplicationUrl());
		driver.manage().window().maximize();
		loginPage.autenticacionMicrosoft(properties.getMail());
		loginPage.ingresarUsuarioOkta(properties.getMail());
	}

	@When("solicita la contraseña")
	public void solicita_la_contraseña() throws InterruptedException {
	    loginPage.ContraseñaOktaVisible();
	    loginPage.ingresarContrasenaOkta(properties.getPassword());
	}

	@Then("Validar que se realiza el ingreso correctamente")
	public void validar_que_se_realiza_el_ingreso_correctamente() throws InterruptedException {
	    loginPage.clickConectOcta();
	    loginPage.sendPushOkta();
	    assertTrue(driver.findElement(loginPage.getLogoAvianca()).isDisplayed());
	    driver.close();	    
	}

//	#ScenarioValidarEstadoBloqueadoPaymentC
	@Given("el usuario estado bloqueado")
	public void el_usuario_estado_bloqueado() {
	    System.out.println("De acuerdo a comentarios de Romero Tapia, Isias Jair (i.romerotapia@dxc.com) , en un reunión tomaron la decision de no realizar el mensaje  ya que el Equipo no controla eso. ");
	}

	@When("muestra el mensaje de estado")
	public void muestra_el_mensaje_de_estado() {
		System.out.println("De acuerdo a comentarios de Romero Tapia, Isias Jair (i.romerotapia@dxc.com) , en un reunión tomaron la decision de no realizar el mensaje  ya que el Equipo no controla eso. ");
	}

	@Then("Validar que aparece mensaje para solicitud de desbloqueo")
	public void validar_que_aparece_mensaje_para_solicitud_de_desbloqueo() {
		System.out.println("De acuerdo a comentarios de Romero Tapia, Isias Jair (i.romerotapia@dxc.com) , en un reunión tomaron la decision de no realizar el mensaje  ya que el Equipo no controla eso. ");
	}
}
