package second;
import first.Airplane;
import first.FlyingObject;

public class Helicopter extends Airplane {
	protected int numCyl;
	protected int creationYr;
	protected int pasgrCap;

	/**
	 * this is the default constructor
	 */
	public Helicopter(){
	super();
	this.numCyl=0;
	this.creationYr=0;
	this.pasgrCap=0;
}

	/**
	 * parameterized constructor
	 * @param p price from super class Airplane
	 * @param b brand from super class Airplane
	 * @param h horsepower from super class Airplane
	 * @param numCyl number of cylinders
	 * @param yr creation year
	 * @param pasCap passenger capacity
 	 */
	public Helicopter(double p, String b, int h, int numCyl, int yr, int pasCap){
	super(p,b,h);
	this.numCyl=numCyl;
	this.creationYr=yr;
	this.pasgrCap=pasCap;
}

public Helicopter (Helicopter a){
	super(a);
	this.numCyl=a.numCyl;
	this.creationYr=a.creationYr;
	this.pasgrCap=a.pasgrCap;
}

	/**
	 * overriding the string of Helicopters information
	 * @return updated string with new number of cylinders, creation year, passenger capacity, brand, horsepower and price
	 */
	@Override
public String toString() {
	return "Helicopter Number of cylinders:" + numCyl + "\t Creation Year:" + creationYr + "\t Passenger Capacity:" + pasgrCap + "\t Brand:" + brand
			+ "\t Horsepower:" + horsepower + "\t Price:$" + price + ".";
}

	/**
	 * this will print all the data stored in object array
	 * @param a object array
	 */
	@Override
	public static void toStringArray(Helicopter[] a) {
	System.out.println("Printing the data stored in the array...");
	for (int i=0; i<a.length; i++) {
		String s=a[i].toString();
		System.out.println(s);
	}
}

	/**
	 * this will verify the information between two helicopter objects
	 * @param a object
	 * @return verification of the method
	 */
	@Override
	public boolean equals(Helicopter a) {
	boolean x=false;
	if (a.price==this.price && 
			a.brand.equals(this.brand)
			&& a.horsepower==this.horsepower
			&& a.numCyl==this.numCyl
			&& a.creationYr==this.creationYr
			&& a.pasgrCap==this.pasgrCap) x=true;
	return x;
}

	/**
	 * accessor
	 * @return number of cylinder
	 */
	public int getNumCyl() {
	return numCyl;
}

	/**
	 * mutator
	 * @param numCyl number of cylinder to set
	 */
	public void setNumCyl(int numCyl) {
	this.numCyl = numCyl;
}

	/**
	 * accessor
	 * @return creation year
	 */
	public int getCreationYr() {
	return creationYr;
}

/**
 * mutator
 * @param creationYr the creationYr to set
 */
public void setCreationYr(int creationYr) {
	this.creationYr = creationYr;
}

	/**
	 * accessor
	 * @return passenger capacity
 	 */
	public int getPasgrCap() {
	return pasgrCap;
}

	/**
	 * mutator
	 * @param pasgrCap passenger capacity to set
	 */
	public void setPasgrCap(int pasgrCap) {
	this.pasgrCap = pasgrCap;
}


}
