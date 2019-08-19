import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCTest {

	public static void main(String[] args) {

		
		//1. 4가지 정보
		
		String driver="oracle.jdbc.driver.OracleDriver";
		String url= "jdbc:oracle:thin:@localhost:1521:orcl";
        String userid = "scott";
        String passwd = "tiger";
        
        //2. 드라이버 생성=> new 이용
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        
        try {
			Class.forName(driver);
			
			
		//3. 오라클 연결 (Connection 연결)
			con = DriverManager.getConnection(url, userid, passwd);
			
		//4. sql 작성
			String sql = "select deptno x, dname, loc from dept"; // ; 제거
		
			
		//5. SQL 실행 ==> Statement, PreparedStatement, CallableStatement (PL/SQL)	
		
		// Statement는 성능이 떨어져서 잘 쓰지 않는다.
		// 바인딩 변수에 의해 
		// aias x가 들어가는 경우 x로 받아야한다.
		
			pstmt = con.prepareStatement(sql);
			
		
		//6. 실행해서 결과 받기	
		    rs = pstmt.executeQuery();	
		
		while(rs.next()) {
			int deptno = rs.getInt("x");
			String dname = rs.getString(2);
			String loc = rs.getString("loc");
			
		System.out.println(deptno+"\t"+dname+"\t"+loc);
		}
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally {
        
			try {
		        // 7. 자원반납
				
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(con!=null)con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
        
	}//end main

}//end class
