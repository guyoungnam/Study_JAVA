
public class ExceptionTest6 {

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
		}catch(Exception e) {   
		     System.out.println("예외발생2" + e.getMessage());	
		}finally {
			System.out.println("반드시 수행되는 문장");
			
		}
		System.out.println("프로그램 종료");

	}

}
