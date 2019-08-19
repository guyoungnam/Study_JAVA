import java.util.Date;

public class TestStudent2 {

	public static void main(String[] args) {
		
		// Object의 equals()==> 참조값(실제값),  ==  ==> 기본값
	
		String s = new String("hello");
		String s2 = new String("hello");
		
		// s와 s2가 같냐?
		System.out.println(s.equals(s2));
		
		Student x =new Student("홍길동", 20, "서울");
		Student x2 =new Student("홍길동", 20, "서울");
		// x와 x2가 같냐?
		System.out.println(x.equals(x2));
	}

}
