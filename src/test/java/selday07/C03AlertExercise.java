package selday07;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
/*
Go to URL: http://demo.automationtesting.in/Alerts.html
Click "Alert with OK" and click 'click the button to display an alert box:'
Accept Alert(I am an alert box!) and print alert on console.
Click "Alert with OK & Cancel" and click 'click the button to display a confirm box'
Cancel Alert  (Press a Button !)
Click "Alert with Textbox" and click 'click the button to demonstrate the prompt box'
And then sendKeys «Bootcamp» (Please enter your name)
Finally print on console this message "Hello Bootcamp How are you today" assertion these message.
 */
public class C03AlertExercise {

    static WebDriver driver;
    @BeforeClass
    public static void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("http://demo.automationtesting.in/Alerts.html");
    }
    @Test
    public void test() throws InterruptedException {
        // Click "Alert with OK" and click 'click the button to display an alert box:'
        driver.findElement(By.partialLinkText("Alert with")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@class='btn btn-danger']")).click();
        // Accept Alert(I am an alert box!) and print alert on console.
        Thread.sleep(1000);
        driver.switchTo().alert().accept();
        // Click "Alert with OK & Cancel" and click 'click the button to display a confirm box'
        Thread.sleep(1000);
        driver.findElement(By.partialLinkText("& Cancel")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@class='btn btn-primary']")).click();
        Thread.sleep(1000);

        // Cancel Alert  (Press a Button !)
        driver.switchTo().alert().dismiss();

        // Click "Alert with Textbox" and click 'click the button to demonstrate the prompt box'
        driver.findElement(By.partialLinkText("Textbox")).click();
        driver.findElement(By.xpath("//*[@class='btn btn-info']")).click();
        // driver.switchTo().alert().sendKeys(Keys.chord(Keys.COMMAND,"a",Keys.BACK_SPACE));
        //  driver.switchTo().alert().sendKeys(Keys.chord(Keys.CLEAR));

        // And then sendKeys «Bootcamp» (Please enter your name)
        Thread.sleep(2000);
        driver.switchTo().alert().sendKeys("Abdulaziz");
        Thread.sleep(2000);

        driver.switchTo().alert().accept();
        // Finally print on console this message "Hello Bootcamp How are you today" assertion these message.
        Assert.assertTrue(driver.findElement(By.id("demo1")).getText().equals("Hello Abdulaziz How are you today"));
    }

}