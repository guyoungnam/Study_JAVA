import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassforName {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Class<?> c= Class.forName("java.lang.String");
		
		//메타데이터 ==> 리플렉션(reflection)
		
		Field[] fields =c.getDeclaredFields();
		for (Field f: fields) {
			System.out.println("fied:"+f.getName());
		}
		Method[] methods =c.getDeclaredMethods();
		for (Method m : methods) {
			System.out.println("method:"+ m.getName());
		}

	}

}
