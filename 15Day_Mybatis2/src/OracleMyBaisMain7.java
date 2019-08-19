import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import com.dto.Dept;
import com.service.OracleMyBatisService;

public class OracleMyBaisMain7 {

	public static void main(String[] args) {
	
		OracleMyBatisService service =new OracleMyBatisService();
		
		// sequence 이용한 mulit insert
		List<String> deptnoes2 = Arrays.asList("홍길동", "이순신", "유관순");
		service.multiUpdateSeq(deptnoes2);
		
	
	
	}//end main
}//end class






