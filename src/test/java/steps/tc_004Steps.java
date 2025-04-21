package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.*;

import pages.tc_004Page;

public class tc_004Steps {

    tc_004Page page = new tc_004Page();

    @Given("el usuario está en la página de carga de documentos")
    public void elUsuarioEstaEnLaPaginaDeCargaDeDocumentos() {
        page.navigateToDocumentUploadPage();
    }

    @When("el usuario carga un documento válido")
    public void elUsuarioCargaUnDocumentoValido() {
        page.uploadValidDocument();
    }

    @Then("el sistema debe almacenar el documento correctamente")
    public void elSistemaDebeAlmacenarElDocumentoCorrectamente() {
        assertTrue(page.isDocumentStoredSuccessfully());
    }

    @Then("el documento debe aparecer en la sección de administración con los metadatos correctos")
    public void elDocumentoDebeAparecerEnLaSeccionDeAdministracionConLosMetadatosCorrectos() {
        assertTrue(page.isDocumentListedWithCorrectMetadata());
    }
}