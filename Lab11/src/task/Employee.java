package task;

public class Employee extends Person{
	
	private String department;
	private String designation;
	public Employee(String name, int age, String address, String department, String designation) {
		super(name, age, address);
		this.department = department;
		this.designation = designation;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	public String printEmployee() {
		String s1;
		s1 = String.format("Name: %s\nAge: %d\nAddress: %s\nDepartment: %s\nDesignation: %s\n",this.getName(),this.getAge(),this.getAddress(),this.department,this.designation);
		return s1;
	}
	
	
}
