package tests;

import base.BaseTest;
import org.junit.jupiter.api.Test;
import pages.TextoPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CenarioValidarTextoTest extends BaseTest {

    @Test
    public void deveExibirTextoDinamicoAoClicarNoBotao() {
        TextoPage texto = new TextoPage(driver);

        // Valida texto estático
        assertEquals("Este texto pode ser validado pelo Selenium.", texto.obterTextoEstatico());

        // Clica no botão
        texto.clicarMostrarTexto();

        // Valida texto dinâmico
        assertEquals("Texto dinâmico exibido com sucesso!", texto.obterTextoDinamico());
    }
}
