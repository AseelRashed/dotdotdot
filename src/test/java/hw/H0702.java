package hw;


import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;



public class H0702 {


        static WebDriver driver;


        @BeforeClass
        public static void setup(){


            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        }


        @AfterClass
        public static void tearDown(){


            //driver.quit();


        }


        @Test
        public void signIn() throws InterruptedException {



            driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
            Thread.sleep(3000);
            WebElement aM = driver.findElement(By.xpath("(//p[contains(text(),'Congratulations! You must have the proper credenti')])"));
            Assert.assertTrue(aM.isDisplayed());



        }



    }

