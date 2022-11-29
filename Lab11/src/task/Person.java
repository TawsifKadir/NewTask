package task;

public class Person {
	private String name;
	private int age;
	private String address;
	
	public Person(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String printPerson() {
		String s1;
		s1 = String.format("Name: %s\nAge: %d\nAddress: %s\n",this.name,this.age,this.address);
		return s1;
	}
	
	
}
