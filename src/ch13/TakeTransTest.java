package ch13;

public class TakeTransTest {

	public static void main(String[] args) {
		
		Student student1 = new Student("James",5000);
		Student student2 = new Student("Tomas", 10000);
		
		Bus bus100 = new Bus(100);
		Bus bus500 = new Bus(500);
		Subway greenSubway = new Subway(2);
		Subway blueSubway = new Subway(1);
		
		student1.takeBus(bus100);
		student1.takeSubway(blueSubway);
		
		student2.takeBus(bus500);
		student2.takeSubway(greenSubway);
		
		student1.showInfo();
		student2.showInfo();
		
		bus100.showBusInfo();
		bus500.showBusInfo();
		greenSubway.showSubwayInfo();
		blueSubway.showSubwayInfo();
	}
}
