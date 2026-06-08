package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;

    private By usuario = By.id("login-user");
    private By senha = By.id("login-password");
    private By botaoEntrar = By.id("login-button");

    private By mensagemSucesso = By.id("success-message");
    private By mensagemErro = By.id("login-result");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void preencherUsuario(String valor) {
        driver.findElement(usuario).sendKeys(valor);
    }

    public void preencherSenha(String valor) {
        driver.findElement(senha).sendKeys(valor);
    }

    public void clicarEntrar() {
        driver.findElement(botaoEntrar).click();
    }

    public boolean loginComSucesso() {
        return driver.findElement(mensagemSucesso).isDisplayed();
    }

    public String obterMensagemErro() {
        return driver.findElement(mensagemErro).getText();
    }
}
