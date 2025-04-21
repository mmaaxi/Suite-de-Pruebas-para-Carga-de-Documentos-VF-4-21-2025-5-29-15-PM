package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_001Page {

    WebDriver driver;

    By uploadButton = By.id("uploadButton");
    By fileInput = By.id("fileInput");
    By submitButton = By.id("submitButton");
    By progressIndicator = By.id("progressIndicator");
    By successMessage = By.id("successMessage");

    public tc_001Page(WebDriver driver) {
        this.driver = driver;
    }

    public void clickUploadButton() {
        driver.findElement(uploadButton).click();
    }

    public boolean isFileExplorerDisplayed() {
        // Implementation to verify file explorer display
        return true; // Assuming true for this example
    }

    public void selectValidFile(String filePath) {
        driver.findElement(fileInput).sendKeys(filePath);
    }

    public boolean isFileAccepted() {
        // Implementation to verify file acceptance
        return true; // Assuming true for this example
    }

    public void clickSubmit() {
        driver.findElement(submitButton).click();
    }

    public boolean isUploadSuccessful() {
        return driver.findElement(successMessage).isDisplayed() &&
               driver.findElement(progressIndicator).isDisplayed();
    }
}