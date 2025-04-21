package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class tc_008Page {
    private WebDriver driver;
    private WebDriverWait wait;
    private By uploadButton = By.id("uploadButton");
    private By errorMessage = By.id("errorMessage");

    public tc_008Page(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
    }

    public void navigateToUploadPage() {
        driver.get("https://example.com/upload");
    }

    public void uploadCorruptFile() {
        WebElement uploadElement = driver.findElement(uploadButton);
        uploadElement.sendKeys("path/to/corrupt/file");
    }

    public boolean isFileUploaded() {
        return wait.until(ExpectedConditions.invisibilityOfElementLocated(uploadButton));
    }

    public boolean isErrorMessageDisplayedForCorruptFile() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(errorMessage)).isDisplayed();
    }
}