import java.io.IOException;
import java.io.InputStream;

public class IOTest {

	public static void main(String[] args) {
	
		
		//키보드 하면, system.in ?
		
		//표준 입력 ==> 키보드로 입력
		
		System.out.println("데이터 입력:");
		InputStream is = System.in;
		 try {
			int n = is.read();
			System.out.println((char)n); //a 소문자의 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				is.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		 
		 
		
	}// end main

}// end class
