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

	By logoAvianca=By.xpath("//app-header-home/div[1]/div[1]/div[1]/div[1]/img[1]");
	/*public LoginPage() {
		 navigateToUrl("https://azwapppaycollfrontusedev.az-asev3-use-dev-pci.appserviceenvironment.net/Login");
	}*/
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
		espera("//p[contains(text(),'“Natalia bienvenid@ a esta nueva experiencia”')]");
		
	}

}
