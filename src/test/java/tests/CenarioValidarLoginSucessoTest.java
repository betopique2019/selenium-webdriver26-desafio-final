package tests;

import base.BaseTest;
import org.junit.jupiter.api.Test;
import pages.LoginPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CenarioValidarLoginSucessoTest extends BaseTest {

    @Test
    public void deveRealizarLoginComSucesso() {
        LoginPage login = new LoginPage(driver);

        login.preencherUsuario("usuario");
        login.preencherSenha("senha");
        login.clicarEntrar();

        assertEquals("Login realizado com sucesso!", login.obterMensagemSucesso());
    }
}
