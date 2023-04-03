package net.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	//protected ChromeDriver driver;
    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }
   /* public BasePage() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\npaezbuitrag\\eclipse-workspace\\CucumberTest\\src\\test\\resources\\chromeDriver\\chromeDriver.exe");
        driver = new ChromeDriver();
    }*/

    protected void navigateToUrl(String url) {
        driver.get(url);
    }
	public void cerrarNavegador() {
		driver.close();
	}
    
	public String getTittlePage() {
		String titulo=driver.getTitle();
		return titulo;
	}
    
    protected void espera(String xpath) {
    	WebDriverWait wait = new WebDriverWait(driver, 20);
    	WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
    }

    protected void click(By locator) {
        driver.findElement(locator).click();
    }
    
    protected void isDisplayed(By locator) throws InterruptedException {
    	do {
    		Thread.sleep(4*1000);
    	}while(driver.findElement(locator).isDisplayed() == false);
    }
    
   
    
    protected void isDisplayed(By locator, int tiempo) throws InterruptedException {
    	do {
    		Thread.sleep(tiempo*1000);
    	}while(driver.findElement(locator).isDisplayed() == false);
    }
    protected void isDisplayedReserva(By locator) throws InterruptedException {
    	do {
    		Thread.sleep(6*1000);
    	}while(driver.findElement(locator).isDisplayed() == false);
    }
    
	public static void wait(int segundos) {
		try{
			Thread.sleep(segundos*1000);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

    protected void type(By locator, String text) {
        WebElement element = driver.findElement(locator);
        element.sendKeys(text);
    }
    
    protected String getText(By locator) {
        WebElement element = driver.findElement(locator);
        return element.getText();
    }

}
