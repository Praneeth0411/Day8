
public class Car {
   
	String Name;
	String Model;
	int year;
	int Price;
	int milage;
	public Car(String name, String model, int year, int price, int milage) {
		super();
		Name = name;
		Model = model;
		this.year = year;
		Price = price;
		this.milage = milage;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getModel() {
		return Model;
	}
	public void setModel(String model) {
		Model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	public int getMilage() {
		return milage;
	}
	public void setMilage(int milage) {
		this.milage = milage;
	}
	@Override
	public String toString() {
		return "Car [Name=" + Name + ", Model=" + Model + ", year=" + year + ", Price=" + Price + ", milage=" + milage
				+ "]";
	}
	
	
	
	
}
