
public class TestPet {

	public static void main(String[] args) {

		//고양이 2마리, 강아지 1마리, 물고기 1마리
		
		Cat c = new Cat("야옹이", 3, "암놈");
		Cat c2 = new Cat("하늘이", 1, "숫놈");
		
		Dog d = new Dog("누렁이", 8,"암놈", "검정");
		
		Fish f = new Fish("골드", 1, 163.3);
		
		System.out.println(c.getName()+"\t"+c.getAge()+"\t"+c.getGener());
                       c.eat();
                       c.cry();
                       c.sleep();
		
		System.out.println(c2.getName()+"\t"+c2.getAge()+"\t"+c2.getGener());
		               c2.eat();
		               c2.cry();
		               c2.sleep();
		               
		System.out.println(d.getName()+"\t"+d.getAge()+"\t"+d.getGender()+"\t"+d.getColor());
		               d.eat();
		               d.cry();
		               d.sleep();
		               d.runDog();
		               
		System.out.println(f.getName()+ f.getAge()+f.getTailSize());               
		               f.swimFish();
		
		

	}

}
