import java.util.Date;

public class TestStudent {

	public static void main(String[] args) {
		
		// Object의 toString()
		// ==> 값(참조값)을 출력할때 문자열로 출력하기 위해서
		// 자동으로 호출된다.
		
		Date d = new Date();
		System.out.println(d);
		System.out.println(d.toString());
		
		
		Integer i = new Integer(100);
		System.out.println(i);
		System.out.println(i.toString());
		
		//String.valueOf(3.14)
		
		Student s =new Student("홍길동", 20, "서울");
		System.out.println(".."+s);
		System.out.println(s.toString());
		System.out.println(s.getName()
				+"\t"+s.getAge()+"\t"+s.getAddress());
		System.out.println(s.getEmployee());
	}

}
