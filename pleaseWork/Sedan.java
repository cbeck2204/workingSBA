package pleaseWork;

public class Sedan extends Car {

	// fields
	// private fields protects value when code runs
	private int length;
	
	// constructors
	public Sedan(int speed, double regularPrice, String color, int length) {
		super(speed, regularPrice, color);
		this.length = length;
	}
	
	// methods
	public double getSalePrice() {
		return super.getSalePrice() * (length > 20 ? 0.95 : 0.90); // ? is a conditional statement
	}
	
	// getters & setters
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	
} // class
