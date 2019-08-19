
public class TestStudent {

	public static void main(String[] args) {

		Student stu = new Student();
		Student stu2 = new Student();
		
		// 호출시 반드시 3개가 일치해야 된다.
		// 1)갯수 2) 타입 3)순서==> 인자 리스트(argument list)
		stu.setStudent("홍길동", 20, "서울");
//		stu.setNameAgeAddress("홍길동", 20);
//		stu.setNameAgeAddress("홍길동",  "서울" ,20);
//		stu.setNameAgeAddress("홍길동",  "서울" ,"20");


	}

}
