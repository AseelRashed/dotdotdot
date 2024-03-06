package hw;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;

import utilities.TestBase;

import java.util.Iterator;
import java.util.Set;

public class H0802 extends TestBase{

        @Test
        public void test() throws InterruptedException {

            driver.get("https://the-internet.herokuapp.com/windows");



            WebElement openingMessage = driver.findElement(By.xpath("//*[.='Opening a new window']"));
            Assert.assertTrue(openingMessage.isDisplayed());


            String title = driver.getTitle();
            System.out.println("title of the main page  = " + title);
            Assert.assertTrue(title.equals("The Internet"));


            WebElement newTap = driver.findElement(By.xpath("//*[.='Click Here']"));
            newTap.click();



            Set<String> handlesList = driver.getWindowHandles();
            Iterator<String> itr = handlesList.iterator();

            String mainTabNameUsingItr = itr.next();
            String secTabNameUsingItr = itr.next();


            System.out.println("mainTabNameUsingItr = " + mainTabNameUsingItr);
            System.out.println("Second TabNameUsingItr = " + secTabNameUsingItr);
            Thread.sleep(3000);
            driver.switchTo().window(secTabNameUsingItr);


            String secondPageTitle = driver.getTitle();
            System.out.println("secondPageTitle = " + secondPageTitle);
            Assert.assertTrue(secondPageTitle.equals("New Window"));


            driver.switchTo().window(mainTabNameUsingItr);

            WebElement newWindoMessgae = driver.findElement(By.xpath("//div[@class='example']"));
            Assert.assertTrue(newWindoMessgae.isDisplayed());

        }


}
