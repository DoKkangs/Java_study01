package ch13;

public class Bus {

	int busNumber;
	int money;
	int passengerCount;
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showBusInfo() {
		System.out.println(busNumber+"버스의 승객 수는 "+passengerCount+"명 이고, 수입은 "+money+"원 입니다.");
	}
}
