package selday12;

import org.apache.poi.ss.usermodel.*;
import org.junit.Assert;
import org.junit.Test;
import utilities.TestBase;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static junit.framework.TestCase.assertEquals;

public class C01ApachePoiReadExcel {

    //Workbook  Our Excel file.
    //Sheet  An open Excel tab (Sheet1, Sheet2, etc.)
    //Row  In Java, it counts the rows only if there is data inside.
    //Cells  In Java, it looks at each row and counts the number of cells only if there is data in the cell.

    //Workbook(excel) > Worksheet(sheet) > Row(row) > Cell(cell) -> Hierarchy

    // Add the excel file on the resources folder.
    // Open the file.
    // Open the workbook using file input stream.
    // Open the first worksheet.
    // Go to the first row.
    // Go to the first cell on that first row and print.
    // Go to the second cell on that first row and print.
    // Go to the 2nd row first cell and assert if the data equals Russia.
    // Go to the 3rd row and print the 2nd cell.
    // Find the number of used rows.
    // Print country, area key-value pairs as a map object.
    // Verify that you have Türkiye on the list.

    @Test
    public void readExcel() throws IOException {
        // The path of the Excel file to be read
       String separator = System.getProperty("file.separator");
        String path = System.getProperty("user.dir")+separator+"resources"+separator+"excelfile.xlsx";

        // C:\...\...\IdeaProjects\CWJUnitProject\resources\excelfile.xlsx
        // Open the workbook using file input stream.
        FileInputStream fis = new FileInputStream(path);
        Workbook wb = WorkbookFactory.create(fis);

        // Open the first worksheet.
        Sheet sheet1 = wb.getSheet("Sheet1");

        // Go to the first row.
        Row row1 =sheet1.getRow(0);

        // Go to the first cell on that first row and print.
        Cell cell11 = row1.getCell(0);
        System.out.println("cell1 = " + cell11);

        // Go to the second cell on that first row and print.
        Cell cell12 = row1.getCell(1);
        System.out.println("cell2 = " + cell12);


        // Go to the 2nd row first cell and assert if the data equals Russia.
        Row row2 = sheet1.getRow(1);
        Cell cell21 = row2.getCell(0);
        System.out.println("cell21 = "+ cell21.toString());
        Assert.assertEquals("Russia", cell21.toString());

        // Go to the 3rd row and print the 2nd cell.
        Row row3 = sheet1.getRow(2);
        Cell cell32 = row3.getCell(1);
        System.out.println("cell32 = " + cell32);

        // Find the number of used rows.
        // ***getLastRowNum() index starts at 0 * checks the last row that is used
        // Provides the index information of the last used row.
        // Blank rows before the last row do not affect the result.
        System.out.println(sheet1.getLastRowNum());
        int rowsUsed = 0;
        // TODO
        while(true){
            if ( sheet1.getRow(rowsUsed).getCell(0) == null ){
                break;
            }
            rowsUsed++;
        }
        System.out.println(rowsUsed);


        // ***getPhysicalNumberOfRows() index starts at 1 * checks the total rows that is used
        // Provides the total number of used rows, starting from 1, excluding blank rows.
        System.out.println(sheet1.getPhysicalNumberOfRows());

        // Print country, area key-value pairs as a map object.
        // Let's print country-area information in key-value format like a map.
        // This can be done if there are 2 columns in the Excel.
        Map<String, String> countryArea = new HashMap<>();
        for (int i = 0; i < rowsUsed; i++){
            String country = sheet1.getRow(i).getCell(0).toString();
            String area = sheet1.getRow(i).getCell(1).toString();
            countryArea.put(country,area);
        }

        System.out.println(countryArea);


        // Verify that you have Turkey on the list.
        Assert.assertTrue(countryArea.containsKey("Turkey"));


        // Let's use the method for this.
        System.out.println(C02ApachePoiGetData.getData("Sheet1", 2, 1));


        wb.close();
        fis.close();

    }
/*
        Cell cell = WorkbookFactory.create(new FileInputStream(path)).getSheetAt(0).getRow(0).getCell(0);
        System.out.println("cellValue: "+WorkbookFactory.create(new FileInputStream(path)).getSheetAt(0).getRow(0).getCell(0));
 */

}
