package first;

public class FlyingObject {
	protected double price;

	/**
	 * this is the default constructor
	 */
	public FlyingObject(){
	this.price=0;
}

	/**
	 * this is the parameterized constructor
	 * @param p the price of flying objects
	 */
	public FlyingObject(double p){
	this.price=p;
	
}

public FlyingObject(FlyingObject a){
	this.price=a.price;
}

	/**
	 * overriding the output with new values
	 * @return the new price of the flying object
	 */
	@Override
public String toString() {
	return "Flying Object Price: $" + price + ".";
}

	/**
	 * this will print all the data stored in object array
	 * @param a this is the object array
	 */
	public static void toStringArray(FlyingObject[] a) {
	System.out.println("Printing the data stored in the array...");
	for (int i=0; i<a.length; i++) {
		String s=a[i].toString();
		System.out.println(s);
	}
}

	/**
	 * verify to see if passed object is equal or not
	 * @param a
	 * @return verification of the method
	 */
	public boolean equals(FlyingObject a) {
	boolean x= false;
	//Verify if passed object is null.
	if (a==null) x=false;
	
	//Verify if passed object is of the same class.
	else if (!this.getClass().equals(a.getClass())) x=false;
	
	//Actually compare the two objects.
	else if (a.price==this.price) x=true;
	
	return x;
}

	/**
	 * this is the accessor for price
	 * @return price of the flying object
	 */
	public double getPrice() {
	return price;
}

	/**
	 * this is the mutator for the price
	 * @param price the price to set
	 */
	public void setPrice(double price) {
	this.price = price;
}


}
