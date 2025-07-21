package utilities;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	
	String path;
	public FileInputStream fi;
	public FileOutputStream fo;
	public XSSFWorkbook workbook;
	public XSSFSheet sheet;
	public XSSFRow row;
	public XSSFCell cell;
	public CellStyle style;
		

	public ExcelUtility(String path) 
	{
		this.path=path;
	}
	
	public int getRowcount(String SheetName) throws IOException
	
	{
		fi = new FileInputStream(path);
		workbook = new XSSFWorkbook(fi);
		sheet = workbook.getSheet(SheetName);
		int rowcount = sheet.getLastRowNum();
		workbook.close();
		fi.close();
		return rowcount;
	}
	
	public int getCellCount(String SheetName, int rownum) throws IOException
	{
		
			fi = new FileInputStream(path);
			workbook = new XSSFWorkbook(fi);
			sheet = workbook.getSheet(SheetName);
			row=sheet.getRow(rownum);
			int cellcount = row.getLastCellNum();
			workbook.close();
			fi.close();
			return cellcount;
	}
		
	public String getCellData(String SheetName,int rownum,int colnum) throws IOException
	{
		fi = new FileInputStream(path);
		workbook = new XSSFWorkbook(fi);
		sheet = workbook.getSheet(SheetName);
		row=sheet.getRow(rownum);
		cell = row.getCell(colnum);
		
		DataFormatter formatter= new DataFormatter();
		String data;
		try {
		data = formatter.formatCellValue(cell);
		}
		catch (Exception e) {
			data = "";
		}
		workbook.close();
		fi.close();
		return data;
	}
		
	}
	



