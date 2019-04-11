package com.pankanis.servicecloudcrm.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
/**
 * This class defines methods to dynamically read excel files
 * @author ronit.joardar
 *
 */
public class ExcelReader extends Utility {

	public org.apache.poi.ss.usermodel.Workbook wb;
	public org.apache.poi.ss.usermodel.Sheet sheet;
	public String filePath;
	public org.apache.poi.ss.usermodel.Cell cell;
	public org.apache.poi.ss.usermodel.Row row;
	public static ExcelReader reader;

	public ExcelReader() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

	public void readExcel(String filePath) throws IOException {
		this.filePath = filePath;

		try {
			File file = new File(filePath);
			FileInputStream fis = new FileInputStream(file);
			wb = WorkbookFactory.create(fis);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// Get data from Excel
	public String getCellData(String sheetName, String colName, int rowNum) {
		try {
			int col_Num = 0;
			int index = wb.getSheetIndex(sheetName);
			sheet = wb.getSheetAt(index);
			row = sheet.getRow(0);
			for (int i = 0; i < row.getLastCellNum(); i++) {
				if (row.getCell(i).getStringCellValue().equals(colName)) {
					col_Num = i;
				}
			}
			row = sheet.getRow(rowNum - 1);
			cell = row.getCell(col_Num);
			if (cell.getCellType() == Cell.CELL_TYPE_STRING) {
				return cell.getStringCellValue();
			} else if (cell.getCellType() == Cell.CELL_TYPE_NUMERIC) {
				return String.valueOf(cell.getNumericCellValue());
			} else if (cell.getCellType() == Cell.CELL_TYPE_BOOLEAN) {
				return String.valueOf(cell.getBooleanCellValue());
			} else if (cell.getCellType() == Cell.CELL_TYPE_BLANK) {
				return "";

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

	public String getCellData(String sheetName, int col_Name, int rowNum) {
		try {

			int index = wb.getSheetIndex(sheetName);
			sheet = wb.getSheetAt(index);
			row = sheet.getRow(0);
			row = sheet.getRow(rowNum - 1);
			cell = row.getCell(col_Name);
			if (cell.getCellType() == Cell.CELL_TYPE_STRING) {
				return cell.getStringCellValue();
			} else if (cell.getCellType() == Cell.CELL_TYPE_NUMERIC) {
				return String.valueOf(cell.getNumericCellValue());
			} else if (cell.getCellType() == Cell.CELL_TYPE_BOOLEAN) {
				return String.valueOf(cell.getBooleanCellValue());
			} else if (cell.getCellType() == Cell.CELL_TYPE_BLANK) {
				return "";

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

	public int getRowCount(String sheetName) {
		try {
			int index = wb.getSheetIndex(sheetName);
			if (index == -1) {
				return 0;
			} else {
				sheet = wb.getSheetAt(index);
				int rowNumber = sheet.getLastRowNum() + 1;
				return rowNumber;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;

	}

	public int getCoulumnCount(String sheetName) {
		try {
			int index = wb.getSheetIndex(sheetName);
			if (index == -1) {
				return 0;
			} else {
				sheet = wb.getSheet(sheetName);
				row = sheet.getRow(0);
				return row.getLastCellNum();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	public static void main(String args[]) throws Exception {
		
		reader = new ExcelReader();
		String filePath = System.getProperty("user.dir") + reader.excel_path;
		System.out.println("filepath" + filePath);
		reader.readExcel(filePath);
		System.out.println(reader.getCellData("OpportunitiesAdd", 1, 1));
		
	}

}
