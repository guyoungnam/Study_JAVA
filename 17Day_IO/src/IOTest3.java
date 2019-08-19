import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class IOTest3 {

	public static void main(String[] args) {
	
		

		
		System.out.println("데이터 입력:");
		InputStream is = System.in;
		InputStreamReader reader = null;
		
		 try {
			//필터 사용 : byte -> char로 변경
			 reader = new InputStreamReader(is);
			 int n = reader.read();
			 System.out.println((char)n);
			 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		 
		 
		
	}// end main

}// end class
