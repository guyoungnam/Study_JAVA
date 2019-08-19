import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest2 {

	public static void main(String[] args) throws Exception {

		//날짜 데이터
		// 1. java.util.data
		Date d = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH:mm:ss");
		// Date -- > String
		String mesg = sdf.format(d);
		System.out.println(mesg);
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy년 MM월 dd일");
		//String ---> Date
		Date d2 = sdf2.parse("2020년 10월 16일");
		System.out.println(d2);
		

	}

}
