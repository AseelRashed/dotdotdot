package selday06;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;


public class C05DropDownExercise {
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
        //Get all the options of the dropdown
        //Options size
        //Print all test
        //Verify the dropdown has option "Black"
        //Print FirstSelectedOptionTest
        //Select option "Yellow"


        WebElement



    }
}
