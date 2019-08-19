
public interface A {

	final int NUM = 10; //public static final이 자동으로 붙는다
	
	public abstract void a();
	public void b(); //자동으로 public abstract 지정된다
	
	public default void c() {
		System.out.println("c");
	}
	public static void d() {
		System.out.println("d");
	}
	// public  void e(); {} //일반메서드 불가
	
	
}
