import java.util.function.BooleanSupplier;
import java.util.function.DoubleFunction;
import java.util.function.DoubleSupplier;
import java.util.function.DoubleToIntFunction;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.IntSupplier;
import java.util.function.LongSupplier;
import java.util.function.ToDoubleFunction;

public class FunctionTest {

	public static void main(String[] args) {
	
	
		/*
		 *  Function 인터페이스
		 * -파라미터 있고 리턴 있는 기능필요시 사용한다.
		 * 
		 */

		
		Function<String, Integer> x = (n)->{return n.length(); };
		int x2 = x.apply("홍길동");
		System.out.println(x2);
		
		Function<String, Character> y = (n)-> n.charAt(0);
		int y2 = y.apply("홍길동");
		System.out.println(y2);
		
		DoubleFunction<String> k = (n)->"홍길동";
		String k2 = k.apply(3.14);
		System.out.println(k2);
		
		IntFunction<String> kk = (n)->"홍길동";
		String kk2 = kk.apply(3);
		System.out.println(kk2);
		
		//2. xxx to yyy function ==> xxx 입력, yyy리턴
		DoubleToIntFunction pp = (n)->100;
		int pp2 = pp.applyAsInt(3.14);
		System.out.println(pp2);
		
		//3. to xxxfunction ==> 제네릭 입력, xxx 리턴
		ToDoubleFunction<String> tt = (n)-> 3.14;
		double tt2 = tt.applyAsDouble("xxxx");
		System.out.println(tt2);
		
		
	
		

	
	}// end main

}// end class
