package hw;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class H0502 {

    /*
    Task 2:
            * breakout task: (in a separate class)
            * navigate to this url https://www.saucedemo.com/v1/inventory.html
            * add the first item you find to your cart
     * open your cart*
            * assert that the item name is correct inside the cart
     */


    @Test
    public void atc(){


        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://www.saucedemo.com/v1/inventory.html");


    }


}
