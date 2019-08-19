
public class HelloTest3 {

	public static void main(String[] args) {
		
		// 이름은 홍길동,나이는 10 , 키는 185.54 ,성별 남  , 결혼?
		
		System.out.printf("이름은 %s  , 나이는 %10d 키는 %3.3f , 성별 %c  ,결혼? %b\n",
				"홍길동",987456, 185.5498745, '남', true);
		System.out.printf("이름은 %s  , 나이는 %10d 키는 %3.4f , 성별 %c  ,결혼? %b",
				"홍길동",987456, 185.5498745, '남', true);
	}

}
