package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import static org.junit.Assert.*;

public class tc_005Page {
    WebDriver driver;

    // Document viewer elements
    By viewerElement = By.id("document-viewer");
    By metadataElement = By.id("metadata-display");

    public tc_005Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void uploadDocument() {
        // Code to upload the document
    }

    public void accessDocumentViewer() {
        // Code to open the document viewer
    }

    public boolean isDocumentOpenSuccessfully() {
        // Implementation to check if document opened without errors
        WebElement viewer = driver.findElement(viewerElement);
        return viewer.isDisplayed();
    }

    public void checkDisplayedMetadata() {
        // Code to verify metadata elements
    }

    public boolean isMetadataCorrect() {
        // Check if the metadata displayed matches expected values
        WebElement metadata = driver.findElement(metadataElement);
        return metadata.getText().contains("Expected Metadata");
    }
}