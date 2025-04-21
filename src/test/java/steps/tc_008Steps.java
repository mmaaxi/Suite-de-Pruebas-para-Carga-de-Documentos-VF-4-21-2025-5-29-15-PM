package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_008Page;

public class tc_008Steps {
    tc_008Page page = new tc_008Page();

    @Given("el usuario está en la página de carga de archivos")
    public void usuarioEnPaginaCargaArchivos() {
        page.navigateToUploadPage();
    }

    @When("intenta cargar un archivo dañado o corrupto")
    public void intentaCargarArchivoCorrupto() {
        page.uploadCorruptFile();
    }

    @Then("el sistema no debe proceder con la carga")
    public void sistemaNoProcedeConCarga() {
        Assert.assertFalse(page.isFileUploaded());
    }

    @Then("el usuario debe recibir un mensaje específico sobre el problema del archivo")
    public void usuarioRecibeMensajeError() {
        Assert.assertTrue(page.isErrorMessageDisplayedForCorruptFile());
    }
}