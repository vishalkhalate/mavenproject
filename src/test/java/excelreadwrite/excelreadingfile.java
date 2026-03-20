package excelreadwrite;

import java.io.FileInputStream;


public class excelreadingfile {

    public static void main(String[] args) throws Exception {
        
        FileInputStream file = new FileInputStream("C:\\Users\\visha\\eclipse-workspace\\mavenproject\\src\\test\\java\\excelreadwrite\\excel\\practice.xlsx");
        
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        
   
}