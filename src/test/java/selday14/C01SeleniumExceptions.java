package selday14;

import com.aventstack.extentreports.Status;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBaseReport;

public class C01SeleniumExceptions extends TestBaseReport {

    @Test
    public void test01(){
        extentTest.log(Status.INFO, "this is the details for test01");
        driver.get("https://www.google.com");

        WebElement inputArea = driver.findElement(By.id("APjFqb"));
        inputArea.sendKeys("selenium exceptions" + Keys.ENTER);

        inputArea = driver.findElement(By.id("APjFqb"));
        inputArea.clear();
        //driver.switchTo().alert().getText();

        driver.quit();
        Assert.fail();

    }


    @Test
    public void elementClickInterceptExceptionTest(){
        extentTest.log(Status.INFO, "this is the details for test02");
        driver.get("https://demoqa.com/radio-button");
        driver.findElement(By.id("yesRadio"));
        Assert.assertTrue(true);
    }

    @Test
    public void nullPointerTest(){
        extentTest.log(Status.INFO, "this is the details for test03");
        String newString = "null";
        System.out.println(newString.length());

        Assert.assertTrue(newString.length()>0);

    }
}