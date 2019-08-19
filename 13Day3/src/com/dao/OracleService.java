package com.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import com.dto.Dept;
import com.exception.RecordNotFoundException;

public class OracleService {
	
	OracleDAO dao; // 서비스가 dao 사용한다.

	public OracleService() {
		
		dao = new OracleDAO();
	}
	   public ArrayList<Dept> select() throws SQLException {
		   ArrayList<Dept> list = dao.select();
		return list;
		   
	   }
	public void insert(Dept xx) throws SQLException {
		// TODO Auto-generated method stub
		dao.insert(xx);
	}
	public void update(Dept xx2)throws ReflectiveOperationException, RecordNotFoundException {
		// TODO Auto-generated method stub
		dao.update(xx2);
		
	}
	public void delete(int i) {
		// TODO Auto-generated method stub
		dao.delete(i);
		
	}
	

}
