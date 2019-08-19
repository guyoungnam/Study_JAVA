
// 현실세계의 학생객체에서 뽑은 학생클래스
public class Student {

	// 인스턴스변수?
	private String name;
	private int age;
	private String address;

	// name변수에 값을 저장(setting)하는 역할 메서드
	// setName
	public void setName(String n) {
		this.name = n;
	}

	public void setAge(int n) {
		//검증작업추가가능
		if(n<100) {
			this.age = n;
		}else {
			System.out.println("논리적 예외발생");
		}
	}
	
	public void setAddress(String n) {
		address = n;
	}
	
	// name값을 반환(get)하는 역할 메서드
	// getName
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	public String getAddress() {
		return address;
	}

	// 메서드
//    - 호출해야 실행
//    - 실행끝나면 호출한곳으로 돌아온다.
//    -호출시 값을 전달 가능하고(파라미터 값)
//     돌아올 때 값을 가지고 반환가능(리턴값)
//    - 기능에 따라서 2가지 종류
//    가) setter 메서드: 리턴값 없는 형태,파라미터값 존재
//    나) getter 메서드: 리턴값 있는 형태,파라미터값 없는 형태

//    function 함수명(변수,변수) {
//    	문장
//    	return [값];
//    }
//    함수명(값,값)
//    
//    public 리턴타입 메서드명(변수,변수) {
//    	문장
//    	return [값];
//    }
//    메서드명(값,값)
}
