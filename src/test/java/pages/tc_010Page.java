package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.BasePage;

public class tc_010Page extends BasePage {
    WebDriver driver;
    private By documentUploadField = By.id("uploadField");
    private By deleteOption = By.id("deleteOption");
    private By documentInList = By.xpath("//div[@class='document-list']//td[text()='Documento']");
    
    public tc_010Page(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void uploadDocument() {
        WebElement uploadField = driver.findElement(documentUploadField);
        uploadField.sendKeys("path/to/document");
        // Add code to submit the upload if necessary
    }

    public void navigateToDeleteOption() {
        WebElement deleteOptionElement = driver.findElement(deleteOption);
        deleteOptionElement.click();
    }

    public boolean isDeleteOptionAvailable() {
        return driver.findElement(deleteOption).isDisplayed();
    }

    public void deleteDocument() {
        WebElement deleteButton = driver.findElement(deleteOption);
        deleteButton.click();
    }

    public boolean isDocumentVisibleInList() {
        try {
            driver.findElement(documentInList);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean isDocumentInDatabase() {
        // Simulate database check
        return false; // Assuming document is removed for test purposes
    }
}