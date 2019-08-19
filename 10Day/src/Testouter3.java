
public class Testouter3 {

	public static void main(String[] args) {
	
		//static inner 클래스는 outer3 클래스영역으로 접근
		
		Outer3.inner i = new Outer3.inner();
		i.info();

	}

}
