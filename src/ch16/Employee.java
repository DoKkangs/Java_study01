package ch16;

public class Employee {

	private static int serialNum = 1000;
	
	private int employeeId;
	private String employeeName;
	private String department;
	
	public Employee() {
		
		serialNum++;
		employeeId = serialNum;
	}
	
	public static int getSerialNum() {
//		int i = 0; 			//지역 변수는 사용 가능
//		employeeId = 1234;  //멤버 변수는 사용 불가능.
//		serialNum = 1000; 	//static변수는 사용 가능
		return serialNum;
	}

	public int getEmployeeId() {
		return employeeId;
		
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	
}
