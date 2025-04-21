package steps;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import pages.tc_009Page;

public class tc_009Steps {
    WebDriver driver;
    tc_009Page documentPreviewPage = new tc_009Page(driver);

    @Given("el usuario carga un documento válido")
    public void el_usuario_carga_un_documento_válido() {
        documentPreviewPage.loadValidDocument();
    }

    @When("solicita la vista previa del documento")
    public void solicita_la_vista_previa_del_documento() {
        documentPreviewPage.requestDocumentPreview();
    }

    @Then("el sistema genera una vista previa visual que permite confirmar el contenido del documento")
    public void el_sistema_genera_una_vista_previa_visual() {
        boolean previewGenerated = documentPreviewPage.isPreviewDisplayed();
        assert(previewGenerated);
    }

    @And("la vista previa muestra correctamente todos los elementos esenciales del documento")
    public void la_vista_previa_muestra_correctamente_todos_los_elementos() {
        boolean elementsCorrect = documentPreviewPage.areDocumentElementsDisplayedCorrectly();
        assert(elementsCorrect);
    }

    @And("no hay errores en la representación del contenido del archivo")
    public void no_hay_errores_en_la_representación() {
        boolean noErrors = documentPreviewPage.isContentCorrect();
        assert(noErrors);
    }
}