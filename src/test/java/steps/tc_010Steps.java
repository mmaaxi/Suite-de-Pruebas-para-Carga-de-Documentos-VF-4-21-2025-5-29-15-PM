package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_010Page;

public class tc_010Steps {

    tc_010Page page = new tc_010Page();

    @Given("^El usuario ha cargado un documento$")
    public void el_usuario_ha_cargado_un_documento() {
        page.uploadDocument();
    }

    @When("^El usuario accede a la opción de eliminación$")
    public void el_usuario_accede_a_la_opcion_de_eliminacion() {
        page.navigateToDeleteOption();
    }

    @Then("^El sistema debe permitir seleccionar y eliminar el documento$")
    public void el_sistema_permite_seleccionar_y_eliminar_el_documento() {
        Assert.assertTrue(page.isDeleteOptionAvailable());
        page.deleteDocument();
    }

    @Then("^El documento eliminado ya no debe aparecer en la lista$")
    public void el_documento_eliminado_no_aparece_en_lista() {
        Assert.assertFalse(page.isDocumentVisibleInList());
    }

    @Then("^El documento se debe eliminar permanentemente de la base de datos$")
    public void el_documento_se_elimina_permanentemente_de_la_base_de_datos() {
        Assert.assertFalse(page.isDocumentInDatabase());
    }
}