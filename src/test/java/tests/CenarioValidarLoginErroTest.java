package tests;

import base.BaseTest;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.LoginPage;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CenarioValidarLoginErroTest extends BaseTest {

    @Test
    public void deveExibirMensagemDeErroQuandoLoginInvalido() {

        LoginPage login = new LoginPage(driver);

        login.preencherUsuario("usuarioErrado");
        login.preencherSenha("senhaErrada");
        login.clicarEntrar();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(login.getMensagemErroLocator()));

        assertEquals("Usuário ou senha inválidos.", login.obterMensagemErro());
    }
}
