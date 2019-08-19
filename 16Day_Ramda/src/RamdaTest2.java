
@FunctionalInterface
interface Flyer2{
	public abstract void fly(int x);
}

public class RamdaTest2 {

	public static void main(String[] args) {
		
		
		// 1. 익명클래스
		Flyer2 f = new Flyer2() {
			
			@Override
			public void fly(int x) {
				System.out.println("fly"+x);
			}
		};
		f.fly(100);
		
		// 2. 람다
		Flyer2 f2 = (int x)-> {System.out.println("fly"+x);};
		f2.fly(100);
		
		Flyer2 f3 = (x)-> {System.out.println("fly"+x);};
		f2.fly(100);
		
		Flyer2 f4 = x-> {System.out.println("fly"+x);};
		f2.fly(100);
		
		Flyer2 f5 = x-> System.out.println("fly"+x);
		f2.fly(100);
		
		// 파라미터 없고, return 값없는 형태

	}

}
