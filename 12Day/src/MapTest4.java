import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapTest4 {

	public static void main(String[] args) {

		
		//메서드
		

		
		
		HashMap<String,String> map = new HashMap<>();
		map.put("one", "홍길동");
		map.put("two", "이순신");
		map.put("three", "강감찬");
		map.put("one", "강감찬");

		
		System.out.println(map.get("one"));
		System.out.println(map.get("two"));
		System.out.println(map.get("three"));
		
		//key 값만 얻기
		
		Set<String> keys = map.keySet();
		System.out.println(keys);
		
		for (String key : keys) {
			System.out.println(key+"\t"+map.get(key));
		}
		
		Iterator<String> ite = keys.iterator();
		while(ite.hasNext()) {
			String key = ite.next();
			System.out.println(key+"\t"+map.get(key));
		}
	
		
		//메서드
		
		System.out.println("크기:" +map.size());
		System.out.println("크기 포함 여부:" +map.containsKey("one"));
		System.out.println("크기 포함 여부:" +map.containsValue("one"));


	}

}
