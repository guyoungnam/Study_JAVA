import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;

import javax.print.attribute.standard.PrinterState;

public class IOTest8_Write2 {

	public static void main(String[] args) {
		
		
		
		// write는 없으면 자동생성된다.
		File f = new File("C:\\Users\\acorn\\xyz.txt");
		
		//데이터 쓰기:  FileWriter, FileOutputStream
		FileOutputStream fos = null;
		try {
			 fos = new FileOutputStream(f);
			String mesg ="world";
			// String --> byte[]
			byte []b = mesg.getBytes();
			fos.write(b);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
        
	}//end main
}//end class





