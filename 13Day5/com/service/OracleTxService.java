package com.service;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

import com.dao.OracleTxDAO;
import com.dto.Dept;
import com.exception.RecordNotFoundException;

public class OracleTxService {
	String driver="oracle.jdbc.driver.OracleDriver";
	String url="jdbc:oracle:thin:@localhost:1521:orcl";
	String userid ="scott";
	String passwd ="tiger";
	
	OracleTxDAO dao; 
	public OracleTxService() {
		dao = new OracleTxDAO();
		
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}//end OracleDAO
	
	 public ArrayList<Dept> select() throws SQLException {
		 Connection con=null;
		 ArrayList<Dept> list =null;
		 try {
		
		 con=DriverManager.getConnection(url,userid,passwd);
		 list = dao.select(con);
		 }finally {
		   if(con!=null)con.close();
		 }
		   return list;
		   
	   } //insert 
	 
	 
	 public void insert(Dept xx)  {
		 Connection con=null;
		 
		 try {
			 con=DriverManager.getConnection(url,userid,passwd);
			 dao.insert(con,xx);
		 }catch(SQLException e) {
			 System.out.println(e.getMessage());
			 //e.printStackTracce();
			 }finally {
			   if(con!=null)
				try {
					con.close();
				} catch (SQLException e) {
			
					e.printStackTrace();
				}
				}
	 }
			   
				public void update(Dept xx2) throws RecordNotFoundException {
					 Connection con=null;
					 
					 try {
						 con=DriverManager.getConnection(url,userid,passwd);
						 dao.update(con,xx2);
					 }catch(SQLException e) {
						 System.out.println(e.getMessage());
						 //e.printStackTracce();
						 }finally {
						   if(con!=null)
							try {
								con.close();
							} catch (SQLException e) {
						
								e.printStackTrace();
							}
						 }}
						  
						   public void delete(int i) {
							   Connection con=null;
								 
								 try {
									 con=DriverManager.getConnection(url,userid,passwd);
									 dao.delete(con,i);
								 }catch(SQLException e) {
									 System.out.println(e.getMessage());
									 //e.printStackTracce();
									 }finally {
									   if(con!=null)
										try {
											con.close();
										} catch (SQLException e) {
									
											e.printStackTrace();
										}
	
					
				}
			 }

						public void insertDelete(Dept dept, int i) {
							
								Connection con = null;
								try {
									con = DriverManager.getConnection(url, userid, passwd);
					con.setAutoCommit(false);
									 dao.insert(con, dept);
									 dao.delete(con, i);
					con.commit();
								}catch (SQLException e) {
								System.out.println(e.getMessage());
							try {
								if(con!=null)con.rollback();
							} catch (SQLException e1) {
								e.printStackTrace();
							}
						}finally {
							try {
								if (con != null)con.close();
							} catch (SQLException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							
						}

			
		}
}
}