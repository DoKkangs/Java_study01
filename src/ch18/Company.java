package ch18;

public class Company {
	//싱글톤 패턴 - 인스턴스가 하나만 생성되어야 하는 경우 사용하는 디자인 패턴

	private static Company instance = new Company();  //유일한 인스턴스 이므로 static으로 선언
	
	private Company() {} //외부에서 인스턴스를 막 생성하지 못하도록 생성자는 private로 선언
	
	
	//일반 메서드일 경우에는 인스턴스를 생성하고 메서드를 사용할수있음 그러므로 클래스 이름으로 바로 참조할수있게 static으로 생성
	public static Company getInstance() {  //유일한 인스턴스에 접근가능한 메서드를 만듬
		if( instance == null ) {
			instance = new Company();
		}
		return instance;
	}
	
	
	
}
