package selday09;

import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class C01HandlesOfMultipleWindows extends TestBase {


    @Test
    public void test(){


        By tabElement = By.id("tabButton");
        By windElement = By.id("windowButton");
        By massageElement = By.id("messageWindowButton");
        By mOT = By.id("sampleHeading");

        driver.get("https://demoqa.com/browser-windows");

        driver.findElement(tabElement).click();
        driver.findElement(windElement).click();
        driver.findElement(massageElement).click();


        Set<String> han =  driver.getWindowHandles();
        Iterator<String> itr = han.iterator();


        String hanMain = itr.next();
        String hanTap = itr.next();
        String hanWind = itr.next();
        String hanWindMass = itr.next();


        // To print handles
        // System.out.println(hanMain);
        // System.out.println(hanTap);
        // System.out.println(hanWind);
        // System.out.println(hanWindMass);


        driver.switchTo().window(hanTap);
        System.out.println(driver.findElement(mOT).getText());

        driver.switchTo().window(hanWind);
        System.out.println(driver.findElement(mOT).getText());




    }


}
