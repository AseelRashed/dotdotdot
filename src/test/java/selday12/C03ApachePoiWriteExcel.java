package selday12;

import org.apache.poi.ss.usermodel.*;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class C03ApachePoiWriteExcel {

    //Store the path of the file as string and open the file.
    //Open the workbook.
    //Open the first worksheet.
    //Go to the first row.
    //Create a cell on the 3rd column (2nd index) on the first row.
    //Write “POPULATION” on that cell.
    //Create a cell on the 2nd row 3rd cell(index2), and write data.
    //Create a cell on the 3rd row 3rd cell(index2), and write data.
    //Create a cell on the 4th row 3rd cell(index2), and write data.
    //Write and save the workbook.
    //Close the file.
    //Close the workbook.

    @Test
    public void test01() throws IOException {

        //Store the path of the file as string and open the file.
        //Open the workbook.
        //Open the first worksheet.
        String separator = System.getProperty("file.separator");
        String path = System.getProperty("user.dir") + separator + "resources" + separator + "excelfile.xlsx";

        FileInputStream fis = new FileInputStream(path);
        Workbook wb = WorkbookFactory.create(fis);

        Sheet sheet2 = wb.createSheet("credentials");
        Row row17 = sheet2.createRow(16);

        Cell r17c7 = row17.createCell(6);
        r17c7.setCellValue("NAME");

        Cell r17c8 = row17.createCell(7);
        r17c8.setCellValue("EMAIL");

        Cell r17c9 = row17.createCell(8);
        r17c9.setCellValue("PASSWORD");

        FileOutputStream fos = new FileOutputStream(path);
        wb.write(fos);

        wb.close();
        fis.close();
        fos.close();
    }

    @Test
    public void test02() throws IOException {



        //Store the path of the file as string and open the file.
        String separator = System.getProperty("file.separator");
        String path = System.getProperty("user.dir") + separator + "resources" + separator + "excelfile.xlsx";

        //Open the workbook.
        FileInputStream fis = new FileInputStream(path);
        Workbook wb = WorkbookFactory.create(fis);

        //Open the first worksheet.
        Sheet sheet1 = wb.getSheetAt(0);

        //Go to the first row.
        Row row1 = sheet1.getRow(0);

        //Create a cell on the 3rd column (2nd index) on the first row.
        //Write “POPULATION” on that cell.
        Cell cell13 = row1.createCell(2);
        cell13.setCellValue("POPULATION");

        //Create a cell on the 2nd row 3rd cell(index2), and write data.
        Row row2 = sheet1.getRow(1);
        Cell cell23 = row2.createCell(2);
        cell23.setCellValue(1234);

        //Create a cell on the 3rd row 3rd cell(index2), and write data.
        Row row3 = sheet1.getRow(2);
        Cell cell33 = row3.createCell(2);
        cell33.setCellValue(123456);

        //Create a cell on the 4th row 3rd cell(index2), and write data.
        Row row4 = sheet1.getRow(3);
        Cell cell43 = row4.createCell(2);
        cell43.setCellValue(123456789);


        //Write and save the workbook.
        FileOutputStream fos = new FileOutputStream(path);
        wb.write(fos);

        //Close the file.
        //Close the workbook.
        wb.close();
        fos.close();
        fis.close();


    }
}