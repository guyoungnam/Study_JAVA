
public class TestPet {

	public static void main(String[] args) {

		//고양이 2마리, 강아지 1마리, 물고기 1마리
		
		Pet c = new Cat("야옹이", 3, "암놈");
		//System.out.println(c.xxx);
		
		System.out.println(c.toString()); //toString()
		 c = new Dog("누렁이", 8,"암놈", "검정");
		System.out.println(c.toString());
	

		               
		//동적 바인딩(dynamic binding)
		// : 컴파일때 와 실행할때의 자바가 인지하는 메서드가 다르다.
		
		

	}

}
