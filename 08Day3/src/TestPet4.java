
public class TestPet4 {

	public static void main(String[] args) {


		Pet [] c = {new Cat("야옹이", 3, "암놈"),
				    new Cat("야옹이", 3, "암놈"),
	                new Dog("누렁이", 8, "암놈", "검정"),	
		};           
		
		for (Pet x:c) {
		// 타입 체크 instanceof 연산자
			if(x instanceof Cat) {
				System.out.println(x);
		}
		
		

	}
	}}

