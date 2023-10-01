package ch08;

public class PersonTest {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.age=37;
		p1.gender="남성";
		p1.height = 180;
		p1.weight = 78;
		p1.name = "Tomas";
		
		p1.showPersonInfo();
		
		Person p2 = new Person(160,42,"이지현",26,"여성");
		p2.showPersonInfo();
	}
}
