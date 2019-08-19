import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class IOTest4 {

	public static void main(String[] args) {
	
		

		
		System.out.println("데이터 입력:");
		InputStream is = System.in;
		InputStreamReader reader = null;
		BufferedReader buffer = null;
		 try {
			//필터 사용 : byte -> char로 변경
			 reader = new InputStreamReader(is);
			 
			//필터 사용2 : 한 줄(line) 읽기
			buffer = new BufferedReader(reader);
			String mesg = buffer.readLine();
			System.out.println(mesg); //표준출력
			//PrintStream xxx = System.out;
			//xxx.println("ASDFS");
			 
			 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				buffer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		 
		 
		
	}// end main

}// end class
