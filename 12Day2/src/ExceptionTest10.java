import java.io.IOException;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;

class A{
	public void a() throws ArithmeticException{}
	public void b()
	             throws ArithmeticException, NullPointerException {}
	
	public void c()
	            throws IOException{}


}

class B extends A{
	@Override
	public void a() {}
	
	//RuntimeException
	public void b() throws ClassCastException{}
	//public void c() throws SQLException{}
}

// 오바리이딩, exception 은 작거나 같게


public class ExceptionTest10 {
	

	public static void main(String[] args) {
	
		
	
	}

}
