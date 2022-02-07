package pleaseWork;

public class Truck extends Car {

	// fields
	// private fields protects value when code runs
	private int weight;
	
	// constructors
	public Truck(int speed, double regularPrice, String color, int weight) {
		super(speed, regularPrice, color);
		this.weight = weight;
	}
	
	// methods
	public double getSalePrice() {
		return super.getSalePrice() * (weight > 2000 ? 0.90 : 0.80); // ? is conditional statement ternary operator
	}
	
	// getters & setters
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
} // class
