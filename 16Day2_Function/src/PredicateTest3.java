import java.util.function.BiPredicate;
import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class PredicateTest3 {

	public static void main(String[] args) {
		/*
		 *   Predicate
		 *   
		 *   파라미터 있고 리턴값(boolean)
		 *   test() 메서드 사용
		 *   
		 *   and연산 : and()
		 *   or연산 :or()
		 *   !   : negate()
		 *   
		 */
		
		IntPredicate x = n-> n%2==0;
		IntPredicate x2 = n-> n%3==0;
		
		IntPredicate x3 = x.and(x2);
		boolean result = x3.test(6);
		System.out.println(result);
		
		IntPredicate xx3 = x.or(x2);
		boolean result2 = xx3.test(9);
		System.out.println(result2);
		
		IntPredicate k = x.negate(); // 부정
		boolean k2 = k.test(6);
		System.out.println(k2);
		
		
		

	
		
	}//end main
}//end class





