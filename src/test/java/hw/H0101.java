package hw;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class H0101 {

        /*
Create main method
Create chrome driver
Open google home page: https://www.google.com
Print Title on page
Print Current URL on page
Close/Quit the browser
     */

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        driver.getTitle();

        driver.getCurrentUrl();
        System.out.println("Current url = " + driver.getCurrentUrl());

        driver.close();
        driver.quit();


    }
}
