
public class Sample02_variable5_1 {

	public static void main(String[] args) {
		
		//자바는 블럭 scope ( 자바스크립트는 함수scope)
		{
			int num=10;
			System.out.println(num);
		}
		//System.out.println(num); //블럭밖에서 인식불가
		{
			int num=20;			
			System.out.println(num);
		}
		
		
	}

}
