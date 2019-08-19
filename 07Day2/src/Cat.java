
public class Cat extends Pet {


	private String gender;
	
	//동작
	
	public void cryCat() {
		System.out.println("야옹~");
	}
	
	public void eatCat() {
		System.out.println("생선 먹기");
	}
	
	public void sleepCat() {
		System.out.println("새근새근~");
	}
	
	
	public Cat(String name, int age, String gener) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gener;
				
	}

	public String getGener() {
		return gender;
	}


	public void setGener(String gener) {
		this.gender = gener;
	}
	
	
	
}
