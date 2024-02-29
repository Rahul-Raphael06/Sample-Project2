package spring_demo;

public class Laptop {
	  private String brand;
      private double price;
      private int ram;
	public Laptop(String brand, double price, int ram) {
		super();
		this.brand = brand;
		this.price = price;
		this.ram = ram;
	}
	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", price=" + price + ", ram=" + ram + "]";
	}
	
      
      
}


