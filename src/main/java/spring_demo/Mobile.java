package spring_demo;

public class Mobile {
      private String brand;
      private double price;
      private int ram;
     
      private Sim sim;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	

	public Sim getSim() {
		return sim;
	}

	public void setSim(Sim sim) {
		this.sim = sim;
	}

	@Override
	public String toString() {
		return "Mobile [brand=" + brand + ", price=" + price + ", ram=" + ram + ", sim=" + sim + "]";
	}

	
      
      
      
}
