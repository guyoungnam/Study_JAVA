package com.service;

import com.dao.MySQLDAO;

public class DBService {

	public void setDAO(MySQLDAO dao) {
		dao.connectMySQL();
	}
}
