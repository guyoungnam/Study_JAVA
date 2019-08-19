import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import com.dto.Dept;
import com.service.OracleMyBatisService;

public class OracleMyBaisMain5 {

	public static void main(String[] args) {
	
		OracleMyBatisService service =new OracleMyBatisService();
		
		//foreach
		
		//3. mulit delete
		List<Dept> deptList = Arrays.asList(new Dept(13,"",""),new Dept(14,"",""));
		service.multiDelete(deptList);
		
		
		
		//2. multi update
		List<Integer> deptnoes2 = Arrays.asList(70,14,80);
		service.multiUpdate(deptnoes2);
		
		
		//1. multi select
		List<Integer> deptnoes = Arrays.asList(10,20,30);
		
		List<Dept> list =service.multiSelect(deptnoes);
		for (Dept dept : list) {
			System.out.println(dept);
		}
	
		
		
		
		//https//githun.com 회원가입 필요
	
	}//end main
}//end class






