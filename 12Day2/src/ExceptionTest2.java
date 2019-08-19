
public class ExceptionTest2 {

	public static void main(String[] args) {
	
		
		System.out.println("프로그램 시작");
		
		try {
		int num = 10;
		int result = num/0;
		System.out.println(result);
		}catch(Exception e	) {   //다형성
			System.out.println("예외발생!!!!");
		}
		System.out.println("프로그램 종료");

	}

}
