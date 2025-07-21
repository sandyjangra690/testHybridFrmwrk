package utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProviders {
	
	
	@DataProvider(name = "LoginData")
	public String [][]getData() throws IOException
	{
		String path= ".\\TestData\\LoginTestData.xlsx"; //taking xl file from testData
		ExcelUtility xlutil= new ExcelUtility(path); //creating an object for xlutility
		
		int totalRows= xlutil.getRowcount("Sheet1"); //using the method from ExcelUtility.java file
		int totalCols= xlutil.getCellCount("Sheet1",1);
		
		String loginData[][]= new String[totalRows][totalCols];
		for (int i=1; i<=totalRows; i++)  //need to skip the header row, so started i from 1
		{
			for(int j=0; j<totalCols;j++)    // i is rows and j is column
			{
				loginData[i-1][j]= xlutil.getCellData("Sheet1", i, j);  //1,0  (i-1 , bcoz array index starts from 0
			}
		}
			return loginData;
		
	}
	
}
