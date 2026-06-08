package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EscritaPage {

    private WebDriver driver;

    private By nome = By.id("name-input");
    private By email = By.id("email-input");
    private By mensagem = By.id("message-textarea");

    public EscritaPage(WebDriver driver) {
        this.driver = driver;
    }

    public void preencherNome(String valor) {
        driver.findElement(nome).sendKeys(valor);
    }

    public void preencherEmail(String valor) {
        driver.findElement(email).sendKeys(valor);
    }

    public void preencherMensagem(String valor) {
        driver.findElement(mensagem).sendKeys(valor);
    }

    public String obterNome() {
        return driver.findElement(nome).getAttribute("value");
    }

    public String obterEmail() {
        return driver.findElement(email).getAttribute("value");
    }

    public String obterMensagem() {
        return driver.findElement(mensagem).getAttribute("value");
    }
}
