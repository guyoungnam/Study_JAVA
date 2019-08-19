// 상수: final ==> public static final

class Color{
	public static final int RED=10;
	public static final int BLUE=20;
	public static final int YELLOW=30;
	public static final int GREEN=40;
}

public class TestMain {
	public static void main(String[] args) {
		System.out.println(Color.RED);
		System.out.println(Color.BLUE);
		System.out.println(Color.YELLOW);
		System.out.println(Color.GREEN);
	}//end main
}//end class
