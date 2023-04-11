package net.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage extends BasePage {

	//Localizadores inicio de sesion Microsoft
	private By iniciarSesion=By.xpath("/html/body/app-root/app-authentication/div[1]/div/div[2]/div/div/a");
	private By inputCorreoMicrosoft=By.xpath("//*[@id=\"i0116\"]");
	private By btnSiguenteMicrosoft=By.xpath("//*[@id=\"lightbox\"]/div[3]/div/div/div/div[4]/div/div/div/div");
	
	//Localizadores Okta
	private By inputUsuario=By.xpath("//*[@id=\"okta-signin-username\"]");
	private By inputContrasena=By.xpath("//*[@id=\"okta-signin-password\"]");
	private By opcRecordar=By.xpath("//*[@id=\"form32\"]/div[1]/div[2]/div[3]/div/span/div/label");
	private By btnIniciarSesion=By.xpath("//*[@id=\"okta-signin-submit\"]");
	private By btonpush=By.xpath("//*[@id=\"form75\"]/div[2]/input");

	private By logoAvianca = By.xpath("(//p[@class='imglogin session-name'])[1]");
	private String logo = "(//p[@class='imglogin session-name'])[1]";
	
	// Campos avianca
	private By botonIniciarSesion = By.xpath("//a[normalize-space()='Iniciar sesión']");
	private By inputAmadeus = By.xpath("(//input[@type='text'])[1]");
	private By nombreAsesor = By.xpath("(//p[@class='imglogin session-name'])[1]");

	// Campos Office 365
	private By inputCorreoMcsft = By.id("i0116");
	private By btnSiguienteUsuario = By.xpath("(//input[@id='idSIButton9'])[1]");	
	

	// camposOcta
	public By inputCorreoOkta = By.xpath("//input[@id='okta-signin-username']");
	public By inputPasswordoOkta = By.xpath("//input[@id='okta-signin-password']");
	private By btnSingInOcta = By.xpath("(//input[@id='okta-signin-submit'])[1]");
	public By btnsendPush = By.xpath("//*[@id='form75']/div[2]/input");
	public By btnBackToSingInOcta = By.xpath("//a[normalize-space()='Back to sign in']");
		
	
    public LoginPage(WebDriver driver) {
        super(driver);
    }
	
	public void navigateUrl() {
		navigateToUrl("https://azwapppaycollfrontusedev.az-asev3-use-dev-pci.appserviceenvironment.net/Login");
	}
	public void autenticacionMicrosoft(String correo) throws InterruptedException {
		isDisplayed(iniciarSesion);
		click(iniciarSesion);
		isDisplayed(inputCorreoMicrosoft);
		type(inputCorreoMicrosoft, correo);
		isDisplayed(btnSiguenteMicrosoft);
		click(btnSiguenteMicrosoft);
	}
	
	public void autenticacionOkta(String usuario, String contrasena) throws InterruptedException {
		isDisplayed(inputUsuario);
		type(inputUsuario, usuario);
		isDisplayed(inputContrasena);
		type(inputContrasena, contrasena);
		isDisplayed(opcRecordar);
		click(opcRecordar);
		isDisplayed(btnIniciarSesion);
		click(btnIniciarSesion);
		isDisplayed(btonpush);
		click(btonpush);
		espera(logo);
	}
	
	public void ingresarUsuarioOkta(String usuario) throws InterruptedException {
		isDisplayed(inputCorreoOkta);
		type(inputCorreoOkta, usuario);		
	}
	
	public void ingresarContrasenaOkta(String password) throws InterruptedException {		
		type(inputPasswordoOkta, password);
	}
	
	public void clickConectOcta() throws InterruptedException {		
		click(btnSingInOcta);
	}

	public void sendPushOkta() throws InterruptedException {
		isDisplayed(btnsendPush);
		click(btnsendPush);
		espera(logo);
	}

	public By getLogoAvianca() {
		return logoAvianca;
	}

	public void validarNombreAsesorVisible() throws InterruptedException {
		isDisplayed(getNombreAsesor());		
	}

	public By getNombreAsesor() {
		return nombreAsesor;
	}
	
	public void UsuarioOktaVisible() throws InterruptedException {
		isDisplayed(inputCorreoOkta);		
	}
	
	public void ContraseñaOktaVisible() throws InterruptedException {
		isDisplayed(inputPasswordoOkta);		
	}
	
}
