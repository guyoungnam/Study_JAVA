import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;

public class SetTest3 {

	public static void main(String[] args) {
		
		//홍길동 20 서울 , 이순신 44 전라, 유관순 17 서울
		HashSet<Person> set = new HashSet<Person>();
		Person kkkk = new Person("유관순", 17, "서울");
		set.add(new Person("홍길동", 20, "서울"));
		set.add(new Person("이순신", 44, "전라"));
		set.add(new Person("이순신", 44, "전라"));
		set.add(kkkk);
		set.add(kkkk);
		
		
		
		for (Person p : set) {
			System.out.println(p.getName());
		}
		
		Iterator<Person> ite=set.iterator();
		while(ite.hasNext()) {
			Person ppp =ite.next();
			System.out.println(ppp.getName());
		}
		
	}

}
