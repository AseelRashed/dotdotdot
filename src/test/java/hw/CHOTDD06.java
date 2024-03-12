package hw;

import com.github.javafaker.Faker;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class CHOTDD06 {

    static WebDriver driver;


    @BeforeClass
    public static void setUp(){

        driver = new ChromeDriver();
        driver.get("https://thinking-tester-contact-list.herokuapp.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();

    }

    @AfterClass
    public static void tearDown (){


        //driver.quit();


    }


    @Test
    public void LI(){


        WebElement EL = driver.findElement(By.id("email"));EL.sendKeys("aseel@gmail.com");
        WebElement ELL = driver.findElement(By.id("password"));ELL.sendKeys("1234567");
        WebElement submet = driver.findElement(By.id("submit"));
        submet.click();


        WebElement ADD = driver.findElement(By.id("add-contact"));
        Assert.assertTrue(ADD.isDisplayed());
        ADD.click();

    //add-contact

    }

    @Test
    public void Faker(){


        Faker faker = new Faker();
        String first = faker.name().firstName();
        String last = faker.name().lastName();
        String email = faker.internet().emailAddress();
        String add1 = faker.address().streetAddress();
        String add2 = faker.address().streetAddress();
        String city = faker.address().city();
        String StateP = faker.address().state();
        String zip = faker.address().zipCode();
        String Country = faker.address().country();



        WebElement FN = driver.findElement(By.id("firstName"));FN.sendKeys(first);
        WebElement LN = driver.findElement(By.id("lastName"));LN.sendKeys(last);

        WebElement DOB = driver.findElement(By.id("birthdate"));DOB.sendKeys("2001-12-22");

        WebElement EM = driver.findElement(By.id("email"));EM.sendKeys(email);
        WebElement PH = driver.findElement(By.id("phone"));PH.sendKeys("0566549636");

        WebElement ad1 = driver.findElement(By.id("street1"));ad1.sendKeys(add1);
        //WebElement ad2 = driver.findElement(By.id("street2"));ad1.sendKeys(add2);

        WebElement ct = driver.findElement(By.id("city"));ct.sendKeys(city);
        WebElement sp = driver.findElement(By.id("stateProvince"));sp.sendKeys(city);

        WebElement zp = driver.findElement(By.id("postalCode"));zp.sendKeys(zip);
        WebElement cn = driver.findElement(By.id("country"));cn.sendKeys(Country);

        WebElement submit = driver.findElement(By.id("submit"));
        //Assert.assertTrue(submit.isSelected());
        submit.click();



        //WebElement





    }


}
