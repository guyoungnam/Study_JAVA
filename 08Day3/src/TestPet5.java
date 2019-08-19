
public class TestPet5 {

	public static void main(String[] args) {


		Pet [] c = {new Cat("야옹이", 3, "암놈"),
				    new Cat("야옹이", 3, "암놈"),
	                new Dog("누렁이", 8, "암놈", "검정"),	
		};           
		
		for (Pet x:c) {
		// 타입 체크 instanceof 연산자
			if(x instanceof Pet) {
				System.out.println("Pet");
		}else if(x instanceof Dog) {
			System.out.println("Dog");
		}else if (x instanceof Pet) {
			System.out.println("Pet");
		}
		
		

	}
	}}

