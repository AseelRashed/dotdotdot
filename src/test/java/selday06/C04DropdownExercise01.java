package selday06;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class C04DropdownExercise01 {

    /*
    Launch the browser.
    Open "https://demoqa.com/select-menu".
    Select the Standard Multi-Select using the element id.
    Verifying that the element is multi-select.
    Select 'Opel' using the index and deselect the same using index.
    Select 'Saab' using value and deselect the same using value.
    Deselect all the options.
    Close the browser.
    */


    static WebDriver driver;


    @BeforeClass
    public static void setUp(){

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/select-menu");

    }


    @AfterClass
    public static void tearUp(){

        //driver.quit();

    }


    @Test
    public void dDE(){

        WebElement DE = driver.findElement(By.id("cars"));

        Select se = new Select(DE);


        Assert.assertTrue(se.isMultiple());

        se.selectByIndex(2);

        List<WebElement> op = se.getOptions();
        Assert.assertTrue(op.get(2).isSelected());

        se.selectByValue("saab");
        //assertEquals();


        //se.deselectByValue("saab");

        //se.deselectAll();
        //System.out.println("se.isMultiple() = " + se.isMultiple());
        //se.selectByVisibleText("Volvo");

    }



}
