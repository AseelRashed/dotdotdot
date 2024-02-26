package selday01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01OpenPage {



    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");
        // driver.get("https://amazon.com");


    }
}
