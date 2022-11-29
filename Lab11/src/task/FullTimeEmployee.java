package task;

public class FullTimeEmployee extends Employee{
	
	private double basic;
	private double allowance;
	
	
	public double getBasic() {
		return basic;
	}


	public void setBasic(double basic) {
		this.basic = basic;
	}


	public double getAllowance() {
		return allowance;
	}


	public void setAllowance(double allowance) {
		this.allowance = allowance;
	}


	public FullTimeEmployee(String name, int age, String address, String department, String designation, double basic,
			double allowance) {
		super(name, age, address, department, designation);
		this.basic = basic;
		this.allowance = allowance;
	}
	
	public double salary() {
		return basic + (basic *allowance / 100);
	}

	@Override
	public String toString() {
		
		String s1;
		s1 = String.format("Name: %s\nAge: %d\nAddress: %s\nDepartment: %s\nDesignation: %s\nSalary: %.2f\n",this.getName(),this.getAge(),this.getAddress(),this.getDepartment(),this.getDesignation(),this.salary());
		return s1;
	}
}
