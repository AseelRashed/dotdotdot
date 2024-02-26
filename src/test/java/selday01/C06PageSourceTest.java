package selday01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class C06PageSourceTest {

    public static void main(String[] args) {
        /*
        🡪 Go to the Amazon URL: https://www.amazon.com/
        🡪 Verify that it writes "Performance Metrics" or " Gateway" from the Source code.

         */
        String str1 ="Type the characters you see in this image";
        String str2 ="Amazon";

        WebDriver driver = new SafariDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.amazon.com/");
        String  sourceCode = driver.getPageSource();
        System.out.println("sourceCode = " + sourceCode);

        if (sourceCode.contains(str1) || sourceCode.contains(str2)){
            System.out.println("Test Passed...");
        } else {
            System.out.println("Test Failed...");
        }
        System.out.println(sourceCode.contains(str1));
        System.out.println(sourceCode.contains(str2));

        driver.quit();

    }

}
