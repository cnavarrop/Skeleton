package utils;

public class ExcelData {


	public Object[][] TestData(String path, String hoja) {

		ExcelUtilities excel = new ExcelUtilities(path, hoja);
		int row = excel.getRowCount();
		int col = excel.getColCount();
		Object data[][] = new Object[row-1][col];

		for (int i = 1; i <row; i++) {
			for (int j = 0; j < col; j++) {
		
				
            String cellData = excel.getCellData(i, j);
            data[i-1][j]= cellData;
			}
		}
		
		return data;
	}

}
