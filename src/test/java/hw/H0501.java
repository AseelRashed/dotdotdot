package hw;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class H0501 {


    /*
    Task 1:
Go to URL: https://demoqa.com/radio-button
Verify whether all 3 options given to the question can be selected.
When each option is selected, print the following texts on the console.
     */



    @Test
    public void RB() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/radio-button");


        List<WebElement> radButtons=driver.findElements(By.xpath("//*[@class='custom-control-label']"));
        //driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/label[1]")).click();
        Thread.sleep(1000);


        radButtons.get(0).click();
        Assert.assertTrue(radButtons.get(0).isSelected());

        radButtons.get(1).click();
        Assert.assertTrue(radButtons.get(1).isSelected());


    }


}
