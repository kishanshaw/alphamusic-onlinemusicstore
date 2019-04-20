package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.bean.cartBean;

public class cartDao {
	
	Connection con=null;
	Statement st=null;
	
	public int add(cartBean b)
	{
		int x=0;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@INGNRGPILPHP01:1521:ORCLILP","aja45core","aja45core");
			st=con.createStatement();
			x=st.executeUpdate("insert into cart values("+b.getMusicId()+",'"+b.getMusicName()+"')");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
				try {
					if(st!=null)
						st.close();
					if(con!=null)
						con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		return x;
	}
	
}
