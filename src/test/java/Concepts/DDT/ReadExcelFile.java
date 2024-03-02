package Concepts.DDT;

import org.apache.poi.ss.usermodel.*;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;

public class ReadExcelFile {

    private static Workbook book;
    private static Sheet sheet;
    private static final String FILE_NAME = "src/test/resources/Rest Full Boker APIs.xlsx";

    public static Object[][] getData(String sheetName) {

        try {
            FileInputStream file = new FileInputStream(FILE_NAME);
            sheet = WorkbookFactory.create(file).getSheet(sheetName);
        } catch (Exception ignored) {}

        Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
        for (int i = 0; i < sheet.getLastRowNum(); i++) {
            for (int j = 0; j < sheet.getRow(i).getLastCellNum(); j++) {
                data[i][j] = sheet.getRow(i + 1).getCell(j).getStringCellValue();
            }
        }
        return data;
    }

//    @DataProvider
//    public Object[][] getData() {
//        return getTestData("Creds");
//    }
//
//    @Test(dataProvider = "getData", dataProviderClass = ReadExcelFile.class)
//    public void testLoginData(String username, String password) {
//        System.out.println(username + "--->" + password);
//    }
}