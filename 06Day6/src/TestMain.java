
public class TestMain {
    //인스턴스 메서드 (멤버메서드)
	public void a(int n ) {}
	public void a(int n, int n2 ) {}
	public void a(int n, int n2, int n3 ) {}
	public void a(int n, int n2, int n3, int n4 ) {}
	public void a(int n, int n2, int n3, int n4, int n5) {}
	
	
	//가변인자
	public void a(int ... n) {
		for(int x : n ) {
			System.out.println(x);
		}
	
	}
	
    public static void b() {}
	// static 메서드
	public static void main(String[] args) {
          TestMain m = new TestMain();
          m.a(10);
          m.a(10,20);
          m.a(10,9,8);
          m.a(1,2,3,4,5);
          
          b();
          

}
}