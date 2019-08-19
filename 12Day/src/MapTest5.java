import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapTest5 {

	public static void main(String[] args) {

		
	HashMap<String,Person> map = new HashMap<>();
	map.put("one", new Person("홍길동", 20, "서울"));
	map.put("two", new Person("이순신", 30, "전라"));
	map.put("three", new Person("유관순", 40, "서울"));

     System.out.println(map.get("one").getName()+map.get("one").getAge()+map.get("one").getAddress());
     System.out.println(map.get("two").getName()+map.get("two").getAge()+map.get("two").getAddress());
     System.out.println(map.get("three").getName()+map.get("three").getAge()+map.get("three").getAddress());
     
     System.out.println(map.get("one"));
     Person one = map.get("one");
     System.out.println(one); // tostring
     
     Set<String> keys = map.keySet();
     for (String key : keys) {
    	 Person p = map.get(key);
    	 System.out.println(p.getName());
     }
     
	}

}
