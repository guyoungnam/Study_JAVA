
import java.util.Date;
import java.util.Random;
import java.util.function.Supplier;

public class SupplierTest {

	public static void main(String[] args) {
	
	
		/*
		 * Supplier 인터페이스
		 * -파라미터 없고 리턴 있는 기능필요시 사용한다.
		 * 
		 */

	Supplier<String> x = ()->"홍길동";
	String m = x.get();
	System.out.println(m);
	
	Supplier<String> x2 = ()->{
		Date d = new Date();
		return d.toString();
	};
	String m2 = x2.get();
	System.out.println(m2);
	
	Supplier<Integer> x3 = ()->{
		Random r = new Random();
		return r.nextInt(3);
	};
	int m3 = x3.get();
	System.out.println(m3);
	
	}// end main

}// end class
