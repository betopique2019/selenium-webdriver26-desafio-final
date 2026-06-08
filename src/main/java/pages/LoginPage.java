package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;

    private By usuario = By.id("login-user");
    private By senha = By.id("login-password");
    private By botaoEntrar = By.id("login-button");

    // Sucesso aparece aqui
    private By mensagemSucesso = By.id("success-message");

    // Erro aparece aqui
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

    public String obterMensagemSucesso() {
        return driver.findElement(mensagemSucesso).getText();
    }

    public String obterMensagemErro() {
        return driver.findElement(mensagemErro).getText();
    }

    public By getMensagemSucessoLocator() {
        return mensagemSucesso;
    }

    public By getMensagemErroLocator() {
        return mensagemErro;
    }
}
