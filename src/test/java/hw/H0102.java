package hw;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class H0102 {

    public static void main(String[] args) {


        /* Invoke Chrome Driver
        Navigate to Facebook homepage URL: https://www.facebook.com/
        Verify expected URL equals to the actual URL.
        Verify  pagesource of FaceBook contains "Facebook" .
                */

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");
        String expectedUrl = "https://www.facebook.com/";
        String actualUrl = driver.getCurrentUrl();
        if (expectedUrl.equals(actualUrl)){
            System.out.println("Same URL");
        } else {
            System.out.println("Different URL");
        }

        System.out.println(" ");

        if (driver.getPageSource().contains("Facebook"))
        {
            System.out.println("It contains Facebook");
        } else {
            System.out.println("It doesnt contain Facebook");
        }

        driver.close();
        driver.quit();

    }
}