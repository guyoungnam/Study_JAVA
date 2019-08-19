import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class IOTest7_read {

	public static void main(String[] args) {
		
	
		
		File f = new File("C:\\IOTest.java"); 
		
	//파일 읽기 : FileReader, FileInputStream
		BufferedReader buffer = null;
		
		try {
			FileReader reader= new FileReader(f);
			buffer = new BufferedReader(reader);
			String data = buffer.readLine();
			while(data !=null) {
				System.out.println(data);
				data = buffer.readLine();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				buffer.close();
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
	
		 
		
	}// end main

}// end class
