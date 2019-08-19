import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {
		
		Set set = new HashSet();
		set.add("홍길동");
		set.add("이순신");
		set.add(20);
		set.add("홍길동");
		set.add(3.15);
		set.add(new Date());
		
		//  값 출력
		
		System.out.println("길이:" + set.size());
		System.out.println("포함여부:" + set.contains(20));
		System.out.println("empty냐:" + set.isEmpty());
		set.remove("홍길동");
		Object [] xxx = set.toArray();
		for (Object o : xxx) {
			System.out.println(o);
		}
		set.clear();
		System.out.println(set);
	}

}
