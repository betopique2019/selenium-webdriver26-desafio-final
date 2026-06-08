package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TextoPage {

    private WebDriver driver;

    private By textoEstatico = By.id("static-text");
    private By botaoMostrar = By.id("show-text-button");
    private By textoDinamico = By.id("dynamic-text");

    public TextoPage(WebDriver driver) {
        this.driver = driver;
    }

    public String obterTextoEstatico() {
        return driver.findElement(textoEstatico).getText();
    }

    public void clicarMostrarTexto() {
        driver.findElement(botaoMostrar).click();
    }

    public String obterTextoDinamico() {
        return driver.findElement(textoDinamico).getText();
    }
}
