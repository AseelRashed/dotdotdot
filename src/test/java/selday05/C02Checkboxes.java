package selday05;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class C02Checkboxes {


    static WebDriver driver;


    @BeforeClass
    public static void setUp(){

        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");

        driver = new ChromeDriver(options);
        driver.get("https://the-internet.herokuapp.com/checkboxes");

    }


    @AfterClass
    public static void tearUp(){

        driver.quit();

    }


    @Test
    public void checkboxTest(){


        List<WebElement> checkboxes = driver.findElements(By.xpath("//*[@type='checkbox']"));

        if(!checkboxes.get(0).isSelected()){

            checkboxes.get(0).click();
            //checkboxes.get(0).sendKeys(keys.SPACE);

            System.out.println("checbox 1 have been selected");

        } else {

            System.out.println("checkbox 1 is already selected");

        }


        if(!checkboxes.get(1).isSelected()){

            checkboxes.get(1).click();
            //checkboxes.get(1).sendKeys(keys.SPACE);

            System.out.println("checkbox 2 is selected");
        } else {

            System.out.println("checkbox 2 is already selected");

        }

        Assert.assertTrue(checkboxes.get(0).isSelected());
        Assert.assertTrue(checkboxes.get(1).isSelected());

        // Assert.assertTrue(checkboxes.get(0).isSelected());




    }

}
