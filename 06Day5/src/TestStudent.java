
public class TestStudent {

	public static void main(String[] args) {

		//추가기능 ==> 메서드
		
		Student stu = new Student("홍길동",10,"서울1");		
        StudentUtil util = new StudentUtil();
		String name = stu.getName();
		System.out.println(util.firstName(name)+"\t"+util.nameLength(name));
        
        Student stu2 = new Student("이순신",40,"경기");
		

	
}
}