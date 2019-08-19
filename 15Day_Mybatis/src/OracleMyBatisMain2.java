
import java.util.List;

import com.dto.Dept;
import com.service.OracleMyBatisService;

public class OracleMyBatisMain2 {

	public static void main(String[] args) {
		

		OracleMyBatisService service = new OracleMyBatisService();
		
		//2. 조건검색  레코드 하나면, 
		
		Dept dto = service.selectByDeptno(10);
		System.out.println("검색:" +(dto.toString()));
		
		
		//1. selectAll   레코드 여러개
		
		List<Dept> list = service.selectAll();
		for (Dept dept : list) {
			System.out.println(dept);
			
			
			
			
		}//end main

	}//end class



}
