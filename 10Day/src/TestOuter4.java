
public class TestOuter4 {

	public static void main(String[] args) {

		
		//익명클래스(anonymous class) ==> 인터페이스 사용시 많이 사용.
		
		//1. 일반적인 방법 ==> 이름있는 클래스로 처리
		
		Flyer b = new Bird();
		b.takeOff();
		
		//2. 익명클래스 ==> superman 기능을하는 클래스
		
	    // 문법 인터페이스명 변수명 = new 인터페이스명() {메서드 오버라이딩};
		
		Flyer b2 = new Flyer() {

			@Override
			public void takeOff() {
				System.out.println("superman");
			}
				
			};
		
		b.takeOff();
       Flyer b3 = new Flyer() {
    	  public void takeOff() {
    		  System.out.println("airplane.takoff");
    	  }
       };
       b3.takeOff();
	}
}

	

