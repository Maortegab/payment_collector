package steps;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.pages.DetailsPage;
import net.pages.HomePage;
import net.pages.LoginPage;

public class HomeSteps {
	private WebDriver driver;
    private LoginPage loginPage;
    private HomePage homePage;
    private DetailsPage detailsPage;
  
	String correo="n.paezbuitrago@dxc.com";
	String contrasena="Anate9Canada2022.";
	
	@Given("Logueo Pyemnt")
	public void logueo() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\npaezbuitrag\\eclipse-workspace\\CucumberTest\\src\\test\\resources\\chromeDriver\\chromeDriver.exe");
		driver = new ChromeDriver();
		driver.get("https://azwapppaycollfrontusedev.az-asev3-use-dev-pci.appserviceenvironment.net/login");
		loginPage = new LoginPage(driver);
		homePage =new HomePage(driver);
		detailsPage =new DetailsPage(driver);
		loginPage.autenticacionMicrosoft(correo);
		loginPage.autenticacionOkta(correo, contrasena);

	}

	@When("Ingreso a la pagina de home")
	public void ingresar_home() throws AWTException, InterruptedException {
		 homePage.logoAvianca();
	}

	@Then("Se muestra el mensaje ¡Pensamos en ti! Por eso creamos esta aplicación que facilitara tu trabajo")
	public boolean el_campo_no_cambia_de_valor() throws InterruptedException {
		String tituloEsperado="¡Pensamos en ti! Por eso creamos esta aplicación que facilitara tu trabajo";
		String tituloEsperado2="“Que tengas un buen y feliz turno” ";
		if(homePage.mensajePrincipal().contains(tituloEsperado)||homePage.mensajePrincipal().contains(tituloEsperado2)) {
			return true;
		}
		return false;
	}
	
	@Then("Se muestra el mensaje Pronto encontrarás aquí los enlaces que más necesitas para tu gestión.")
	public void se_muestra_el_mensaje_pronto_encontrarás_aquí_los_enlaces_que_más_necesitas_para_tu_gestión() {
		String tituloEsperado="Pronto encontrarás aquí los enlaces que más necesitas para tu gestión.";
		 homePage.descripcionPrincipal().contains(tituloEsperado);
	}
	
	@Then("Se muestra el mensaje Natalia bienvenid@ a esta nueva experiencia.")
	public void se_muestra_el_mensaje_natalia_bienvenid_a_esta_nueva_experiencia() {
		String tituloEsperado="Natalia bienvenid@ a esta nueva experiencia.";
		 homePage.tituloPrincipal().contains(tituloEsperado);
	}
	
	@Then("Se muestra el nombre del asesor")
	public void se_muestra_el_nombre_del_asesor() {
		String tituloEsperado="Paez Buitrago, Natalia Katherinne";
		 homePage.nombreAsesor().contains(tituloEsperado);
		 homePage.cerrarNavegador();
	}
	
	@When("Ingresar al desplegable con la opcion de cerrar sesion")
	public void ingresar_al_desplegable_con_la_opcion_de_cerrar_sesion() throws InterruptedException {
		 homePage.desplegarOpc();
	}

	@When("Dar click sobre la opcion de cerrar sesion")
	public void dar_click_sobre_la_opcion_de_cerrar_sesion() throws InterruptedException {
		 homePage.cerrarSesion();
	}

	@Then("Se saldra del aplicativo")
	public void se_saldra_del_aplicativo() {
		homePage.getTituloPagina().contains("Cerrar sesión");
	    homePage.cerrarNavegador();
	    
	}
	
	@When("Escribe un numero de reserva")
	public void escribe_reserva() throws InterruptedException {
		 homePage.setReserva("3M4M8H");
	}

	@When("Se valida que no contenga mas de seis valores")
	public void validacion_menos_seis_valores() {
		 homePage.longitudFirma("3M4M8H");
	}
	@When("Dar clic en el boton gestionar")
	public void click_boton_gestionar() throws InterruptedException {
		 homePage.botonGestionar();
	}
	
	@Then("Ingresara a la pagina de detalles de la reserva")
	public void ingreso_pagina_detalles_reserva() throws InterruptedException {
		 homePage.getTituloDetallesReserva();
		 homePage.cerrarNavegador();
	    
	}
}
