package com.training.dao;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.training.bean.LoginBean;
import com.training.bean.MessageBean;
import com.training.bean.PaymentBean;
import com.training.connection.GetConnection;
import com.training.pom.PaymentdbPOM;
import com.training.utility.LoadDBDetails;

// Data Access Object 
public class ELearningDAO {
	
	Properties properties; 
	
	public ELearningDAO() {
		 try {
			properties = new Properties();
			FileInputStream inStream = new FileInputStream("./resources/sql.properties");
			properties.load(inStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public List<LoginBean> getLogins(){
		String sql = properties.getProperty("get.logins"); 
		
		GetConnection gc  = new GetConnection(); 
		List<LoginBean> list = null;
		try {
			gc.ps1 = GetConnection.getMySqlConnection(LoadDBDetails.getDBDetails()).prepareStatement(sql); 
			list = new ArrayList<LoginBean>(); 
			
			gc.rs1 = gc.ps1.executeQuery(); 
			
			while(gc.rs1.next()) {
			
				LoginBean temp = new LoginBean(); 
				temp.setUserName(gc.rs1.getString(1));
				temp.setPassword(gc.rs1.getString(2));

				list.add(temp); 
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list; 
	}
	
	public static void main(String[] args) {
		new ELearningDAO().getpayment().forEach(System.out :: println);
	}
	
	public List<PaymentBean> getpayment(){
		String sql = properties.getProperty("get.payment"); 
		
		GetConnection gc  = new GetConnection(); 
		List<PaymentBean> list = null;
		try {
			gc.ps1 = GetConnection.getMySqlConnection(LoadDBDetails.getDBDetails()).prepareStatement(sql); 
			list = new ArrayList<PaymentBean>();
	
		gc.rs1 = gc.ps1.executeQuery(); 
		while(gc.rs1.next()) {
			PaymentBean temp = new PaymentBean();
				
			  temp.setLogin(gc.rs1.getString(1));
			   temp.setAmount(gc.rs1.getString(2));
				temp.setDesc(gc.rs1.getString(3));

			list.add(temp); 
		}
				
	
		
				
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list; 
	}
	
	
	public List<MessageBean> getmessage(){
		String sql = properties.getProperty("get.message"); 
		
		GetConnection gc  = new GetConnection(); 
		List<MessageBean> list = null;
		try {
			gc.ps1 = GetConnection.getMySqlConnection(LoadDBDetails.getDBDetails()).prepareStatement(sql); 
			list = new ArrayList<MessageBean>(); 
			
			gc.rs1 = gc.ps1.executeQuery(); 
			
			while(gc.rs1.next()) {
			
				MessageBean temp = new MessageBean(); 
				temp.setMemlogin(gc.rs1.getString(1));
				temp.setSubject(gc.rs1.getString(2));
				temp.setBodytxt(gc.rs1.getString(3));

				list.add(temp); 
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list; 
	}
	
		}
				
	
		
				
		
