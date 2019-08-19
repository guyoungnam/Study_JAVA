package com.service;

import java.util.HashSet;
import java.util.Set;

import com.dao.OracleDAO;

public class OracelService {
	
	OracleDAO dao;

	public OracelService() {
		dao = new OracleDAO();
	}
	
	public Set<String> select() {
		//Set<String> xxx =dao.select();
		return dao.select();
	}
	
	

}
