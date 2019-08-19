import java.util.Date;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;

public class AndThenTest {

	public static void main(String[] args) {

		
		/*
		 *  consumer, function, operator
		 *  
		 *  ==> 한꺼번에 여러개 처리
		 */
		
		//1 Consumer
		Consumer<String> c = a->System.out.println("First:"+a);
		Consumer<String> c2 = a->System.out.println("Second:"+a);
		
		Consumer<String> c3 = c.andThen(c2);
		c3.accept("홍길동");
		
		
		//2 Function
		Function<String, Integer> k = n->n.length();
		Function<Integer,Date> k2 = n-> new Date();	
		
		
		Function<String,Date> k3= k.andThen(k2);
		Date xxx = k3.apply("hello");
		System.out.println(xxx);

		//3 operator
		
		BinaryOperator<String> e = (n,n2)->n+n2;
		Function<String, Integer> e1 = n->n.length();
		BiFunction<String, String, Integer> e2 = e.andThen(e1);
		
		int mmm = e2.apply("aaa", "bbb");
		System.out.println(mmm); 
		
	}

}
