import java.util.function.BiPredicate;
import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class PredicateTest {

	public static void main(String[] args) {
		/*
		 *   Predicate
		 *   
		 *   파라미터 있고 리턴값(boolean)
		 *   test() 메서드 사용
		 */

		Predicate<String> x = n-> n.length()==3;
		boolean x2 =x.test("홍길동");
		System.out.println(x2);
		
		BiPredicate<String, String> y =(n,n2)->(n+n2).length()==5;
		boolean y2 = y.test("홍길동", "정조");
		System.out.println(y2);
		
		DoublePredicate k = n-> n==3.14;
		boolean k2 = k.test(3.14);
		System.out.println(k2);
		
		IntPredicate z =  n-> n==100;
		boolean z2 = z.test(100);
		System.out.println(z2);
		
		
	}//end main
}//end class





