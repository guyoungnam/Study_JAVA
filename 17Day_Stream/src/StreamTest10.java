import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest10 {
	

	public static void main(String[] args) {
		

    //10, 5, 4,2 => 10.0, 5.0, 4.0, 2.0
		
	IntStream st = Arrays.stream(new int[] {10,5,4,2});
	
	st.asDoubleStream()
	.forEach(n->System.out.println(n));
	
	
	// int --> Integer
	
	IntStream st2 = Arrays.stream(new int[] {10,5,4,2});	
	st2.boxed()
	.forEach(n->System.out.println(n instanceof Integer));
	
	
}
}
