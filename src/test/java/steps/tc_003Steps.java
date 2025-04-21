package steps;

import org.junit.Assert;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.tc_003Page;

public class tc_003Steps {
    tc_003Page page = new tc_003Page();

    @When("I select a file larger than the allowed size for upload")
    public void i_select_a_file_larger_than_the_allowed_size_for_upload() {
        page.selectLargeFile();
    }

    @Then("the system should detect the size excess and block the upload")
    public void the_system_should_detect_the_size_excess_and_block_the_upload() {
        Assert.assertTrue(page.isUploadBlocked());
    }

    @Then("an error message should inform the maximum permitted size and request a compliant file")
    public void an_error_message_should_inform_the_maximum_permitted_size_and_request_a_compliant_file() {
        String expectedMessage = "File size exceeds the maximum limit. Please upload a file within the allowed size.";
        Assert.assertEquals(expectedMessage, page.getErrorMessage());
    }
}