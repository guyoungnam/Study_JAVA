import java.util.function.IntPredicate;

public class PredicateTest2 {

	public static void main(String[] args) {
		
/*
 * and 연산 : and()
 * or 연산 : or()
 * ! : negate()
 * 
 * 
 */

		IntPredicate x = n-> n%2==0;
		IntPredicate x2 = n-> n%3==0;
		
		IntPredicate x3 = x.and(x2); //true and true
		boolean result = x3.test(6);
		System.out.println(result);
		
		IntPredicate xx3 = x.or(x2);
		boolean result2 = xx3.test(9);
		System.out.println(result2);
		
		IntPredicate k = x.negate();
		boolean k2 = k.test(6);
		System.out.println(k2);
 
	}

}
