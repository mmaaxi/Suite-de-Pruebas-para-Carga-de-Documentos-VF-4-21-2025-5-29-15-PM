package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_006Page;
import java.io.File;

public class tc_006Steps {

    tc_006Page documentPage = new tc_006Page();
    File originalDocument;
    File downloadedDocument;

    @Given("un documento conocido y previamente validado")
    public void un_documento_conocido_y_previamente_validado() {
        originalDocument = new File("path/to/original/document.pdf");
        Assert.assertTrue("Documento original no encontrado", originalDocument.exists());
    }

    @When("se carga el documento al sistema")
    public void se_carga_el_documento_al_sistema() {
        documentPage.uploadDocument(originalDocument);
    }

    @Then("el contenido del documento debe permanecer sin modificaciones")
    public void el_contenido_del_documento_debe_permanecer_sin_modificaciones() {
        Assert.assertTrue("El documento no fue cargado correctamente", documentPage.isUploadSuccessful());
    }

    @When("se descarga el documento del sistema")
    public void se_descarga_el_documento_del_sistema() {
        downloadedDocument = documentPage.downloadDocument();
    }

    @Then("el documento descargado no debe tener alteraciones o pérdida de datos")
    public void el_documento_descargado_no_debe_tener_alteraciones_o_pérdida_de_datos() {
        Assert.assertTrue("El documento descargado es diferente al original", documentPage.compareDocuments(originalDocument, downloadedDocument));
    }
}