package steps;

import pages.tc_007Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class tc_007Steps {
    tc_007Page page = new tc_007Page();

    @Given("El usuario está en la página de carga de archivos")
    public void elUsuarioEstaEnLaPaginaDeCargaDeArchivos() {
        page.navigateToUploadPage();
    }

    @When("Hace clic en el botón de carga sin seleccionar archivo")
    public void haceClicEnElBotonDeCargaSinSeleccionarArchivo() {
        page.clickUploadButton();
    }

    @Then("El sistema impide la carga y muestra un mensaje de advertencia de que se requiere un archivo")
    public void elSistemaImpideLaCargaYSeMuestraAdvertencia() {
        Assert.assertTrue(page.isWarningMessageDisplayed());
    }
}