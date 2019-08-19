
public class Cat extends Pet {


	private String gender;
	
	//동작
	
  
	
	
	public Cat(String name, int age, String gener) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gener;
				
	}

	@Override
	public void cry() {
     System.out.println("야옹이");
	}

	@Override
	public void eat() {
      System.out.println("생선 먹기");
	}

	@Override
	public void sleep() {
	   System.out.println("새근새근");
	}

	public String getGener() {
		return gender;
	}


	public void setGener(String gener) {
		this.gender = gener;
	}
	
	
	
}
