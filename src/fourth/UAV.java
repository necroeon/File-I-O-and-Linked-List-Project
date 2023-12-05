package fourth;
import first.Airplane;
import first.FlyingObject;


public class UAV extends FlyingObject{
	protected double weight;

	/**
	 * this is the default constructor
	 */
	public UAV(){
	super();
	this.weight=0;
}

	/**
	 * this is the parameterized constructor
	 * @param p price from flying object class
	 * @param w weight
	 */
	public UAV(double p, double w){
	super(p);
	this.weight=w;
}

public UAV (UAV a){
	super(a);
	this.weight=a.weight;
}

	/**
	 * overriding the output
	 * @return new string with updated price and weight
	 */
	@Override
public String toString() {
	return "UAV Weight: " + weight + "\tPrice: $" + price + ".";
}

	/**
	 * this will print all the data stored in object array
	 * @param a object array
	 */
	@Override
	public static void toStringArray(UAV[] a) {
	System.out.println("Printing the data stored in the array...");
	for (int i=0; i<a.length; i++) {
		String s=a[i].toString();
		System.out.println(s);
	}
}

	/**
	 * verification for price and weight match between objects
	 * @param a
	 * @return verification of the method
	 */
	@Override
	public boolean equals(UAV a) {
	boolean x=false;
	if (a.price==this.price
			&& a.weight==this.weight) x=true;
	return x;
}

	/**
	 * accessor
	 * @return weight
 	 */
	public double getWeight() {
	return weight;
}

	/**
	 * mutator
	 * @param weight to be set
	 */
	public void setWeight(double weight) {
	this.weight = weight;
}

}
