package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_004Page {

    WebDriver driver;

    By uploadButton = By.id("uploadButton");
    By documentAdminSection = By.id("adminSection");
    By metadataSection = By.id("metadata");

    public tc_004Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToDocumentUploadPage() {
        driver.get("http://example.com/upload");
    }

    public void uploadValidDocument() {
        WebElement uploadElement = driver.findElement(uploadButton);
        uploadElement.sendKeys("/path/to/valid/document.pdf");
        uploadElement.click();
    }

    public boolean isDocumentStoredSuccessfully() {
        // Logic to verify the document is stored in the database
        // This could involve checking notifications, database checks, etc.
        return true; // Placeholder for actual check
    }

    public boolean isDocumentListedWithCorrectMetadata() {
        driver.get("http://example.com/admin");
        WebElement documentElement = driver.findElement(documentAdminSection);
        
        // Extract metadata and validate
        String metadata = documentElement.findElement(metadataSection).getText();
        return metadata.contains("Expected Date") && metadata.contains("PDF Format") && metadata.contains("Expected Size");
    }
}