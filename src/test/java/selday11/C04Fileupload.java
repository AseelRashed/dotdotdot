package selday11;


import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class C04Fileupload extends TestBase {
   /* Go to URL: https://the-internet.herokuapp.com/upload
    Find the path of the file that you want to upload.
    Click on Upload button.
    Verify the upload message.

    */

    @Test
    public void test(){
        By uploadId = By.id("file-upload");
        String userDir = System.getProperty("user.dir");
        String sep = System.getProperty("file.separator");
        String fileName = "FileExist";
        String path = userDir + sep + fileName;


        // Go to URL: https://the-internet.herokuapp.com/upload
        driver.get("https://the-internet.herokuapp.com/upload");

        // Find the path of the file that you want to upload.
        WebElement selectFile = driver.findElement(uploadId);
        selectFile.sendKeys(path);

        // Click on Upload button.
        driver.findElement(By.id("file-submit")).click();
        // Verify the upload message.
        WebElement uploadedMsj = driver.findElement(By.xpath("//h3[.='File Uploaded!']"));
        Assert.assertTrue(uploadedMsj.isDisplayed());
    }

}
