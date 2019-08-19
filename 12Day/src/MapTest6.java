import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapTest6 {

	public static void main(String[] args) {

		
	ArrayList<Person> list = new ArrayList<Person>();
	list.add(new Person("홍길동", 20, "서울"));
	list.add(new Person("홍길동2", 30, "서울"));
	list.add(new Person("홍길동3", 40, "서울"));
	
	
	ArrayList<Person> list2 = new ArrayList<Person>();
	list2.add(new Person("이순신", 20, "서울"));
	list2.add(new Person("이순신2", 30, "서울"));
	list2.add(new Person("이순신3", 40, "서울"));
	
    HashMap<String, ArrayList<Person>> map =
    		new HashMap<String, ArrayList<Person>>();
   
    map.put("one", list);
    map.put("two", list);
    
    //데이터 출력하기
    
    System.out.println(map.get("one"));
    
    Set<String> keys = map.keySet();
    for (String key : keys) {
   	 ArrayList<Person> xx = map.get(key);
   	 for ( Person p : xx) {
   		 System.out.println(p.getName()+"\t"+p.getAge());
   	 }

	
    }
	}
}
