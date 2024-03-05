package selday10;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import utilities.JsUtilities;
import utilities.TestBase;

public class C01JsExcuter extends TestBase {



    @Test
    public void test() {
        driver.get("https://www.linkedin.com");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("alert(\"hi sda\");");
        driver.switchTo().alert().accept();



        js.executeScript("window.scrollBy(0,3000);");

        WebElement button = driver.findElement(By.id("bottom-cta-section__header"));
        int x = button.getLocation().getX();
        int y = button.getLocation().getY();

        js.executeScript("window.scrollTo("+x+","+y+");");


        js.executeScript("arguments[0].scrollIntoView();",button);


        JsUtilities.clickElementByJS(driver, button);


    }
}
