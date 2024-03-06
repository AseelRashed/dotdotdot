package selday09;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;


//DragAndDrop
public class C03DaD extends TestBase {
/*
Go to URL: http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html
Fill in capitals by country.
 */


    @Test
    public void test(){

        By ro = By.id("box6");
        By ital = By.id("box106");


        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");


        //driver.findElement(By.xpath("//*[@id='DHTMLgoodies_dragableElement5']"));


        WebElement dro = driver.findElement(ro);
        WebElement itB = driver.findElement(ital);

        Actions act = new Actions(driver);


        act.
                dragAndDrop(dro, itB)
                .perform();

    }


}
