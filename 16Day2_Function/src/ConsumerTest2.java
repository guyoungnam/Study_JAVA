import java.util.Date;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;

class Person{}

public class ConsumerTest2 {

	public static void main(String[] args) {
	
	
		/*
		 * Consumer 인터페이스
		 * -파라미터 있고 리턴 없는 기능필요시 사용한다.
		 * 
		 */

	BiConsumer<String,String> c = (n,n2)->{System.out.println(n+n2);};
	c.accept("홍길동", "20");
		

	BiConsumer<String,Integer> c2 = (n,n2)->{System.out.println(n+n2);};
	c2.accept("홍길동2", 20);	
		
	BiConsumer<String,Person> c3 = (n,n2)->{System.out.println(n+n2);};
	c3.accept("홍길동3", new Person());	
		
	ObjLongConsumer<Person> xx = (n,n2)->{System.out.println(n.toString()+n2);};
	xx.accept(new Person(), 100);
	//뒤에는 롱으로 되어있다.
	
	ObjIntConsumer<String> xx2 = (n,n2)->{System.out.println(n+n2);};
	xx2.accept("유관순", 100);
	//앞은 object, 뒤에는 int 정해져있다.
	
	ObjDoubleConsumer<Date> xx3 = (n,n2)->{System.out.println(n.toString()+n2);};
	xx3.accept(new Date(), 4.32);
	
	}

}
