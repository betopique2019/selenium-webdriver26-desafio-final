package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckboxPage {

    private WebDriver driver;

    private By checkJava = By.id("java-checkbox");
    private By checkPython = By.id("python-checkbox");
    private By checkSelenium = By.id("selenium-checkbox");

    public CheckboxPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selecionarJava() {
        if (!driver.findElement(checkJava).isSelected()) {
            driver.findElement(checkJava).click();
        }
    }

    public void desmarcarPython() {
        if (driver.findElement(checkPython).isSelected()) {
            driver.findElement(checkPython).click();
        }
    }

    public void desmarcarSelenium() {
        if (driver.findElement(checkSelenium).isSelected()) {
            driver.findElement(checkSelenium).click();
        }
    }

    public boolean isJavaSelecionado() {
        return driver.findElement(checkJava).isSelected();
    }

    public boolean isPythonSelecionado() {
        return driver.findElement(checkPython).isSelected();
    }

    public boolean isSeleniumSelecionado() {
        return driver.findElement(checkSelenium).isSelected();
    }
}
