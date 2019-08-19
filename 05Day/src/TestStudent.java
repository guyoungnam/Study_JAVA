
public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		클래스명 변수명 = new 클래스명();
		Student stu = new Student();
		Student stu2 = new Student();
		Student stu3 = new Student();
		
		stu.name ="홍길동";
		stu.age = 20;
		stu.address ="서울";
		
		stu2.name ="이순신";
		stu2.age = 44;
		stu2.address ="전라";
		
		stu3.name ="유관순";
		stu3.age = 19;
		stu3.address ="경기";
		
		System.out.println(stu.name);
		System.out.println(stu.age);
		System.out.println(stu.address);
		System.out.println(stu2.name);
		System.out.println(stu2.age);
		System.out.println(stu2.address);
		System.out.println(stu3.name);
		System.out.println(stu3.age);
		System.out.println(stu3.address);
	}

}
