import java.util.function.BooleanSupplier;
import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.LongSupplier;

public class SupplierTest2 {

	public static void main(String[] args) {
	
	
		/*
		 * Supplier 인터페이스
		 * -파라미터 없고 리턴 있는 기능필요시 사용한다.
		 * 
		 */

		int n = 10;
		int n2 = 20;
		
		
	LongSupplier x = ()->n+n2;
	Long xx = x.getAsLong();
	System.out.println(xx);
	
	IntSupplier y = ()->n*n2;
	int yy = y.getAsInt();
	System.out.println(yy);
	
	DoubleSupplier z = ()->n*n2;
	double zz = z.getAsDouble();
	System.out.println(zz);
	
	BooleanSupplier k = ()->n%2==0;
	Boolean kk = k.getAsBoolean();
	System.out.println(kk);	
	
	
	}// end main

}// end class
