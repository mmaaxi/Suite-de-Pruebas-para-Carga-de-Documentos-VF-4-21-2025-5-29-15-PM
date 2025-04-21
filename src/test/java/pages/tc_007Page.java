package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class tc_007Page {

    private WebDriver driver;
    private WebDriverWait wait;
    private By uploadButton = By.id("uploadButton"); // Cambiar a selector correcto
    private By warningMessage = By.id("warningMessage"); // Cambiar a selector correcto

    public tc_007Page(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
    }

    public void navigateToUploadPage() {
        driver.get("http://example.com/upload"); // Cambiar URL al correcto
    }

    public void clickUploadButton() {
        driver.findElement(uploadButton).click();
    }

    public boolean isWarningMessageDisplayed() {
        WebElement messageElement = wait.until(ExpectedConditions.visibilityOfElementLocated(warningMessage));
        return messageElement.isDisplayed();
    }
}