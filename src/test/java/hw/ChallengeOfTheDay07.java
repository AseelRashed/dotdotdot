package hw;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class ChallengeOfTheDay07 {


    /*
    Task 3:
navigate to https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver
click on "Click me, to Open an alert after 5 seconds" button
click on accept alert
click on "Change Text to Selenium Webdriver"
verify "Selenium Webdriver" message is displayed
     */

    static WebDriver driver;

    @BeforeClass
    public static void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
    }


    @AfterClass
    public static void tearDown() {
        // driver.quit();
    }



    @Test
    public void ch7(){


        driver.findElement(By.id("alert")).click();
        //Thread.sleep('5');
        driver.switchTo().alert().accept();

        //Alert alert =driver.switchTo().alert();
        //String alertMessage = alert.getText();
        //System.out.println("alertMessage = " + alertMessage);
//
        //alert.accept();




    }

}
