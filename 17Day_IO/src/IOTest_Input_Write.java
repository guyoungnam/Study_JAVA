import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class IOTest_Input_Write {

	public static void main(String[] args) {
		
		
		//파일출력
		
	
		// write는 없으면 자동생성된다.
		File f = new File("C:\\Users\\acorn\\xyz.txt"); 
		PrintWriter out = null;
		
		//데이터 쓰기 : FileeWriter, FileOutputStream
		try {
			FileWriter writer = new FileWriter(f,true);
			//필터
		     out = new PrintWriter(writer);
			out.print("happy");
			//out.flush();  //buffer 지우기 연결이 유지하는상태
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			out.close();
		}
	

	
		 
		
	}// end main

}// end class
