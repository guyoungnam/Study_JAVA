import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapTest7 {

	public static void main(String[] args) {

		
		HashMap<String,Person> map = new HashMap<>();
		map.put("one", new Person("홍길동", 20, "서울"));
		map.put("two", new Person("이순신", 30, "전라"));
		map.put("three", new Person("유관순", 40, "서울"));

		HashMap<String,Person> map2 = new HashMap<>();
		map.put("one", new Person("홍길동2", 200, "서울2"));
		map.put("two", new Person("이순신2", 300, "전라2"));
		map.put("three", new Person("유관순2", 400, "서울2"));
		
		ArrayList<HashMap<String,Person>> list = 
				new ArrayList<HashMap<String,Person>>();
		
		list.add(map);
		list.add(map2);

		//데이터출력
		
		for(HashMap<String,Person> HashMap :list) {
			Set<String> keys= HashMap.keySet();
			for (String key : keys) {
		    	 Person p = HashMap.get(key);
		    	 System.out.println(p.getName());
		     }
		
		}
			
}
}