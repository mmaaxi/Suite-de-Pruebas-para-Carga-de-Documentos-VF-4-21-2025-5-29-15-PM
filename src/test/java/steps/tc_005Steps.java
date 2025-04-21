package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.tc_005Page;
import static org.junit.Assert.*;

public class tc_005Steps {

    tc_005Page page = new tc_005Page();

    @Given("a user uploads a document")
    public void userUploadsDocument() {
        page.uploadDocument();
    }

    @When("the user accesses the document viewing module")
    public void userAccessesDocumentViewingModule() {
        page.accessDocumentViewer();
    }

    @Then("the document should open without errors in the integrated viewer")
    public void documentOpensWithoutErrors() {
        assertTrue(page.isDocumentOpenSuccessfully());
    }

    @Given("the document is open in the viewer")
    public void documentIsOpenInViewer() {
        assertTrue(page.isDocumentOpenSuccessfully());
    }

    @When("the user checks the displayed metadata")
    public void userChecksDisplayedMetadata() {
        page.checkDisplayedMetadata();
    }

    @Then("the system should display the correct document information")
    public void systemDisplaysCorrectInformation() {
        assertTrue(page.isMetadataCorrect());
    }
}