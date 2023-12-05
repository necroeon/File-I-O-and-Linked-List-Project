package fifth;
import fourth.UAV;


public class AgriculturalDrone extends UAV {
	public String brand=new String();
	public int carryCap;

	/**
	 * default constructor
	 */
	public AgriculturalDrone(){
	this.brand="Unk";
	this.carryCap=0;
}

	/**
	 * parameterized constructor
	 * @param p calls for price from super class flying object
	 * @param w calls for weight from super class UAV
	 * @param b brand
	 * @param carryCap carry capacity
	 */
	public AgriculturalDrone(double p, double w, String b, int carryCap){
	super(p, w);
	this.brand=b;
	this.carryCap=carryCap;
}

public AgriculturalDrone(AgriculturalDrone a){
	super(a);
	this.brand=a.brand;
	this.carryCap=a.carryCap;
}

	/**
	 * overriding the string output
	 * @return outputting the updated string for the information on Agricultural Drone
	 */
	@Override
public String toString() {
	return "Agricultural Drone Brand: " + brand + "\tWeight: " + weight + "\tPrice: $" + price + ".";
}

	/**
	 * output stored data of object array
	 * @param a object array
	 */
	@Override
public static void toStringArray(AgriculturalDrone[] a) {
	System.out.println("Printing the data stored in the array...");
	for (int i=0; i<a.length; i++) {
		String s=a[i].toString();
		System.out.println(s);
	}
}

	/**
	 * verifies information between two objects
	 * @param a object
	 * @return verfication of the method
	 */
	@Override
public boolean equals(AgriculturalDrone a) {
	boolean x=false;
	if (a.price==this.price
			&& a.weight==this.weight
			&& a.brand.equals(this.brand)
			&& a.carryCap==this.carryCap ) x=true;
	return x;
}

/**
 * @return the brand
 */
public String getBrand() {
	return brand;
}

/**
 * @param brand the brand to set
 */
public void setBrand(String brand) {
	this.brand = brand;
}

/**
 * @return the carryCap
 */
public int getCarryCap() {
	return carryCap;
}

/**
 * @param carryCap the carryCap to set
 */
public void setCarryCap(int carryCap) {
	this.carryCap = carryCap;
}

}
