
public class Student {

	// 인스턴스변수?
	private String name;
	private int age;
	private String address;
	// 오버로딩(overloading)
	// 정의? 하나의 클래스내에서 동일한 이름의 메서드가 여러개 지정가능
	//  단, 인자 리스트는반드시 달라야 한다.
	// 목적?재사용
	// 대표적?  print(),println()
	public void setStudent(String n,String a) {
		name =n;
		address=a;
	}
	public void setStudent(String n,int a) {
		age =a;
	}
//	public int setStudent(String n,int a) {
//		age =a;
//		return 100;
//	}
	public void setStudent(String n,int a, String addr) {
		name = n;
		age =a;
		address = addr;
	}
	
	public  String getInfo() {
		
		return name+"\t"+age+"\t"+address;
	}
	
}
