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
import java.util.ArrayList;
import java.util.List;


public class C05DropDownExercise02 {


    /*
    https://demoqa.com/select-menu
    Get all the options of the dropdown
    Options size
    Print all test
    Verify the dropdown has option "Black"
    Print FirstSelectedOptionTest
    Select option "Yellow"
     */


    static WebDriver driver;


    @BeforeClass
    public static void setUp(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/select-menu");
    }


    @AfterClass
    public static void tearDown (){


        //driver.quit();


    }


    @Test
    public void test(){


        WebElement DE = driver.findElement(By.id("oldSelectMenu"));
        Select se = new Select(DE);

        List<WebElement> op = se.getOptions();

        int soo = op.size();

        for (WebElement opp:op) {

            System.out.println(opp.getText());

        }

        //System.out.println(op.get(0).getText());

        for (int i =0; i<op.size(); i++){

            System.out.println(op.get(i).getText());

        }
        List<String> cl = new ArrayList<>();

        for (WebElement opp:op){

            cl.add(opp.getText());

        }
        Assert.assertTrue(cl.contains("Black"));

        System.out.println("  ");

        System.out.println(se.getFirstSelectedOption().getText());


        se.selectByVisibleText("Yellow");


    }

}
