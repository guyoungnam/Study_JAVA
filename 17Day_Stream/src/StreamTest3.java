import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest3 {
	
	public static void main(String[] args) {
		
		//파일읽기
		File f = new File("C:\\Users\\acorn\\IOTest.java");
		
		BufferedReader buffer = null;
		try {
			buffer = new BufferedReader(new FileReader(f));
			Stream<String> st = buffer.lines();
			st.forEach(n->System.out.println(n));
		
		
	}catch(IOException e) {
	}finally {
		try {
			buffer.close();
		}catch(IOException e) {
			e.printStackTrace();
		}

		

	}
	}
}

