package selday14;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class C03DependsOn {

    WebDriver driver;

    @BeforeClass
    public void setUp(){

        driver = new ChromeDriver();

    }


    @Test (dependsOnMethods = {"test02"})
    public void test01(){

        driver.get("https://www.google.com");


    }

    @Test (priority = 1)
    public void test02(){

        driver.get("https://www.facebook.com");


    }

    @Test (dependsOnMethods = {"test01"})
    public void test03(){

        driver.get("https://www.Amazon.com");


    }


}
