import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class IOTest9 {

	public static void main(String[] args) {
		
		
		File readFile = new File("C:\\Users\\acorn\\a.jpg");
		File writeFile = new File("C:\\Users\\acorn\\b.jpg");
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream(readFile);
			fos = new FileOutputStream(writeFile);
			
			int size =(int)readFile.length(); // int로 형변환
			byte [] b = new byte[size]; //size 변수를 배열에 넣음
			fis.read(b); //b 변수를 read에 읽어옴
			fos.write(b);
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(fis!=null)fis.close();
				if(fos!=null)fos.close();
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
	

	
		 
		
	}// end main

}// end class
