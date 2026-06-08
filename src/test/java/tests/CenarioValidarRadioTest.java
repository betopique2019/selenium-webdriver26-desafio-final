package tests;

import base.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.RadioPage;

public class CenarioValidarRadioTest extends BaseTest {

    @Test
    public void deveSelecionarApenasPlenoNosRadios() {
        RadioPage radio = new RadioPage(driver);

        radio.selecionarPleno();

        Assertions.assertFalse(radio.isJuniorSelecionado());
        Assertions.assertTrue(radio.isPlenoSelecionado());
        Assertions.assertFalse(radio.isSeniorSelecionado());
    }
}
