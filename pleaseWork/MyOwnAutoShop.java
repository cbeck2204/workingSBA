package pleaseWork;

public class MyOwnAutoShop {

	public static void main(String[] args) {
		
		Sedan s = new Sedan(4, 12000.90, "blue", 18); // speed, regularPrice, color, length
		System.out.println("Sedan getSalePrice = " + s.getSalePrice()); // length < 20 10% discount
		
		Ford f150 = new Ford(6, 25000.55, "white", 2014, 1500); // speed, regularPrice, color, year, manufacturerDiscount
		System.out.println("Ford f150 getSalePrice = " + f150.getSalePrice()); // subtract 1500 for manufacturerDiscount
		
		Ford f250 = new Ford(6, 35000.15, "black",2016, 2500); // speed, regularPrice, color, year, manufacturerDiscount
		System.out.println("Ford f250 getSalePrice = " + f250.getSalePrice()); // subtract 2500 for manufacturerDiscount
		
		Car c = new Car(4, 10999.98, "orange"); // speed, regularPrice, color
		System.out.println("Car getSalePrice = " + c.getSalePrice());

	} // main method

} // class
