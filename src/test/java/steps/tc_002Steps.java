package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_002Page;

public class tc_002Steps {

    tc_002Page documentUploadPage = new tc_002Page();

    @Given("^Estoy en la página de carga de documentos$")
    public void estoyEnLaPaginaDeCargaDeDocumentos() {
        documentUploadPage.navigateToUploadPage();
    }

    @When("^Intento cargar un archivo con formato \"([^\"]*)\"$")
    public void intentoCargarUnArchivoConFormatoNoSoportado(String fileType) {
        documentUploadPage.uploadFile(fileType);
    }

    @Then("^El sistema debe mostrar un mensaje de error de formato no soportado$")
    public void elSistemaDebeMostrarUnMensajeDeError() {
        Assert.assertTrue(documentUploadPage.isUnsupportedFormatErrorDisplayed());
    }

    @Then("^Verifico que no se ha almacenado ningún dato del archivo$")
    public void verificoQueNoSeHaAlmacenadoNingunDato() {
        Assert.assertFalse(documentUploadPage.isFileDataStored());
    }
}