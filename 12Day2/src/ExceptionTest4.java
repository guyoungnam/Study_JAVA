
public class ExceptionTest4 {

	public static void main(String[] args) {
	
		
		System.out.println("프로그램 시작");
		
		try {
		int num = 10;
		int result = num/1;
		System.out.println(result);
		
		
		String name = null;
		System.out.println(name.length());
		
		
		}catch(NullPointerException e) {
		System.out.println("예외발생1" + e.getMessage());
		}catch(ArithmeticException e) {   //다형성(권장안함)
	     System.out.println("예외발생2" + e.getMessage());	
		}
		System.out.println("프로그램 종료");

	}

}
