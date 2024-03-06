package hw;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class H0901 extends TestBase {

    /*
    Go to URL: http://demo.guru99.com/test/drag_drop.html
    Drag and drop the BANK button to the Account section in DEBIT SIDE
    Drag and drop the SALES button to the Account section in CREDIT SIDE
    Drag and drop the 5000 button to the Amount section in DEBIT SIDE
    Drag and drop the second 5000 button to the Amount section in CREDIT SIDE
    Verify the visibility of Perfect text.
     */


    @Test
    public void Test(){

        By acDE = By.id("bank");
        By acCE = By.id("loan");
        By amDE = By.id("amt7");
        By amCE = By.id("amt8");


        By bnk = By.id("credit2");
        By sls = By.id("credit1");
        By fvi = By.xpath("//*[@class='block13 ui-draggable'][1]");
        By fvii = By.xpath("//*[@class='block13 ui-draggable'][2]");

        driver.get("http://demo.guru99.com/test/drag_drop.html");

        WebElement perf = driver.findElement(By.xpath("//*[@class='table4_result']"));

        WebElement DacDE = driver.findElement(acDE);
        WebElement DacCE = driver.findElement(acCE);
        WebElement DamDE = driver.findElement(amDE);
        WebElement DamCE = driver.findElement(amCE);

        WebElement dBnk = driver.findElement(bnk);
        WebElement dSls = driver.findElement(sls);
        WebElement dFvi = driver.findElement(fvi);
        WebElement dFvii = driver.findElement(fvii);

        act.
                dragAndDrop(dBnk, DacDE).
                dragAndDrop(dSls, DacCE).
                dragAndDrop(dFvi, DamDE).
                dragAndDrop(dFvii, DamCE).
                perform();


        Assert.assertTrue(perf.isDisplayed());


    }



}
