import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamTest6 {
	
	//정렬 ==> 비교 가능 --> 반드시 Comparator 또는 Comparable 사용
	
	public static void main(String[] args) {
		

		List<Integer> list = Arrays.asList(2,43,14,12,5,65,25,4);
		
		list.stream()
		.sorted()
		.forEach(n->System.out.println(n));
		
		list.stream()
		.sorted(Comparator.reverseOrder())
		.forEach(n->System.out.println(">>"+n));
	

	
}
}
