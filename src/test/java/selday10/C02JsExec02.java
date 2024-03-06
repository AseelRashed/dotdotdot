package selday10;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.JsUtilities;
import utilities.TestBase;

public class C02JsExec02 extends TestBase {


    /*
    Go to URL: https://api.jquery.com/dblclick/
    Double click on the blue square at the bottom of the page and then write the changed color.
     */


    @Test
    public void test(){

        driver.get("https://api.jquery.com/dblclick/");

        driver.switchTo().frame(0);
        WebElement cB = driver.findElement(By.cssSelector("body>div"));

        JsUtilities.scrollIntoViewJS(driver, cB);

        act
                .doubleClick(cB)
                .perform();

        String cBC = cB.getCssValue("background-color");
        System.out.println("cBC = " + cBC);

        driver.switchTo().defaultContent();

        JsUtilities.scrollAllUpByJS(driver);


        driver.findElement(By.name("s")).sendKeys(cBC);

        JsUtilities.scrollDownByJS(driver);
        driver.findElement(By.xpath("//a[@href = 'https://www.manning.com/books/jquery-in-action-third-edition']")).click();

        //Assert.assertTrue(driver.findElement(By.xpath()));

    }


}
