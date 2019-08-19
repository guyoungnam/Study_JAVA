
public class StringBuiderTest {

	public static void main(String[] args) {
	
		
		// *문자열 생성 방법
		// 1. String 클래스 
		// : 한번 생성된 문자열은 변경 안됨. 가공하면 매번 새로운 문자열생성
		// 가) new String("hello")-heap 메모리에(new할때마다) ,  "hello" - method area 저장 (1번만들어짐)
		// 2. StringBuffer 또는 StringBuilder 클래스
        // : 한번 생성된 문자열이 변경됨
		// : new 이용 방법 밖에 없다
	
	StringBuilder builder = new StringBuilder("Hello");
	int x = builder.charAt(0);
	System.out.println(x);
    System.out.println(builder.indexOf("o"));
    System.out.println(builder.length());
    System.out.println(builder.replace(0, 3, "x"));
    System.out.println(builder.substring(1));
    System.out.println(builder.substring(0, 3));
    
    String xxx = builder.toString();
    
    builder.append("AAA");
    builder.append("bbb");
    System.out.println(builder);
    
    builder.insert(0, "kkkk");
    System.out.println(builder);
    
    builder.delete(0, 5);
    System.out.println(builder);
    
    builder.reverse();
    System.out.println(builder);
    
    
    //메서드 체인
    builder.append(" !!!").insert(0,  " xxx").delete(0,4);
    System.out.println(builder);
    
    builder.append(" !!!").append(" !!!").append(" !!!");
    
    
	}

}
