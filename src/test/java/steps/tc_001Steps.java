package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.tc_001Page;
import utils.DriverFactory;

public class tc_001Steps {

    WebDriver driver = DriverFactory.getDriver();
    tc_001Page uploadPage = new tc_001Page(driver);

    @Given("^El usuario está en la página de carga de documentos$")
    public void elUsuarioEstáEnLaPaginaDeCargaDeDocumentos() {
        driver.get("http://example.com/upload");
    }

    @When("^El usuario selecciona el botón de carga de documento$")
    public void elUsuarioSeleccionaElBotonDeCargaDeDocumento() {
        uploadPage.clickUploadButton();
    }

    @Then("^El explorador de archivos debe mostrarse$")
    public void elExploradorDeArchivosDebeMostrarse() {
        Assert.assertTrue(uploadPage.isFileExplorerDisplayed());
    }

    @When("^Elige un archivo en formato válido$")
    public void elijaUnArchivoEnFormatoValido() {
        uploadPage.selectValidFile("path/to/valid/file.pdf");
    }

    @Then("^El archivo debe ser aceptado por el sistema$")
    public void elArchivoDebeSerAceptadoPorElSistema() {
        Assert.assertTrue(uploadPage.isFileAccepted());
    }

    @When("^Hace clic en 'Cargar'$")
    public void haceClicEnCargar() {
        uploadPage.clickSubmit();
    }

    @Then("^El sistema debe mostrar un indicador de progreso y confirmar la carga exitosa$")
    public void elSistemaDebeMostrarUnIndicadorDeProgresoYConfirmarLaCargaExitosa() {
        Assert.assertTrue(uploadPage.isUploadSuccessful());
    }
}