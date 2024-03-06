package selday10;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.awt.event.KeyEvent;

public class P01 extends TestBase {


    @Test
    public void test(){

        String search = "Ya Wallef El Roo7";
        //String vid = ""

        driver.get("https://www.youtube.com");
        WebElement sER = driver.findElement(By.xpath("//input[@id='search']"));

        sER.click();
        sER.sendKeys(search);
        sER.submit();

        WebElement yWR = driver.findElement(By.xpath("//yt-formatted-string[text()='"+search+"']"));

        yWR.click();

        Assert.assertTrue(driver.getTitle().contains(search));

    }

}
