package net.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage{
	
	//By inputReserva= By.xpath("//input[@id='inputReserve']");
	By inputReserva= By.xpath("(//input[@id='inputReserve'])[1]");
	By buttonGestionar=By.xpath("(//img[@class='img-search'])[1]");
	By alerta= By.xpath("/html/body/div/div");
	By textoAlerta= By.xpath("(//p[@class='text-content'])[1]");
	private By logoAvianca = By.xpath("(//p[@class='imglogin session-name'])[1]");
	
	//SELECTORES PARA EL HOME 
	By descripcionPrincipal=By.xpath("/html/body/app-root/app-home-layout/div/div/div/div[2]/app-home/div/div/div[2]/p");
	By tituloPrincipal=By.xpath("/html/body/app-root/app-home-layout/div/div/div/div[2]/app-home/div/div/p");
	By logo=By.xpath("//img[@alt='logo']");
	By mensajePrincipal=By.xpath("/html/body/app-root/app-home-layout/div/div/div/div[2]/app-home/div/div/p");
	By nombreAsesor=By.xpath("/html/body/app-root/app-home-layout/div/div/div/app-header-home/div/div/div[3]/div/div[2]/a/p");
	By iconoPerfil=By.xpath("/html/body/app-root/app-home-layout/div/div/div/app-header-home/div/div/div[3]/div/div[1]/a/div");
	By opcCerrarSesion=By.xpath("/html/body/app-root/app-home-layout/div/div/div/app-header-home/div/div/div[3]/div/div[1]/div/div[2]/a[3]");
	By tituloDetallesReserva=By.xpath("(//p[@class='pnr-welcome-up'])[1]");
	By inputBarraBusqueda=By.xpath("//*[@id='inputReserve']");
	By alertaCofirmacion=By.xpath("/html/body/app-root/app-home-layout/div/div/div/app-header-home/div/div/div[3]/div/div[1]/div/div[2]/app-signatures-adameus/div/div[2]/div[1]/p[1]");
	By confFirma= By.xpath("/html/body/app-root/app-home-layout/div/div/div/app-header-home/div/div/div[3]/div/div[1]/div/div[2]/app-signatures-adameus/div/div[2]/div[1]/p[1]");
	By contFirmaAmadeus=By.xpath("/html/body/app-root/app-home-layout/div/div/div/app-header-home/div/div/div[3]/div/div[1]/div/div[2]/app-signatures-adameus/div/div[2]/p[2]");
	By inputFirma=By.xpath("/html/body/app-root/app-home-layout/div/div/div/app-header-home/div/div/div[3]/div/div[1]/div/div[2]/app-signatures-adameus/div/div[2]/div[1]/input");
	By btnGuardar=By.xpath("/html/body/app-root/app-home-layout/div/div/div/app-header-home/div/div/div[3]/div/div[1]/div/div[2]/app-signatures-adameus/div/div[2]/div[2]/button");
	By imgNombre=By.xpath("/html/body/app-root/app-home-layout/div/div/div/app-header-home/div/div/div[3]/div/div[1]/a/div");
	By opcUsuarioFirma=By.xpath("/html/body/app-root/app-home-layout/div/div/div/app-header-home/div/div/div[3]/div/div[1]/div/div[2]/a[1]");
	
	
	
    public HomePage(WebDriver driver) {
        super(driver);
    }
	public void setReserva(String reserva) throws InterruptedException {
		isDisplayedReserva(inputReserva);
		type(inputReserva, reserva);
	}

	public void botonGestionar() throws InterruptedException {
		isDisplayed(buttonGestionar);
		click(buttonGestionar);
	}

	public String validarPopup() throws InterruptedException {
		espera("/html/body/div/div");
		isDisplayed(alerta);
		isDisplayed(textoAlerta);
		return getText(textoAlerta);
	}
	
	
	//METODOS PARA HOME.
	public String descripcionPrincipal() {
		String desPrincipal=getText(descripcionPrincipal);
		return desPrincipal;
	}
	public String tituloPrincipal() {
		String tituloprincipal=getText(tituloPrincipal);
		return tituloprincipal;
	}
	public void logoAvianca() throws InterruptedException {
		isDisplayed(logo);
	}
	public String getTituloPagina() {
		return getTittlePage();
	}
	public String mensajePrincipal() throws InterruptedException {
		return getText(mensajePrincipal);
	}
	public String nombreAsesor() {
		return getText(nombreAsesor);
	}
	public void desplegarOpc() throws InterruptedException {
		click(iconoPerfil);
	}
	public void cerrarSesion() throws InterruptedException {
		click(opcCerrarSesion);
		Thread.sleep(4*1000);
	}
	public boolean longitudFirma(String firma) {
		if(firma.length()==6) {
			return true;
		}else {
			return false;
			}
	}

	public void getTituloDetallesReserva() throws InterruptedException {
		 isDisplayed(tituloDetallesReserva);
	}
	
}
