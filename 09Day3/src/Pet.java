
public abstract class Pet {

	private String name;
	private int Age;
	
	
	//기능
	public abstract void cry();
	public abstract void eat();
	public abstract void sleep();
	
	
	
	public Pet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pet(String name, int age) {
		super();
		this.name = name;
		Age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}
	
	
	
}
