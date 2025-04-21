package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_003Page {
    WebDriver driver;
    By uploadField = By.id("fileUploadInput");
    By errorMessage = By.id("error-message");

    public tc_003Page(WebDriver driver) {
        this.driver = driver;
    }

    public void selectLargeFile() {
        WebElement uploadElement = driver.findElement(uploadField);
        // Assuming the test file path is known and accessible
        uploadElement.sendKeys("/path/to/large/file.txt");
    }

    public boolean isUploadBlocked() {
        // Logic to verify if the upload button is disabled or any alternative indication
        // Here just a dummy condition for demonstration
        return !driver.findElement(uploadField).isEnabled();
    }

    public String getErrorMessage() {
        return driver.findElement(errorMessage).getText();
    }
}