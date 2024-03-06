package selday06;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class C03DropDown02 {


    static WebDriver driver;


    @BeforeClass
    public static void setUp() {

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


        WebElement drope = driver.findElement(By.id("oldSelectMenu"));

        Select se = new Select(drope);

        //se.selectByIndex(3);

        //se.selectByValue("4");

        se.selectByVisibleText("Purple");

        WebElement dropem = driver.findElement(By.id("cars"));
        Select se2 = new Select(dropem);

        System.out.println("se2.isMultiple() = " + se2.isMultiple());

    }

}
