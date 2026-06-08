package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectPage {

    private WebDriver driver;

    private By selectLinguagem = By.id("language-select");

    public SelectPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selecionarLinguagem(String valor) {
        Select select = new Select(driver.findElement(selectLinguagem));
        select.selectByValue(valor);
    }

    public String obterLinguagemSelecionada() {
        Select select = new Select(driver.findElement(selectLinguagem));
        return select.getFirstSelectedOption().getAttribute("value");
    }
}
