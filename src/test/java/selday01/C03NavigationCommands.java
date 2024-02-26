package selday01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03NavigationCommands {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://clarusway.com/");

        driver.get("http://amazon.com/");

        driver.navigate().back();

        driver.navigate().forward();

        driver.navigate().refresh();

        driver.navigate().to("https://www.google.com");

        driver.close();

    }
}
