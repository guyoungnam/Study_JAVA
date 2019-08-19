
@FunctionalInterface
interface Flyer{
	public abstract void fly();
}

public class RamdaTest {

	public static void main(String[] args) {
		
		
		// 1. 익명클래스
		Flyer f = new Flyer() {
			
			@Override
			public void fly() {
				System.out.println("fly");
			}
		};
		f.fly();
		
		// 2. 람다
		Flyer f2 = ()-> {System.out.println("fly");};
		f2.fly();
		
		Flyer f3 = ()-> {System.out.println("fly");};
		f3.fly();
		
		// 파라미터 없고, return 값없는 형태

	}

}
