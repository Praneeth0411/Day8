
public class Person {
	
	String name;
	String aadhar;
	String address;
	public Person(String name, String aadhar, String address) {
		super();
		this.name = name;
		this.aadhar = aadhar;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", aadhar=" + aadhar + ", address=" + address + "]";
	}
	
	
	
	
	
}