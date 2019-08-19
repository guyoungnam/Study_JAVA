import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class StreamTest2 {

	
	static int sum=0; //static이 필요하다. 인스턴스변수?
	public static void main(String[] args) {


		List<Integer> list = Arrays.asList(1,2,3,4,5,6);
		
		IntStream st = IntStream.range(1,7);  //range 라는 메서드 이용
		st.forEach(n->System.out.println(n));
		
		//int sum=0; 상수이기 때문에 사용하려면 밖으로 뽑아내야한다.
		
		//IntStream st2 = IntStream.range(1, 7);
		IntStream st2 = IntStream.rangeClosed(1,7); // 7포함
		st2.forEach(n->{
			sum = sum+n;
			System.out.println(sum);
		});

	}

}
