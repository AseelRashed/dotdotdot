package selday12;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.IOException;

public class C02ApachePoiGetData {

    /**
     * description for the method
     * @param sheetName name of the sheet
     * @param rowIndex index of the row
     * @param columnIndex index of column
     * @return the data in the specified cell
     * @throws IOException
     */
    public static String getData(String sheetName, int rowIndex, int columnIndex) throws IOException {
        String result = "";
        String separator = System.getProperty("file.separator");
        String path = System.getProperty("user.dir")+separator+"resources"+separator+"excelfile.xlsx";

        FileInputStream fis = new FileInputStream(path);
        Workbook wb = WorkbookFactory.create(fis);

        result = wb.getSheet(sheetName).getRow(rowIndex).getCell(columnIndex).toString();
        return result;
    }
}