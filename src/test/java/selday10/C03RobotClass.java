package selday10;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.awt.*;
import java.awt.event.KeyEvent;

public class C03RobotClass extends TestBase {


    @Test
    public void test() throws AWTException {


        driver.get("https://www.ebay.com");

        Robot rbt = new Robot();

        WebElement sB = driver.findElement(By.id("gh-ac"));

        sB.click();
        //sB.sendKeys("Aseel");

        /*
        Robot doesnt work in mac

        rbt.keyPress(KeyEvent.VK_SHIFT);
        rbt.keyPress(KeyEvent.VK_A);
        rbt.keyRelease(KeyEvent.VK_A);
        rbt.keyRelease(KeyEvent.VK_SHIFT);
        rbt.keyPress(KeyEvent.VK_S);
        rbt.keyRelease(KeyEvent.VK_S);
        rbt.keyPress(KeyEvent.VK_E);
        rbt.keyRelease(KeyEvent.VK_E);
        rbt.keyPress(KeyEvent.VK_E);
        rbt.keyRelease(KeyEvent.VK_E);
        rbt.keyPress(KeyEvent.VK_L);
        rbt.keyRelease(KeyEvent.VK_L);
        */


    }


}
