package hw;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class CHOTDD05 {


    @Test
    public void atc() throws InterruptedException {


        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://webdriveruniversity.com/To-Do-List/index.html");

        driver.findElement(By.xpath("(//input[@placeholder='Add new todo'])[1]")).click();
        driver.findElement(By.xpath("(//input[@placeholder='Add new todo'])[1]")).sendKeys("Go Home");
        //Assert.assertTrue();

        driver.findElement(By.xpath("(//input[@placeholder='Add new todo'])[1]")).sendKeys(Keys.ENTER);

        Thread.sleep(1000);

        // class="fa fa-trash"
        WebElement todo = driver.findElement(By.xpath("//*[text()=' Go Home']"));
                todo.click();
        //System.out.println("todo.getAttribute(\"class\") = " + todo.getAttribute("class"));
        Assert.assertTrue(todo.isDisplayed());

        Assert.assertEquals("completed",todo.getAttribute("class"));
         driver.findElement(By.xpath("(//*[@class=\"fa fa-trash\"])[last()]")).click();

        //Assert.assertTrue();

////*[text()=' Go Home']



    }

}
