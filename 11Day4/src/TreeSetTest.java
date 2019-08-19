import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		
		TreeSet<String> s = new TreeSet<String>();
		s.add("hello");
		s.add("aello");
		s.add("bello");
		s.add("xello");
		s.add("pello");
		
		System.out.println(s);

		System.out.println("첫번째요소:"+ s.first());
		System.out.println("마지막 요소:"+ s.last());
		System.out.println("지정된값 앞요소(exclusive):"+ s.headSet("hello"));
		System.out.println("지정된값 뒤요소(inclusive):"+ s.tailSet("hello"));
		System.out.println("범위요소:"+ s.subSet("bello","xello"));
		
	}

}
