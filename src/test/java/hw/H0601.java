package hw;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class H0601 {
/*
 Task:2
 Launch the browser.
 Open "https://demoqa.com/select-menu".
 Select the Old Style Select Menu using the element id.
 Print all the options of the dropdown.
 Select 'Purple' using the index.
 After that, select 'Magenta' using visible text.
 Select an option using value.
 Close the browser.
 */

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
    public void hW(){


        WebElement drope = driver.findElement(By.id("oldSelectMenu"));
        Select se = new Select(drope);

        List<WebElement> op = se.getOptions();
        int soo = op.size();

        for (WebElement opp:op) {

            System.out.println(opp.getText());

        }

        for (int i =0; i<op.size(); i++){

            System.out.println(op.get(i).getText());

        }
        List<String> cl = new ArrayList<>();

        for (WebElement opp:op){

            cl.add(opp.getText());

        }

        se.selectByIndex(4);



        se.selectByValue("4");

        se.selectByVisibleText("Magenta");

    }


}
