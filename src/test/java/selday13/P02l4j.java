package selday13;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import utilities.TestBase;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBase;

//import log4j;

public class P02l4j extends TestBase {

    @Test
    public void logger(){
        PropertyConfigurator.configureAndWatch("log4j.properties");

        Logger logger = Logger.getLogger(P02l4j.class);
        // Go to URL: https://healthunify.com/bmicalculator/
        driver.get("https://healthunify.com/bmicalculator/");

        // Entring weight
        logger.trace("This is a trace message");
        WebElement wight = driver.findElement(By.xpath("//input[@name='wg']"));
        wight.click();
        wight.sendKeys("85");

        // Selecting kilograms
        logger.trace("This is a trace message");

        WebElement kg = driver.findElement(By.name("opt1"));
        Select select1 = new Select(kg);
        select1.selectByValue("kilograms");

        // Selecting height in feet
        logger.trace("This is a trace message");
        WebElement height2 = driver.findElement(By.name("opt3"));
        Select select2 = new Select(height2);
        select2.selectByValue("2");

        // Selecting height in inchs


        // Clicking on calculate
        logger.info("info from logger");
        driver.findElement(By.xpath("//input[@name='cc']")).click();
        WebElement r1 = driver.findElement(By.xpath("//tbody/tr[1]/td[2]"));
        String ssss = r1.getText();
        // Getting SIUnit value
        System.out.println("r1 = " + ssss);     // Getting UKUnit value
        // Getting overall description
    }
}