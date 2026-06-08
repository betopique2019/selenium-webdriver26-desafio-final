package tests;

import base.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.CheckboxPage;

public class CenarioValidarCheckboxTest extends BaseTest {

    @Test
    public void deveSelecionarApenasJavaNosCheckboxes() {
        CheckboxPage checkbox = new CheckboxPage(driver);

        checkbox.selecionarJava();
        checkbox.desmarcarPython();
        checkbox.desmarcarSelenium();

        Assertions.assertTrue(checkbox.isJavaSelecionado());
        Assertions.assertFalse(checkbox.isPythonSelecionado());
        Assertions.assertFalse(checkbox.isSeleniumSelecionado());
    }
}
