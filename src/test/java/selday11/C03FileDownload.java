package selday11;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class C03FileDownload extends TestBase {

    @Test
    public void test() throws InterruptedException, IOException {

        String s = "/Users/suleymankirkil/Downloads";
        String separater = System.getProperty("file.separator");
        String pathOfFile = System.getProperty("user.home")+ separater+"Downloads"+separater+"Test.txt";

        //    Go to URL: https://the-internet.herokuapp.com/download
        driver.get("https://the-internet.herokuapp.com/download");

        //    Download selenium-snapshot.png
        Files.deleteIfExists(Path.of(pathOfFile));
        driver.findElement(By.linkText("Test.txt")).click();
        Thread.sleep(500);
        //    Verify if the file downloaded successfully.


        boolean isExist = Files.exists(Paths.get(pathOfFile));
        Assert.assertTrue(isExist);

    }
}