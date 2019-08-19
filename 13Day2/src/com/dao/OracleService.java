package com.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import com.dto.Dept;

public class OracleService {
	
	OracleDAO dao; // 서비스가 dao 사용한다.

	public OracleService() {
		
		dao = new OracleDAO();
	}
	   public ArrayList<Dept> select() throws SQLException {
		   ArrayList<Dept> list = dao.select();
		return list;
		   
	   }
	

}
