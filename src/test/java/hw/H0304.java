package hw;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class H0304 {

        //Task 4:
        //Navigate to https://testpages.herokuapp.com/styled/index.html
        //Click on Simple Calculator under Micro Apps.
        //Type any number in the first input.
        //Type any number in the second input.
        //Click on Calculate.
        //Get the result.
        //Print the result.
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
        public void task4() throws InterruptedException {
            driver.get("https://testpages.eviltester.com/styled/index.html");
            driver.findElement(By.id("calculatetest")).click();
            driver.findElement(By.id("number1")).sendKeys("2");
            driver.findElement(By.id("number2")).sendKeys("5");
            Thread.sleep(3000);
            driver.findElement(By.id("calculate")).click();
            System.out.println("The result of the tow num is : " + driver.findElement(By.id("answer")).getText());
        }

}

