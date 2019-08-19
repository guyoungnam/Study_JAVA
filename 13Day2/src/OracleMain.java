import java.sql.SQLException;
import java.util.ArrayList;

import com.dao.OracleService;
import com.dto.Dept;


public class OracleMain {

	public static void main(String[] args) {

		OracleService service = new OracleService();
		try {
			ArrayList<Dept> list= service.select();
			for (Dept dept : list) {
				System.out.println(dept);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
