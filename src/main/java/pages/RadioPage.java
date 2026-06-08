package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RadioPage {

    private WebDriver driver;

    private By radioJunior = By.id("junior-radio");
    private By radioPleno = By.id("pleno-radio");
    private By radioSenior = By.id("senior-radio");

    public RadioPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selecionarPleno() {
        driver.findElement(radioPleno).click();
    }

    public boolean isJuniorSelecionado() {
        return driver.findElement(radioJunior).isSelected();
    }

    public boolean isPlenoSelecionado() {
        return driver.findElement(radioPleno).isSelected();
    }

    public boolean isSeniorSelecionado() {
        return driver.findElement(radioSenior).isSelected();
    }
}
