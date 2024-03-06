package selday09;


    import org.junit.Test;
    import org.openqa.selenium.By;
    import org.openqa.selenium.Keys;
    import org.openqa.selenium.WebElement;
    import utilities.TestBase;

    public class C05KeyBoardActions extends TestBase {
        //Go to URL: https://demoqa.com/auto-complete
        //In the Type single color name section, print "Exceptional" by using the action methods.


        @Test
        public void keyBoardTest(){
            By boxId = By.id("autoCompleteMultipleContainer");

            driver.get("https://demoqa.com/auto-complete");
            WebElement textBox =  driver.findElement(boxId);

            act
                    .click(textBox)
                    .keyDown(Keys.SHIFT)
                    .sendKeys("e")
                    .keyUp(Keys.SHIFT)
                    .sendKeys("xceptional")
                    .build()
                    .perform();

        }
    }
