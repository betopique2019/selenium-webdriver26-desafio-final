package tests;

import base.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.EscritaPage;

public class CenarioValidarEscritaTest extends BaseTest {

    @Test
    public void devePreencherCamposDeEscrita() {
        EscritaPage escrita = new EscritaPage(driver);

        String nome = "Roberto";
        String email = "betopique.2024@gmail.com";
        String mensagem = "Mensagem de sucesso";

        escrita.preencherNome(nome);
        escrita.preencherEmail(email);
        escrita.preencherMensagem(mensagem);

        Assertions.assertEquals(nome, escrita.obterNome());
        Assertions.assertEquals(email, escrita.obterEmail());
        Assertions.assertEquals(mensagem, escrita.obterMensagem());
    }
}
