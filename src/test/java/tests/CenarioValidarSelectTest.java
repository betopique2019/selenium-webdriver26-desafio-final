package tests;

import base.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.SelectPage;

public class SelectTest extends BaseTest {

    @Test
    public void deveSelecionarLinguagemJavaNoSelect() {
        SelectPage selectPage = new SelectPage(driver);

        selectPage.selecionarLinguagem("java");

        String selecionada = selectPage.obterLinguagemSelecionada();
        Assertions.assertEquals("java", selecionada);
    }
}
