package hw;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.time.Duration;
public class H0902 extends TestBase{



        @Test
        public void horizontalTest(){
            By slider= By.id("js-rangeslider-0");

            driver.get("https://rangeslider.js.org/");


            WebElement sliderButton = driver.findElement(slider);
            act
                    .dragAndDropBy(sliderButton,100,0)          // opisite -32 means up
                    .pause(Duration.ofSeconds(2))
                    .dragAndDropBy(sliderButton,-100,0)
                    .build()        // it will build both and send them (perform)
                    .perform();
        }

}
