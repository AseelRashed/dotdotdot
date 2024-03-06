package hw;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.List;

public class H0801 extends TestBase{


        @Test
        public void task1() throws InterruptedException {

            driver.get("http://demo.guru99.com/test/guru99home/");
            String handle = driver.getWindowHandle();


            List<WebElement> iframesNum = driver.findElements(By.tagName("iframe"));
            System.out.println("iframesNum.size() = " + iframesNum.size());


            driver.switchTo().frame("a077aa5e");
            driver.findElement(By.xpath("//img[@src='Jmeter720.png']")).click();
            Thread.sleep(3000);

            
            driver.switchTo().window(handle);
            driver.switchTo().defaultContent();




        }


}
