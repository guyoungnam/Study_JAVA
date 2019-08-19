
public class Manger extends Employee {

	String depart;

	public Manger() {};
	
	public Manger(String ssn, String name, String address, String depart) {
		super(ssn,name,address); //명시적으로 super 초기화하기 위해
		this.depart=depart;
	}

	public String getDepart() {
		return depart;
	}

	public void setDepart(String depart) {
		this.depart = depart;
	}
	
	
	
}
