package selday08;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01iFrames01 {

    static WebDriver driver;

    @BeforeClass
    public static void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @Test
    public void test()  {

        //Go to URL: https://the-internet.herokuapp.com/iframe
        driver.get("https://the-internet.herokuapp.com/iframe");

        //Verify the Bolded text contains “Editor”
        WebElement boldText =driver.findElement(By.tagName("h3"));
        Assert.assertTrue(boldText.getText().contains("Editor"));

        //  xpath : //h3[.='An iFrame containing the TinyMCE WYSIWYG Editor']  , //h3  ,  tagName : h3
        driver.findElement(By.xpath("//*[@title='Bold']")).click();
        //Locate the text box
        //  WebElement textBox = driver.findElement(By.xpath("//*[@id='tinymce']/p"));---> we cannot locate because it is in an IFrame

        // To access the textBox web element, we need to switch to the iframe; otherwise, we will encounter a NoSuchElementExcepion.

        // Switching to the iframe

        // Using index (starts at 0)
        //  driver.switchTo().frame(0);

        // Using id or name
        driver.switchTo().frame("mce_0_ifr");
        // Using webElement
        //  WebElement iframe = driver.findElement(By.id("mce_0_ifr"));
        //  driver.switchTo().frame(iframe);
        WebElement textBox = driver.findElement(By.xpath("//*[@id='tinymce']"));

        // Delete the text in the text box
        // driver.findElement(By.xpath("//*[@id='tinymce']/p")).clear();
        textBox.sendKeys(Keys.chord(Keys.COMMAND,"a"),Keys.BACK_SPACE);

        // Type “Hi everyone”
        // WebElement textBox1 = driver.findElement(By.xpath("//*[@id='tinymce']"));
        textBox.sendKeys("Hi SDA!");

        // If we want to perform operations outside the iframe again

        driver.switchTo().parentFrame();// Brings it up by one level


        // Verify that the text "Elemental Selenium" is displayed on the page.
        WebElement text = driver.findElement(By.linkText("Elemental Selenium"));
        Assert.assertTrue(text.isDisplayed());
        driver.quit();
    }

}

