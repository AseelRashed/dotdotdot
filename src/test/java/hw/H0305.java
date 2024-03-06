package hw;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class H0305 {


        //Go to URL: https://www.linkedin.com/
        //Locate the "Email or phone", "password", "Sign in" button using absolute xpath and relative xpath.
        static WebDriver driver;

        @BeforeClass
        public static void beforeC() {
            driver = new ChromeDriver();
        }

        @AfterClass
        public static void tearDown(){
            driver.quit();
        }

        @Test
        public void task5() throws InterruptedException {
            driver.get("https://www.linkedin.com/ ");
            //Absolute  path
            driver.findElement(By.xpath("/html/body/main/section[1]/div/div/form/div[1]/div[1]/div/div/input")).sendKeys("AseelR.Alzahrani@gmail.com");
            //Relative path
            driver.findElement(By.xpath("//*[@id='session_password']")).sendKeys("702");
            //Relative path
            driver.findElement(By.xpath("//button[@data-id='sign-in-form__submit-btn']")).click();  //Relative path ,
            Thread.sleep(3000);

        }

}
