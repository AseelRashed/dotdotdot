package selday02;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class C01Junit {


           /*
     ******JUNIT*****
" The most basic framework with Java can be created using the JUnit framework.

* JUnit is an open-source unit testing tool used to test small/large code units.
* You don't need to create a class object or define a main method to run a JUnit test.
*  Developers also use unit tests to run tests.
*  We will create and use the TestNG framework as it is an advanced version of JUnit for our testing.
* JUnit is also used to run Automation packages with multiple test scenarios.
* When we say 'test,' it can be a single method or a structure containing many classes and packages.
* Regression Test, Smoke Test, etc.
* The test method is the smallest test structure created using the @Test annotation, which can be run independently.
* @Test annotation: Test method"
     */

    @Test
    public void test1() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.quit();
    }


    @Test
    public void test2() {
        WebDriver driver = new SafariDriver();
        driver.get("https://www.google.com");
        driver.quit();
    }


    // @Test
    // public void test3() {
       //  WebDriver driver = new FirefoxDriver();
       // driver.get("https://www.google.com");
       // driver.quit();
    // }


}
