package task;

public class PartTimeEmployee extends Employee{
	private double hours;
	private double rate;
	public PartTimeEmployee(String name, int age, String address, String department, String designation, double hours,
			double rate) {
		super(name, age, address, department, designation);
		this.hours = hours;
		this.rate = rate;
	}
	public double getHours() {
		return hours;
	}
	public void setHours(double hours) {
		this.hours = hours;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	
	public double salary() {
		return rate*hours;
	}
	
	@Override
	public String toString() {
		String s1;
		s1 = String.format("Name: %s\nAge: %d\nAddress: %s\nDepartment: %s\nDesignation: %s\nSalary: %.2f\n",this.getName(),this.getAge(),this.getAddress(),this.getDepartment(),this.getDesignation(),this.salary());
		return s1;
	}
}
