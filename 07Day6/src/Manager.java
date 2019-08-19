
public class Manager extends Employee {

	String depart; //관리부서
	public Manager() {
		// Employee의 생성자가 호출됨
		super("A","b","c");//부모의 기본생성자호출
		System.out.println("Manager생성자");
	}
	public String getDepart() {
		return depart;
	}

	public void setDepart(String depart) {
		this.depart = depart;
	}
	
}
