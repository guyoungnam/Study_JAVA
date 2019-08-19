
public class EnumTest2 {

	//상수
	public static final int SELECT=1;
	public static final int INSERT=2;
	public static final int DELETE=3;
	
	
	public static void check(int num) {
		//switch 들어갈수 있는 6가지 byte, short,
		
		switch(num) {
		case SELECT: System.out.println("1"); break;
		case INSERT: System.out.println("2"); break;
		case DELETE: System.out.println("3"); break;
		default: System.out.println("default"); break;
		
		}
	}
	
	public static void main(String[] args) {

		//enum는 상수 대체 가능
		
		check(SELECT);   //1.SELECT 2.INSERT 3.DELETE
		check(INSERT);
		check(DELETE);
		
		
		
	}

}
