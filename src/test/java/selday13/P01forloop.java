package selday13;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class P01forloop extends TestBase {


    @Test
    public void test(){


        driver.get("http://demo.guru99.com/test/web-table-element.php");

        WebElement table = driver.findElement(By.xpath("//table[@class='dataTable']"));

        WebElement thirdRow = table.findElement(By.xpath(".//tr[3]"));

        WebElement secondColumnData = thirdRow.findElement(By.xpath(".//td[2]"));
        String data = secondColumnData.getText();

        System.out.println("Data in the 3rd row, 2nd column: " + data);


    }


}
