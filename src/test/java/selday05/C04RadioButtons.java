package selday05;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C04RadioButtons {


    /*
    Go to URL:  https://www.facebook.com/
    Click on Create an Account button.
    Then click on the radio buttons.
     */


    @Test
    public void radButtonTest() throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.facebook.com/");


        driver.findElement(By.xpath("//*[starts-with(@id,'u_0_0_')]")).click();

        List<WebElement> radButtons=driver.findElements(By.xpath("//input[@type='radio']"));

        radButtons.get(0).click();
        Assert.assertTrue(radButtons.get(0).isSelected());

        radButtons.get(1).click();
        Assert.assertTrue(radButtons.get(1).isSelected());

        radButtons.get(2).click();
        Assert.assertTrue(radButtons.get(2).isSelected());

     /*   for (WebElement button: radButtons){
            button.click();
            Assert.assertTrue(button.isSelected());
            Thread.sleep(1000);

      */
    }
}
