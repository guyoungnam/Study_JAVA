


public class Student {

	
	private String name;
	private int age;
	private String address;
	
	
	//
	public char firstName() {
		return name.charAt(0);
	}
	
	public int nameLength() {
		return name.length();
	}

    public Student() {

	}

	public Student(String name, int age, String address) {

		this.name = name;
		this.age = age;
		this.address = address;
	}

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Student(int age, String address) {
		this.age = age;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
     
 }