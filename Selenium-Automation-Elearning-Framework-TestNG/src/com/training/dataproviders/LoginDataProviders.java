package com.training.dataproviders;

import java.util.List;

import org.testng.annotations.DataProvider;

import com.training.bean.LoginBean;
import com.training.bean.MessageBean;
import com.training.bean.PaymentBean;
import com.training.dao.ELearningDAO;
import com.training.readexcel.ApachePOIExcelRead;
import com.training.readexcel.ReadExcel;

public class LoginDataProviders {

	 
	@DataProvider(name = "db-inputs1")
	public Object [][] setDBData1() {
       
		List<PaymentBean> list = new ELearningDAO().getpayment(); 
		
		Object[][] result = new Object[list.size()][]; 
		int count = 0; 
		for(PaymentBean temp : list){
			Object[]  obj = new Object[3]; 
			obj[0] = temp.getLogin(); 
			obj[1] = temp.getAmount(); 
			obj[2] = temp.getDesc();
			
			result[count ++] = obj; 
		}
		
		
		return result;
	}
	
	@DataProvider(name = "db-inputs2")
	public Object [][] setDBData2() {
       
		List<MessageBean> list = new ELearningDAO().getmessage(); 
		
		Object[][] result = new Object[list.size()][]; 
		int count = 0; 
		for(MessageBean temp : list){
			Object[]  obj = new Object[3]; 
			obj[0] = temp.getMemlogin(); 
			obj[1] = temp.getSubject(); 
			obj[2] = temp.getBodytxt();
			
			result[count ++] = obj; 
		}
		
		
		return result;
	}
	
	@DataProvider(name = "excel-inputs1")
	public Object[][] getExcelData1(){
		String fileName ="C:\\Users\\SHIRENRAI\\Desktop\\Cyclos\\Test\\CYTC_test.xlsx"; 
		int SheetNum =0;
		return new ApachePOIExcelRead().getExcelContent(fileName, SheetNum); 
}
	@DataProvider(name = "excel-inputs2")
	public Object[][] getExcelData2(){
		String fileName ="C:\\Users\\SHIRENRAI\\Desktop\\Cyclos\\Test\\CYTC_test.xlsx"; 
		int SheetNum =1;
		return new ApachePOIExcelRead().getExcelContent(fileName, SheetNum); 
}
	
	@DataProvider(name = "xls-inputs")
	public Object[][] getXLSData(){
		// ensure you will have the title as first line in the file 
		return new ReadExcel().getExcelData("C:/Users/Naveen/Desktop/Testing.xls", "Sheet1"); 
	}
}
