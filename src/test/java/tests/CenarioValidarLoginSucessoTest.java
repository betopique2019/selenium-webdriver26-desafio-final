package tests;

import base.BaseTest;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.LoginPage;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CenarioValidarLoginSucessoTest extends BaseTest {

    @Test
    public void deveRealizarLoginComSucesso() {

        LoginPage login = new LoginPage(driver);

        login.preencherUsuario("admin");
        login.preencherSenha("123456");
        login.clicarEntrar();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(login.getMensagemSucessoLocator()));

        String texto = login.obterMensagemSucesso();

        assertTrue(texto.contains("Login realizado com sucesso!"));
        assertTrue(texto.contains("Bem-vindo à área autenticada do sistema."));
    }
}