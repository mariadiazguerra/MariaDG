package com.bdd.web.stepdefinitions;
import com.bdd.web.steps.SeleniumSteps;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.junit.Assert;

public class SeleniumStepdefs {
    SeleniumSteps seleniumStep = new SeleniumSteps();

    @Dado("que estoy en la página de inicio de selenium")
    public void que_estoy_en_la_página_de_inicio_de_selenium() throws InterruptedException {
        seleniumStep.que_estoy_en_la_página_de_inicio_de_selenium();
    }

    @Cuando("la página se carga completamente")
    public void laPáginaSeCargaCompletamente() {
    }

    @Entonces("debería ver el título {string}")
    public void deberíaVerElTítulo(String titulo) {
        Assert.assertEquals(seleniumStep.validoTitulo(), titulo);
    }

    @Cuando("hago clic en el enlace {string}")
    public void hagoClicEnElEnlace(String arg0) {
        seleniumStep.hagoClicEnElEnlace();
    }

    @Entonces("debería ser redirigido a la página de Documentación")
    public void deberíaSerRedirigidoALaPáginaDeDocumentación() {
        seleniumStep.debería_Ser_Redirigido_A_La_Página_De_Documentación();
    }

    @Y("hago clic en buscar")
    public void hagoClicEnBuscar() {
        seleniumStep.hagoClicEnBuscar();
    }

    @Y("hago clic en search docs")
    public void hagoClicEnSearchDocs() {
        seleniumStep.hagoClicEnSearchDocs();
    }

    @Y("escribo la palabra clave {string} en el campo de búsqueda")
    public void escriboLaPalabraClaveEnElCampoDeBúsqueda(String consulta) throws InterruptedException {
        seleniumStep.escriboPalabraKey(consulta);
    }

    @Entonces("valido el resultado relacionado con {string}")
    public void validoElResultadoRelacionadoCon(String resultado) {
        Assert.assertEquals(seleniumStep.validarResultado(), resultado);
    }

    @Y("Cierra la pagina Selenium")
    public void cierraLaPaginaSelenium() {
        seleniumStep.cierraLaPaginaSelenium();
    }
}
