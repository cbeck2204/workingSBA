package pleaseWork;

public class Ford extends Car{

	// fields
	// private fields protects value when code runs
	private int year;
	private int manufacturerDiscount;
	
	// constructors
	public Ford(int speed, double regularPrice, String color, int year, int manufacturerDiscount) {
		super(speed, regularPrice, color);
		this.year = year;
		this.manufacturerDiscount = manufacturerDiscount;
	}
	
	// methods
	public double getSalePrice() {
		return super.getSalePrice() - manufacturerDiscount;
	}
	
	// getters & setters
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getManufacturerDiscount() {
		return manufacturerDiscount;
	}
	public void setManufacturerDiscount(int manufacturerDiscount) {
		this.manufacturerDiscount = manufacturerDiscount;
	}
	
} // class
