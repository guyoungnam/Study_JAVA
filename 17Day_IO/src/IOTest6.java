import java.io.File;

public class IOTest6 {

	public static void main(String[] args) {
		
		// 파일 입력/출력
		// 파일의 메타데이터 살펴보기
		// new File("디렉토리");
		// new File("파일명");
		// new File("디렉토리/파일명");
		// new File("디렉토리", "파일명");
		
		File f = new File("C:\\"); 
		
		String[] s = f.list();
		for (String string : s) {
			System.out.println(string);
		}
		
		//새로운 디렉토리
		File f2 = new File("C:\\bbb"); 
		f2.mkdir();
		f2.delete(); // 파일 및 디렉토리 삭제
	
		 
		
	}// end main

}// end class
