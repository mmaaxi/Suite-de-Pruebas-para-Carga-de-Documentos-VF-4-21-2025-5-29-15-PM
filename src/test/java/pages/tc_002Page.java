package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.DriverFactory;

public class tc_002Page {
    WebDriver driver = DriverFactory.getDriver();

    private By uploadField = By.id("uploadField");
    private By errorMessage = By.id("errorMessage");
    private By fileDataLog = By.id("fileDataLog");

    public void navigateToUploadPage() {
        driver.get("http://example.com/document-upload");
    }

    public void uploadFile(String fileType) {
        String filePath = "path/to/file." + fileType; // Replace with actual path
        driver.findElement(uploadField).sendKeys(filePath);
    }

    public boolean isUnsupportedFormatErrorDisplayed() {
        return driver.findElement(errorMessage).isDisplayed();
    }

    public boolean isFileDataStored() {
        return !driver.findElements(fileDataLog).isEmpty();
    }
}