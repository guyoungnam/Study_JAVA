import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleUnaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

public class OperatorTest {

	public static void main(String[] args) {
	
		
		/*
		 * Operator 
		 * 파라미터 있고 리턴값 있음
		 * 주로 연산에 사용됨
		 * 입력 타입과 출력타입이 똑같다.
		 */
		
		
		BinaryOperator<String> s = (n,n2)->n+n2;
		String m = s.apply("홍길동", "이순신");
		System.out.println(m);
		
		UnaryOperator<Integer> s2 = (n)->n+100;
		int m2 = s2.apply(10);
		System.out.println(m2);
		
		DoubleBinaryOperator x = (n,n2)->n+n2+1.0;
		double m3 = x.applyAsDouble(3.4, 3.4);
		System.out.println(m3);
		
		DoubleUnaryOperator x2 = n->n+1.0;
		double m4 = x2.applyAsDouble(3.14);
		System.out.println(m4);
		
		IntBinaryOperator y = (n,n2)->n+n2;
		int y2 = y.applyAsInt(100, 200);
		System.out.println(y2);
		
		IntUnaryOperator k = n-> n+100;
		int k2 = k.applyAsInt(200);
		System.out.println(k2);

	}

}
