import com.dao.MySQLDAO;
import com.service.DBService;

public class DBMain {

	public static void main(String[] args) {
		
		DBService service = new DBService();
		//OracleDAO 사용
		//service.setDAO(new OracleDAO());
		//MySQLDAO 사용
		service.setDAO(new MySQLDAO());
	}

}
