package selday11;


import org.junit.Test;
import org.openqa.selenium.Cookie;
import utilities.TestBase;

import java.util.Iterator;
import java.util.Set;

    public class C01Cookies extends TestBase {
        //Go to URL: https://kitchen.applitools.com/ingredients/cookie
        //Print all the cookies.
        //Get Cookie.
        //Find the total number of cookies.
        //Add Cookie.
        //Edit Cookie.
        //Delete Cookie.
        //Delete All Cookies.
        @Test
        public void test(){
            //Go to URL: https://kitchen.applitools.com/ingredients/cookie
            driver.get("https://kitchen.applitools.com/ingredients/cookie");


            //Print all the cookies.
            Set<Cookie> cookies = driver.manage().getCookies();


            for (Cookie w: cookies){
                System.out.println(w);
            }
            //Get Cookie.
            Cookie secCookie = driver.manage().getCookieNamed("vegetable");
            System.out.println("secCookie = " + secCookie);
            System.out.println("------------------------------");

            System.out.println("secCookie.getValue() = " + secCookie.getValue()); // value of the cookie
            System.out.println("------------------------------");
            //Find the total number of cookies.
            int sizeCookies = cookies.size();
            System.out.println("sizeCookies = " + sizeCookies);
            System.out.println("------------------------------");

            //Add Cookie.
            Cookie newCookie = new Cookie("fruit","mango");
            driver.manage().addCookie(newCookie);
            driver.manage().getCookies().forEach(t-> System.out.println(t));
            System.out.println("------------------------------");

            //Edit Cookie.

            //Delete Cookie.
            driver.manage().deleteCookie(secCookie);
            driver.manage().deleteCookieNamed("fruit");
            driver.manage().getCookies().forEach(System.out::println);
            System.out.println("------------------------------");


            //Delete All Cookies.
            driver.manage().deleteAllCookies();
            driver.manage().getCookies().forEach(System.out::println);
            System.out.println("end here...");
        }


    }
