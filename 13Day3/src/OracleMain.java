import java.sql.SQLException;
import java.util.ArrayList;

import com.dao.OracleService;
import com.dto.Dept;
import com.exception.RecordNotFoundException;

public class OracleMain {

	public static void main(String[] args) throws SQLException, RecordNotFoundException {
		
		OracleService service = new OracleService();
		
		//4번 클릭
		
		service.delete(99);
		
		//3번클릭
		
		Dept xx2 = new Dept(99, "영업", "서울");
		try {
			service.update(xx2);
		} catch (ReflectiveOperationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		//2번클릭
		int deptno = 99;
		String dname = "개발";
		String loc = "제주";
		
		Dept xx = new Dept(deptno, dname, loc);
		//service.insert(xx);
		
		
		//1번클릭
		try {
			ArrayList<Dept> list = service.select();
			for (Dept dept : list) {
				System.out.println(dept);
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}

		
	}

}
