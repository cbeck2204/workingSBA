package pleaseWork;

public class Car {

	// fields
	// protected fields allow all child classes to access it
	protected int speed;
	protected double regularPrice;
	protected String color;
	
	// constructors
	public Car(int speed, double regularPrice, String color) {
		this.speed= speed;
		this.regularPrice = regularPrice;
		this.color = color;
	}
	
	// methods
	public double getSalePrice() {
		return regularPrice;
	}
	
	// getters & setters
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public double getRegularPrice() {
		return regularPrice;
	}
	public void setRegularPrice(double regularPrice) {
		this.regularPrice = regularPrice;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
} // class
