import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleUnaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

class Pet{
	private String name;
	private int age;
	public Pet(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Pet [name=" + name + ", age=" + age + "]";
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
	
	
	
}//end class

public class OperatorTest2 {

	public static void main(String[] args) {
		/*
		 *   Operator
		 *   
		 *   -파라미터 있고  리턴값 있음
		 *   -주로 연산에 사용됨
		 *   -입력 및 반환타입이 모두 동일
		 * 
		 */
		// 익명클래스
		Comparator<Pet> y = new Comparator<Pet>() {
			int num = 0; 
			@Override
			public int compare(Pet o1, Pet o2) {
				if(o1.getAge() > o2.getAge()) {
					num= -1;  //0
				}
				return num ;
			}
		};
		Comparator<Pet> y2 = new Comparator<Pet>() {
			
			@Override
			public int compare(Pet o1, Pet o2) {
					return Integer.compare(o1.getAge(), o2.getAge()) ;
			}
		};
		
		Comparator<Pet> y3 = (o1,o2)->Integer.compare(o1.getAge(), o2.getAge());
		
		BinaryOperator<Pet> x = BinaryOperator.maxBy(y3);
		BinaryOperator<Pet> x2 = 
		BinaryOperator.minBy((o1,o2)->Integer.compare(o1.getAge(), o2.getAge()));
		
		Pet maxAge = x.apply(new Pet("강아지",5), new Pet("고양이",3));
		System.out.println("maxage:"+maxAge);
		Pet minAge = x2.apply(new Pet("강아지",5), new Pet("고양이",3));
		System.out.println("minAge:"+minAge);
		
		
	}//end main
}//end class


