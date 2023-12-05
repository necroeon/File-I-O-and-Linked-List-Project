package second;

import first.Airplane;
import first.FlyingObject;

public class Quadcopter extends Helicopter {
	protected int maxFlySpeed;

	/**
	 * default constructor
	 */
	public Quadcopter(){
	super();
	this.maxFlySpeed=0;
}

	/**
	 * parameterized constructor
	 * @param p calls price from super class Flying Object
	 * @param b	calls brand from super class Airplane
	 * @param h calls horsepower from super class Airplane
	 * @param numCyl calls number of cylinders from super class helicopter
	 * @param yr calls creation year from super class helicopter
	 * @param pasCap calls passenger capacity from super class helicopter
	 * @param speed speed of quadcopter
	 */
	public Quadcopter(double p, String b, int h, int numCyl, int yr, int pasCap, int speed){
	super(p,b, h, numCyl, yr, pasCap);
	this.maxFlySpeed=speed;
}

public Quadcopter(Quadcopter a){
	super(a);
	this.maxFlySpeed=a.maxFlySpeed;
}

	/**
	 * overriding the string output
	 * @return updated string
 	 */
	@Override
public String toString() {
	return "Quadcopter: Maximum flying speed:" + maxFlySpeed + "\t Number of cylinders:" + numCyl + "\t Creation Year:" + creationYr + "\t Passanger Capacity:" + pasgrCap + "\t Brand:" + brand
			+ "\t Horsepower:" + horsepower + "\t Price:$" + price + ".";
}

	/**
	 * output all the data in object array
	 * @param a object array
	 */
	@Override
	public static void toStringArray(Quadcopter[] a) {
	System.out.println("Printing the data stored in the array...");
	for (int i = 0; i < a.length; i++) {
		String s = a[i].toString();
		System.out.println(s);
	}

/**
 * verification for equal information between two objects
 */
@Override
	public boolean equals(Quadcopter a){
		boolean x = false;
		if (a.price == this.price &&
				a.brand.equals(this.brand)
				&& a.horsepower == this.horsepower
				&& a.maxFlySpeed == this.maxFlySpeed) x = true;
		return x;
	}

/**
 * accessor
 * @return the maxFlySpeed
 */
	public int getMaxFlySpeed () {
		return maxFlySpeed;
	}

/**
 *mutator
 * @param maxFlySpeed the maxFlySpeed to set
 */
	public void setMaxFlySpeed ( int maxFlySpeed){
		this.maxFlySpeed = maxFlySpeed;
	}

}
