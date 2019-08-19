
@FunctionalInterface
interface Flyer3{
	public abstract String fly();
}

public class RamdaTest3 {

	public static void main(String[] args) {
		
		
		// 1. 익명클래스
		Flyer3 f = new Flyer3() {
			
			@Override
			public String fly() {
				System.out.println("fly");
				return "홍길동";
			}
		};
		System.out.println(f.fly());
		
		// 2. 람다
		Flyer3 f2 = ()-> {System.out.println("fly");return "홍길동";};
		System.out.println(f2.fly());
		
		Flyer3 f3 = ()-> {return "홍길동";};
		System.out.println(f3.fly());
		
		Flyer3 f4 = ()-> "홍길동4";
		System.out.println(f4.fly());
		
		//파라미터 없고 리턴값 있는 형태

	}

}
