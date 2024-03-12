package selday12;

import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.TestBase;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class C04TakeScreenshot extends TestBase {


    @Test
    public void FP(){


        driver.get("https://www.linkedin.com");


        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);

        String date = new SimpleDateFormat("yyyy-MM-dd-hh-mm-ss").format(new Date());
        String sprtr = System.getProperty("file-seperator");
        File destnation = new File(System.getProperty("user-dir") + sprtr + "Test-output" + sprtr + "Screenshots" + sprtr + "linkedin" + date + ".png");


    }


}
