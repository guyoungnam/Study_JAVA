
import java.util.List;

import com.dto.Dept;
import com.service.OracleMyBatisService;

public class OracleMyBatisMain {

	public static void main(String[] args) {

		OracleMyBatisService service = new OracleMyBatisService();

		// 2 insert
		// service.insert(new Dept(77,"개발","서울"));

		// 3 update
		// service.update(new Dept(77,"개발2","서울2"));

		// 4 delete
		// service.delete(77);

		// 1. selectAll

		List<Dept> list = service.selectAll();
		for (Dept dept : list) {
			System.out.println(dept);
		}

	}// end main

}// end class
