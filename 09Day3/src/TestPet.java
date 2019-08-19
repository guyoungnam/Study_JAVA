
public class TestPet {

	public static void main(String[] args) {

		
		Cat c = new Cat("나비", 3, "암컷");
		System.out.println(c);
		c.cry();
		c.eat();
		c.sleep();
		
		Dog d = new Dog("하루", 2, "수컷");
		d.cry();
		d.eat();
		d.sleep();
	}

}
