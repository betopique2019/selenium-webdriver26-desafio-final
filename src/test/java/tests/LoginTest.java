package tests;

import base.BaseTest;
import org.junit.jupiter.api.Test;
import pages.LoginPage;

import static org.junit.jupiter.api.Assertions.*;

public class LoginTest extends BaseTest {

    @Test
    public void deveRealizarLoginComMensagemDeSucesso() {
        LoginPage login = new LoginPage(driver);

        login.preencherUsuario("admin");
        login.preencherSenha("123456");
        login.clicarEntrar();

        assertTrue(login.loginComSucesso());
    }

    @Test
    public void deveExibirMensagemDeErroQuandoLoginForInvalido() {
        LoginPage login = new LoginPage(driver);

        login.preencherUsuario("usuarioErrado");
        login.preencherSenha("senhaErrada");
        login.clicarEntrar();

        assertEquals("Usuário ou senha inválidos.", login.obterMensagemErro());
    }
}