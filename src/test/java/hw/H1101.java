package hw;

import org.junit.Test;
import org.openqa.selenium.Cookie;
import utilities.TestBase;

import java.util.Set;

public class H1101 extends TestBase{



    @Test
        public void Task1(){


            //    Go to URL: http://facebook.com
            driver.get("http://facebook.com");
            //    getCookies,
            Set<org.openqa.selenium.Cookie> Cookies = driver.manage().getCookies();
            for (Cookie w : Cookies){
                System.out.println("all the cookies are: "+ w);
            }

            Cookie newCookie = new Cookie("Car","Audi");
            driver.manage().addCookie(newCookie);
            System.out.println("allCookies = " + Cookies);


            driver.manage().deleteCookie(newCookie);


            System.out.println("-----------------------------------------------------------------------------");
            driver.manage().deleteAllCookies();
            driver.manage().getCookies().forEach(cookiesAll-> System.out.println("allCookies = " + Cookies));
            System.out.println("No Cookies");



        }
}


