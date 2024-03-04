package selday4;

import org.junit.AfterClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class C01relativeLocators {


    @Test
    public void test(){

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://linkedin.com");
        By emailField = RelativeLocator.with(By.id("session_key")).above(By.id("session_password"));
        driver.findElement(emailField).sendKeys("i did it");

    }

}