import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamTest8 {
	
	//정렬 ==> 비교 가능 --> 반드시 Comparator 또는 Comparable 사용
	
	public static void main(String[] args) {
		

		List<String> list = Arrays.asList("Java lamda","hello world");
		
		list.stream()
		.flatMap(n->Arrays.stream(n.split(" ")))
		.forEach(n->System.out.println(n));
			
		List<String> list2 =Arrays.asList("10,20,30","40,50,60");
		
		list2.stream()
		.flatMapToInt(n->{
			System.out.println(n);
			String [] data =n.split(",");
			int [] num = new int[data.length];
			for(int i=0; i< data.length; i++) {
				num[i] = Integer.parseInt(data[i]);
		}
			return Arrays.stream(num);
		})
		.forEach(n->System.out.println(n));
	

	
}
}
