import java.util.Properties;
import java.util.Set;

public class MapTest9 {

	public static void main(String[] args) {


		
		Properties props = System.getProperties();
		
		Set<String> keys = props.stringPropertyNames();
		for (String key : keys) {
			System.out.println(key+"="+ props.getProperty(key));
		}
}
}