import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCTest5 {

	public static void main(String[] args) {

		
		//1. 4가지 정보
		
		String driver="oracle.jdbc.driver.OracleDriver";
		String url= "jdbc:oracle:thin:@localhost:1521:orcl";
        String userid = "scott";
        String passwd = "tiger";
        
        //2. 드라이버 생성=> new 이용
        Connection con = null;
        PreparedStatement pstmt = null;

        
        try {
			Class.forName(driver);
			
			
		//3. 오라클 연결 (Connection 연결)
			con = DriverManager.getConnection(url, userid, passwd);
			
		//4. sql 작성
			String sql = "delete from dept where deptno=?"; // ; 제거
		
			
		//5. SQL 실행 ==> Statement, PreparedStatement, CallableStatement (PL/SQL)	
		
		// Statement는 성능이 떨어져서 잘 쓰지 않는다.
		// 바인딩 변수에 의해 
		// aias x가 들어가는 경우 x로 받아야한다.
		
			pstmt = con.prepareStatement(sql); 
			pstmt.setInt(1,11 );

		
		//6. 실행해서 결과 받기	
		  int num   = pstmt.executeUpdate();
		  System.out.println("실행된 레코드 갯수:" +num);
		
	
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
        
			try {
		        // 7. 자원반납
				

				if(pstmt!=null)pstmt.close();
				if(con!=null)con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
        
	}//end main

}//end class
