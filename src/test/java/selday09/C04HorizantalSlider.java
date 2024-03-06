package selday09;

    import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.time.Duration;

    public class C04HorizantalSlider extends TestBase {

        //Go to URL: https://foundation.zurb.com/sites/docs/v/5.5.3/components/range_slider.html
        //Shift 34 units to the up and 34 units to the down on the vertical axis.


        @Test
        public void sliderTest(){
            By slider = By.xpath("//div[@class='range-slider vertical-range']/span[1]");

            driver.get("https://foundation.zurb.com/sites/docs/v/5.5.3/components/range_slider.html");
            WebElement sliderButton = driver.findElement(slider);


            act
                    .dragAndDropBy(sliderButton,0,-32)
                    .pause(Duration.ofSeconds(2))
                    .dragAndDropBy(sliderButton,0,32)
                    .build()
                    .perform();

        }

    }
