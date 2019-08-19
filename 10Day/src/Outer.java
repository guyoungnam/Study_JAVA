
public class Outer {

	//멤버 변수
	
	public int n = 10;
	protected int n2 = 20;
	int n3 = 30;
	private int n4 = 40;
	static int n5 = 50;
	
	//멤버 메서드
	public void x() {}
	
	//멤버 inner 클래스
	class Inner{
		int k = 10;
		static final int NUM = 20;  //상수는 가능
	//	static int k2 = 20;
	public void info() {
		System.out.println(n);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(n4); // private도 접근 가능
		System.out.println(n5);
		System.out.println(k);
		System.out.println(NUM);
		
	}
} // end inner
  // 1.Outer 에서 Inner 생성
   public void innercreate() {
	   Inner i = new Inner();
	   i.info();
   }
}