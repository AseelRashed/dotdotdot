package selday06;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import javax.lang.model.element.Element;
import java.time.Duration;

public class C02DropDown01 {


// Dropdown: a drop-down menu
// Since dropdowns require special interactions, Selenium has created a separate class for dropdowns.
// Class -> Select

    /* When working with dropdowns:
       * Locate the <select> element: //select[@id='oldSelectMenu']
       * Create a Select object using the select element:
           Select select = new Select(webElement)
       * Use methods through the select object:
           1- selectByIndex(): index of the option element
           2- selectByValue(): value attribute of the option element
           3- selectByVisibleText(): visible text of the option element

    // Methods used for informational purposes in Select elements:
       select.getAllSelectedOptions(); -> Returns all selected values in a multi-select dropdown.
       select.getFirstSelectedOption(); -> Returns the first selected option.
       select.getOptions(); -> Returns all options of the select element in a list.
       select.isMultiple(); -> Returns a boolean indicating whether the select element allows multiple selections.

    // Deselection methods:
       1- deselectByIndex() -> Deselects an option by its index.
       2- deselectByValue() -> Deselects an option by its value attribute.
       3- deselectByVisibleText() -> Deselects an option by its visible text (content).
       4- deselectAll() -> Deselects all options.
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


        // driver.quit();


    }



    @Test
    public void dropDownTest(){


        driver.getCurrentUrl();
        WebElement drope = driver.findElement(By.xpath("//*[text()='Select Option']"));


        //Select se = new Select(drope); // if commented it will click in line 84

        // use select method to select option

        //drope.click();
        //se.selectByIndex(1);

        drope.click();
        drope.sendKeys(Keys.DOWN);
        drope.sendKeys(Keys.DOWN);
        drope.sendKeys(Keys.ENTER);


    }

}
