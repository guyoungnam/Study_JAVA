
public class EnumTest4 {

	//상수
    public enum DML { SELECT, INSERT, DELETE}
	
	
	public static void check(DML num) {
		//switch 들어갈수 있는 6가지 byte, short,int, char, string, enum
		
		switch(num) {
		case SELECT: System.out.println("SELECT"); break;
		case INSERT: System.out.println("INSERT"); break;
		case DELETE: System.out.println("DELETE"); break;
		default: System.out.println("default"); break;
		
		}
	}
	
	public static void main(String[] args) {

		//enum는 상수 대체 가능
		
		check(DML.SELECT);   //1.SELECT 2.INSERT 3.DELETE
		check(DML.INSERT);
		check(DML.DELETE);
		
		
		
	}

}
