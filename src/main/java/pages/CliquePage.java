package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CliquePage {

    private WebDriver driver;

    private By botaoClique = By.id("click-button");
    private By mensagemClique = By.id("click-message");

    public CliquePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clicarBotao() {
        driver.findElement(botaoClique).click();
    }

    public String obterMensagemClique() {
        return driver.findElement(mensagemClique).getText();
    }
}
