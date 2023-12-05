package third;
import first.FlyingObject;
import second.Helicopter;

public class Multirotor extends Helicopter {
	protected int numRotors;

	/**
	 * default constructor
	 */
	public Multirotor (){
	super();
	this.numRotors=0;
}

	/**
	 * parameterized constructor
	 * @param p calls price from super class Flying object
	 * @param b calls brand from suepr class airplane
	 * @param h	calls horse power from super class airplane
	 * @param numCyl calls number of cylinders from super class helicopter
	 * @param yr calls creation year from super class helicopter
	 * @param pasCap calls passenger capacity from super class helicopter
	 * @param rot number of rotors
	 */
	public Multirotor (double p, String b, int h, int numCyl, int yr, int pasCap, int rot){
	super(p, b, h, numCyl, yr, pasCap);
	this.numRotors=rot;
}

public Multirotor (Multirotor a){
	super(a);
	this.numRotors=a.numRotors;
}

	/**
	 * overriding the string
	 * @return updated string for information of multirotors
	 */
	@Override
public String toString() {
	return "Multirotor Number of rotors: " + numRotors +"\tNumber of cylinders: " + numCyl + "\t Creation Year: " + creationYr + "\t Passanger Capacity: " + pasgrCap + "\t Brand: " + brand
		+ "\tHorsepower: " + horsepower + "\t Price: $" + price + ".";
}

	/**
	 * output all the date stored in object array
	 * @param a object array
	 */
	@Override
	public static void toStringArray(Multirotor[] a) {
	System.out.println("Printing the data stored in the array...");
	for (int i=0; i<a.length; i++) {
		String s=a[i].toString();
		System.out.println(s);
	}
}

	/**
	 * verifies information between two objects
	 * @param a object to be verified
	 * @return verification of the method
	 */
	@Override
	public boolean equals(Multirotor a) {
	boolean x=false;
	if (a.price==this.price && 
			a.brand.equals(this.brand)
			&& a.horsepower==this.horsepower
			&& a.numCyl==this.numCyl
			&& a.creationYr==this.creationYr
			&& a.pasgrCap==this.pasgrCap
			&& a.numRotors==this.numRotors ) x=true;
	return x;
}

/**
 * @return the numRotors
 */
public int getNumRotors() {
	return numRotors;
}

/**
 * @param numRotors the numRotors to set
 */
public void setNumRotors(int numRotors) {
	this.numRotors = numRotors;
}

}
