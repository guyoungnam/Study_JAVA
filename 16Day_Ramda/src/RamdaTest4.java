
@FunctionalInterface
interface Flyer4{
	public abstract String fly(int n,int n2);
}

public class RamdaTest4 {

	public static void main(String[] args) {
		
		
		// 1. 익명클래스
		Flyer4 f = new Flyer4() {
			
			@Override
			public String fly(int n, int n2) {
				System.out.println("fly"+n+n2);
				return "홍길동"+n+n2;
			}
		};
		System.out.println(f.fly(10,20));
		
		// 2. 람다
		Flyer4 f2 = (int n, int n2)-> {System.out.println("fly");return n+"\t"+n2;};
		System.out.println(f2.fly(10,20));
		
		Flyer4 f4 = (n,n2)-> {System.out.println("fly");return n+"\t"+n2;};
		System.out.println(f2.fly(10,20));
		
		Flyer4 f5 = (n,n2)->  n+"\t"+n2;
		System.out.println(f2.fly(10,20));
		
		
		//파라미터 두개 있고 리턴값 있는 형태
		

		
		

	}

}
