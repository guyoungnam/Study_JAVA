import java.util.HashSet;

import com.service.OracelService;

public class OracleMain {

	public static void main(String[] args) {
		
		OracelService service = new OracelService();
		HashSet<String> xxx =service.select();
		for (String s :xxx) {
			System.out.println(s);
		}
		

	}

}
