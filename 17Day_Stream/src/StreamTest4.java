import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamTest4 {
	
	public static void main(String[] args) {
		

		List<String> list = Arrays.asList("유관순","홍길동", "이순신", "유관순","이순신");
		
		Stream<String> st = list.stream();
		
		//1.중복제거
		//Stream<String> st2 = st.distinct();
		//st2.forEach(n->System.out.print(n));
		
		
		//2. filtering
		Predicate<String> p = n-> n.startsWith("이");
		Stream<String> st3 = st.filter(p);
		st3.forEach(n->System.out.println(n));

	
}
}
