package excelLearning;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File file = new File("https://onedrive.live.com/edit.aspx?resid=21A8D573AE88E37C!se418101e7be94e95944c6f12b028f954&wdNewAndOpenCt=1708522417669&wdOrigin=OFFICECOM-WEB.START.NEW&wdPreviousSessionSrc=HarmonyWeb&wdPreviousSession=3c49be1d-c27f-48c5-a0d3-4fff2fc7ac69");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("Sheet1");
		
		String sheetData = sheet.getRow(0).getCell(1).toString();
		System.out.println(sheetData);
		
		int row = sheet.getLastRowNum();
		int col = sheet.getRow(0).getLastCellNum();
		
		for (int i=0; i<=row;i++) {
			for(int j=0; j<col; j++) {
				DataFormatter df= new DataFormatter();
				String s = df.formatCellValue(sheet.getRow(i).getCell(j));
				System.out.println(s + "/t/t/t");
				//System.out.println(i+" "+ j );
			}
		}
		

	}

}
