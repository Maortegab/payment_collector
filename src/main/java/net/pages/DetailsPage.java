package net.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DetailsPage extends BasePage {
	
//	private By tituloFormulario=By.xpath("//body/app-root[1]/app-reservas-layout[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/app-pnr-details[1]/div[1]/div[1]/div[1]/div[1]/p[1]");
	private By tituloFormulario=By.xpath("(//p[@class='pnr-welcome-up'])[1]");
	 public DetailsPage(WebDriver driver) {
	        super(driver);
	 }
		public String validarTitulo() throws InterruptedException {
			isDisplayedReserva(tituloFormulario);
			return getText(tituloFormulario);
		}
		
}
