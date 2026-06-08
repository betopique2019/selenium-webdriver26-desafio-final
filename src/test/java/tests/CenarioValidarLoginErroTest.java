package tests;

import base.BaseTest;
import org.junit.jupiter.api.Test;
import pages.LoginPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CenarioValidarLoginErroTest extends BaseTest {

    @Test
    public void deveExibirMensagemDeErroAoFalharLogin() {
        LoginPage login = new LoginPage(driver);

        login.preencherUsuario("usuario_invalido");
        login.preencherSenha("senha_invalida");
        login.clicarEntrar();

        assertEquals("Usuário ou senha inválidos.", login.obterMensagemErro());
    }
}
