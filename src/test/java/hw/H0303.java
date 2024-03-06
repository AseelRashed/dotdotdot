package hw;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
public class H0303 {


        //Task 3:
        //Go to https://id.heroku.com/login.
        //Enter an e-mail address.
        //Enter a password.
        //Click on the Login button.
        //There was a problem with your login.
        //If text is visible, print "Registration Failed".
        //If the text is not visible, print "Registered".
        //Close all pages.

        static WebDriver driver;

        @BeforeClass
        public static void beforeC(){

            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            driver.manage().window().maximize();
            driver.get("https://id.heroku.com/login");
        }

        @AfterClass
        public static void tearDown(){
            driver.quit();
        }

        @Test
        public void task3(){
            driver.findElement(By.id("email")).sendKeys("AseelR.Alzahrani@gmail.com");
            driver.findElement(By.id("password")).sendKeys("702");
            driver.findElement(By.name("commit")).click();

            WebElement alert = driver.findElement(By.xpath("//div[@class='alert alert-danger']"));

            System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-danger']")).getText());
            if(alert.isDisplayed()){
                System.out.println("Registration Failed");
            }
            else {
                System.out.println("Registered");
            }

        }


}
