package ch12;

public class Person {

	String name;
	int age;
	
	public Person() {
//		int age = 10; /이 생성자가 완전하지 않으므로 생성자 이전에는 쓸수 없음.
		this("이름없음", 1);
		int age = 10; //이후에 쓰는것은 가능함.
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void showPerson() {
		System.out.println(name + ", "+age);
	}
	
	public Person getperson() {
		return this; //자기 자신의 인스턴스 메모리를 가르킴.
	}
	
	
	public static void main(String[] args) {
		Person person = new Person();
		person.showPerson();
		
		System.out.println(person); //참조 값을 출력
	
		Person person2 = person.getperson();
		System.out.println(person2);
		
	}
}
