
public class TestOuter {

	public static void main(String[] args) {

		
		Outer outer = new Outer();
		outer.innercreate();

		
		//2. outer 밖에서 inner 생성 ==> 반드시 outer 부터 생성 한다.
		
		Outer outer2 = new Outer();
		outer2.n = 10;
		Outer.Inner inner = outer2.new Inner();
		inner.info();
	}

}
