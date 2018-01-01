package hcl.in;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;

public class ExcelReader {
	
	FileInputStream fs;
	HSSFWorkbook wb;
	String ePath;
	//"/Users/haribabuchidipothu/Documents/Selenium/DataEng.xls"
	public ExcelReader(String ePath) throws IOException{
		this.ePath =ePath;
		fs = new FileInputStream(ePath);
		wb = new HSSFWorkbook(fs);
	}
	
	public String[][] excelReader(String shtName){
		String[][] dataset = null;
		try {
			HSSFSheet ws = wb.getSheet(shtName);
			int totalRow = ws.getLastRowNum();
			System.out.println(totalRow);
			int totalCol = ws.getRow(0).getLastCellNum();
			System.out.println(totalCol);
			dataset = new String[totalRow][totalCol];
			for (int i = 1; i < totalRow+1; i++) {
				for (int j = 0; j < totalCol; j++) {
					HSSFCell cell = ws.getRow(i).getCell(j);
					if(cell.getCellType()== cell.CELL_TYPE_STRING){
						dataset[i-1][j] = ws.getRow(i).getCell(j).getStringCellValue();
					//System.out.println(dataset[i][j]);
					}
				}
			}
			return dataset;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dataset;
		
		
	}
	
	
	

}
