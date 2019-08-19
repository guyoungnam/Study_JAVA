import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamTest7 {
	
	//정렬 ==> 비교 가능 --> 반드시 Comparator 또는 Comparable 사용
	
	public static void main(String[] args) {
		

		List<Person> list = Arrays.asList(new Person("홍길동", 20, "서울"),
				new Person("이순신", 44, "전라"),
				new Person("유관순", 33, "전라"));
		
		list.stream()
		.sorted()
		.forEach(n->System.out.println(n));
		
		
		list.stream()
		.sorted(Comparator.reverseOrder())
		.forEach(n->System.out.println(">>"+n));

	
}
}
