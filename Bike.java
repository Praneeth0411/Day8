
public class Bike {

	
	String Brand;
	String Model;
	String Name;
	int Year;
	int Price;
	public Bike(String brand, String model, String name, int year, int price) {
		super();
		Brand = brand;
		Model = model;
		Name = name;
		Year = year;
		Price = price;
	}
	@Override
	public String toString() {
		return "Bike [Brand=" + Brand + ", Model=" + Model + ", Name=" + Name + ", Year=" + Year + ", Price=" + Price
				+ "]";
	}
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	public String getModel() {
		return Model;
	}
	public void setModel(String model) {
		Model = model;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getYear() {
		return Year;
	}
	public void setYear(int year) {
		Year = year;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	
}
