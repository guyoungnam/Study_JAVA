import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;

public class ConsumerTest {

	public static void main(String[] args) {
	
		/*
		 * Consumer 인터페이스
		 * -파라미터 있고 리턴 없는 기능필요시 사용한다.
		 * 
		 */

		Consumer<String> c = x->{System.out.println(x);};
		c.accept("홍길동");
		
		Consumer<String> c2 = x->System.out.println(x);
		c2.accept("홍길동2");
		
		Consumer<Integer> c3 = x->System.out.println(x);
		c3.accept(100);
		
		Consumer<Double> c4 = x->System.out.println(x);
		c4.accept(3.14);
		
		IntConsumer d = x->System.out.println(x);
		d.accept(200);
		
		DoubleConsumer d2 = x->System.out.println(x);
		d2.accept(3.14);

	}

}
