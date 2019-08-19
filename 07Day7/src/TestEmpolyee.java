
public class TestEmpolyee {

	public static void main(String[] args) {

           Manger m = new Manger();
           Manger m2 = new Manger("A01", "홍길동", "서울", "개발");

           
           System.out.println(m2.getSsn());
           System.out.println(m2.getName());
           System.out.println(m2.getAddress());
           System.out.println(m2.getDepart());
	}

}
