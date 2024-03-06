package selday08;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02IFrames02 {
    /*
    Go to https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/.
    Maximize the website.
    Click on the second emoji.
    Click on all second emoji items.
    Return to the parent iframe.
    Fill out the form (Fill the form with the text you want) and press the apply button.

     */

    static WebDriver driver;

    @BeforeClass
    public static void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @Test
    public void test() {

        //Go to URL: https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/
        driver.get("https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/");

        // Click on the second emoji.
        driver.switchTo().frame("emoojis");
        By allEmojis = By.xpath("//div[@class='mdl-tabs__tab-bar']/a");
        List<WebElement> listOfEmojis = driver.findElements(allEmojis);
        listOfEmojis.get(1).click();
        listOfEmojis.get(2).click();
        listOfEmojis.get(3).click();

        // Second Way: Instead of list we can create method which calls element with given index:
        WebElement secElement = driver.findElement(By.xpath("//div[@class='mdl-tabs__tab-bar']/a[2]"));
        WebElement thirdElement = driver.findElement(By.xpath("//div[@class='mdl-tabs__tab-bar']/a[3]"));
        WebElement fourthElement = driver.findElement(By.xpath("//div[@class='mdl-tabs__tab-bar']/a[4]"));
        clickOnElementByIndex(2);


        // Click on all second emoji items.
        // Return to the parent iframe.
        driver.switchTo().defaultContent();
        // Fill out the form (Fill the form with the text you want) and press the apply button.
        driver.findElement(By.id("smiles")).sendKeys("animal");

    }

    public void clickOnElementByIndex(int ind){
        By element = By.xpath("//div[@class='mdl-tabs__tab-bar']/a["+ind+"]");
        driver.findElement(element).click();
    }


}
