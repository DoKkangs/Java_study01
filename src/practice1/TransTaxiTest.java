package practice1;

public class TransTaxiTest {

	public static void main(String[] args) {
		
		Student studentE = new Student("Edward", 20000);
		Taxi taxiZ = new Taxi("잘 나간다 운수");
		
		studentE.takeTaxi(taxiZ);
		
		studentE.showInfo();
		taxiZ.showTaxiInfo();
	}
}
