package hw;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class H0701 {


    static WebDriver driver;


    @BeforeClass
    public static void setup(){


        driver = new ChromeDriver();
        driver.manage().window().maximize();


        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");


    }
    @AfterClass
    public static void tearDown(){


        //driver.quit();


    }



    @Test
    public void Test(){



        WebElement jsAlert = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
        jsAlert.click();
        Alert alert = driver.switchTo().alert() ;
        alert.accept();



    }


    @Test
    public void Test2(){



        WebElement jsConfirm = driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
        jsConfirm.click();
        Alert alert = driver.switchTo().alert() ;
        alert.accept();



    }
    @Test
    public void Test3(){



        WebElement jsPrompt = driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
        jsPrompt.click();
        Alert alert = driver.switchTo().alert() ;

        alert.sendKeys("\"Hi, Im Aseel ALzahrani\")");
        alert.accept();
        WebElement rslt = driver.findElement(By.id("result"));
        Assert.assertTrue(rslt.isDisplayed());



    }




}
