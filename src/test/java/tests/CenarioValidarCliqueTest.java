package tests;

import base.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.EscritaPage;
import pages.CliquePage;

public class CliqueTest extends BaseTest {

    @Test
    public void deveMostrarMensagemAoClicarBotaoDepoisDePreencherCampos() {
        EscritaPage escrita = new EscritaPage(driver);
        CliquePage clique = new CliquePage(driver);

        escrita.preencherNome("Roberto");
        escrita.preencherEmail("betopique.2024@gmail.com");
        escrita.preencherMensagem("Mensagem de sucesso");

        clique.clicarBotao();

        String mensagem = clique.obterMensagemClique();
        Assertions.assertTrue(mensagem.toLowerCase().contains("sucesso"));
    }
}
