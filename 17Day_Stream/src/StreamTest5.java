import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamTest5 {
	
	public static void main(String[] args) {
		

		List<String> list = Arrays.asList("유관순","홍길동", "이순신", "유관순","이순신");
		
		list.stream()
		.skip(3)
		.forEach(n->System.out.println("$$"+n));
		
		
		list.stream()
		.limit(3)
		.forEach(n->System.out.println("&&"+n));
		
		list.stream()
		.distinct()
		.forEach(n->System.out.println(n));
	
		list.stream()
		.filter(n-> n.startsWith("이"))
		.forEach(n->System.out.println(">>"+n));
		
		
		list.stream()
		.distinct()
		.filter(n-> n.startsWith("이"))
		.forEach(n->System.out.println("**"+n));
		
	

	
}
}
