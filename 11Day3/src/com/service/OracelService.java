package com.service;

import java.util.HashSet;

import com.dao.OracleDAO;

public class OracelService {
	
	OracleDAO dao;

	public OracelService() {
		dao = new OracleDAO();
	}
	
	public HashSet<String> select() {
		HashSet<String> xxx =dao.select();
		return xxx;
	}
	
	

}
