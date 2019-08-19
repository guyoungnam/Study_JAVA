import java.util.Scanner;

public class ForTest {

	public static void main(String[] args) {

	
		//1. for문
		for(int i=0;i<5; i++) {
			for(int j=0; j<4;j++) {
				System.out.println(i+"\t"+j);
			}
		}//end for
		
		
		for(int i=0;i<5; i+=2) {
			System.out.println("hello "+i);
		}//end for
		
		int i=0,j=0;
		for(i=0,j=0;i<5 && j<3;i++,j++) {
			System.out.println("happy "+i);
		}//end for
		System.out.println(i);
		
		
		for(int i2=10;i2>0;i2--) {
			System.out.println("world "+i2);
		}//end for
		
		
		for(int i3=0;i3<5;i3++) {
			System.out.println("hello "+i3);
		}//end for
		
	}//end main
}//end class
