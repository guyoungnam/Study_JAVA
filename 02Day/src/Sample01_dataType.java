import java.util.Date;

public class Sample01_dataType {

	public static void main(String[] args) {

		System.out.println("\uD64D"); // 문자열, 반드시  ""
		System.out.println(100); // 정수 
		System.out.println(3.14); // 실수, 3.14D 와 동일 
		System.out.println(3.14F); // 실수 ,f 와 동일
		System.out.println(3.14D); // 실수 ,d 와동일
		System.out.println('\uD64D'); // 문자(하나의 문자),반드시 ''
		System.out.println(true); // 논리값(true,false)
		System.out.println(false); // 논리값(true,false)
		//System.out.println(null); //null 값, 가리키지않는것(참조하지않는것)
		System.out.println(new Date()); // 날짜
	    	
		
		
	}

}
