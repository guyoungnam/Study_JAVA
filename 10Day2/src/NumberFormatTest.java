import java.text.NumberFormat;

public class NumberFormatTest {

	public static void main(String[] args) {
	
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		String mesg = nf.format(912399412);
		System.out.println(mesg);

	}

}
