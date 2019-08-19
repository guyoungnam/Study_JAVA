
public class Cat extends Pet {

	private String gender;
	
	
	//이전에는 오버라이딩
	
	
	

	public Cat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cat(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	public Cat(String name, int age, String gender) {
		super(name, age);
		this.gender = gender;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Cat [gender=" + gender + ", getGender()=" + getGender() + ", getName()=" + getName() + ", getAge()="
				+ getAge() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	@Override
	public void cry() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eat() {
		System.out.println("생선먹기");
		
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		
	}


	
	
	
}
