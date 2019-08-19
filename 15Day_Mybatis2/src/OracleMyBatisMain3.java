
import java.util.HashMap;
import java.util.List;

import com.dto.Dept;
import com.service.OracleMyBatisService;

public class OracleMyBatisMain3 {

	public static void main(String[] args) {
		

		OracleMyBatisService service = new OracleMyBatisService();
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("key1", 10);
		map.put("key2", 50);
		List<Dept> list = service.selectByHashmap(map);
		for (Dept dept : list)	{
			System.out.println(dept);
		}
		
		HashMap map2 = service.selectByDeptnoHashmap(10);
		System.out.print(map);
		
		//dept 레코드 갯수
		int num = service.deptRecordCount();
		System.out.println("레코드 갯수:" + num);
		
			
		}//end main

	}//end class


