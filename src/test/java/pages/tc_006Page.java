package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Objects;

public class tc_006Page {

    private WebDriver driver;

    private By uploadButton = By.id("uploadButton");
    private By downloadLink = By.id("downloadLink");

    public tc_006Page(WebDriver driver) {
        this.driver = driver;
    }

    public void uploadDocument(File document) {
        WebElement uploadElement = driver.findElement(uploadButton);
        uploadElement.sendKeys(document.getAbsolutePath());
        // Implement more logic if needed, such as clicking a "Submit" button
    }

    public boolean isUploadSuccessful() {
        // Implement verification logic here
        return true;
    }

    public File downloadDocument() {
        WebElement downloadElement = driver.findElement(downloadLink);
        String downloadPath = downloadElement.getAttribute("href");
        // Implement logic to download the file
        return new File(downloadPath);
    }

    public boolean compareDocuments(File original, File downloaded) {
        try {
            byte[] originalBytes = Files.readAllBytes(Paths.get(original.toURI()));
            byte[] downloadedBytes = Files.readAllBytes(Paths.get(downloaded.toURI()));

            return Objects.equals(originalBytes, downloadedBytes);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}