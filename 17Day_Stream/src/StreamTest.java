import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamTest {

	public static void main(String[] args) {

		//1. List
		List<String> list = Arrays.asList("홍길동", "이순신", "유관순");
		//반복처리
		Stream<String> st = list.stream();
		
		//인터페이스 쓸려면, 
		//String을 이용한 방법
		Consumer<String> x = n->System.out.println(n);
		
		st.forEach(x);
		
		
		// st.forEach(n->System.out.println(n));   // 이런 방법도 있다.
		
		
		//2. 배열
		
		String [] names = {"홍길동", "이순신", "유관순"};
		Stream<String> st2 =Arrays.stream(names);
		st2.forEach(n->System.out.println(n));

	}

}
