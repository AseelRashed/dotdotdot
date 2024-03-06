package selday09;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class C02ActionsClass01 extends TestBase {


    /*
Mouse Actions
click(): Used to click on the current position.
doubleClick(): Used to perform a double-click at the mouse pointer's location.
clickAndHold(): Used to perform a click without releasing the mouse button.
contextClick(): Used to perform a right-click at the current mouse position.
moveToElement(WebElement target): Used to move the mouse pointer to the center of the target location.
dragAndDrop(WebElement source, WebElement target): Used to drag an element from the source and drop it to the target location.
dragAndDropBy(source, xOffset, yOffset): This method clicks and holds the source element, moves it by a specified offset, and then releases the mouse. Offsets are defined with x & y. (X = Horizontal Scroll, Y = Vertical Scroll)
release(): Used to release the left mouse button at the current position.
perform(): Executes an action. This should be used at the end to perform the action.
Don't forget to use perform()!

*/
// Go to URL: https://demoqa.com/buttons
// Run the buttons on the page using the Actions Class.
// Verify the texts that appear after the buttons are operated.

    @Test
    public void test(){


        By dC = By.id("doubleClickBtn");
        By rC = By.id("rightClickBtn");
        By click = By.xpath("//div[@class='mt-4'][2]/button");
        By dCM = By.id("doubleClickMassage");
        By rCM = By.id("rightClickMassage");
        By dyClick = By.id("dynamicClickMassage");


        driver.get("https://demoqa.com/buttons");

        WebElement dCE = driver.findElement(dC);
        WebElement rCE = driver.findElement(rC);
        WebElement clickE = driver.findElement(click);



        Actions act = new Actions(driver);

        act
                .doubleClick(dCE)
                .contextClick(rCE)
                .click(clickE)
                .perform();


        Assert.assertTrue(driver.findElement(dCM).isDisplayed());
        Assert.assertTrue(driver.findElement(rCM).isDisplayed());
        Assert.assertTrue(driver.findElement(dyClick).isDisplayed());



    }

}
