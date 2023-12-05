package first;

public class Airplane extends FlyingObject{

	protected String brand=new String();
	protected int horsepower;

	/**
	 * This is the default constructor
	 */
	public Airplane(){
	super();
	brand="Unk";
	horsepower=0;
	
}

	/**
	 * This is a parameterized constructor which constructs the airplane with specified price, brand and horsepower
	 * @param p the price of the airplane
	 * @param s the brand of the airplane
	 * @param h the horsepower of the airplane
	 */
	public Airplane(double p, String s, int h){
	super(p);
	this.brand=s;
	this.horsepower=h;
}


public Airplane (Airplane a){
	super(a);
	this.brand=a.brand;
	this.horsepower=a.horsepower;
	
}

@Override
public String toString() {
	return "Airplane Brand: " + brand + "\t Horsepower:" + horsepower + "\t Price: $" + price + ".";
}

@Override
public static void toStringArray(Airplane[] a) {
	System.out.println("Printing the data stores in the array...");
	for (int i=0; i<a.length; i++) {
		String s=a[i].toString();
		System.out.println(s);
	}
}

/**
*This will verify object if its equal or not
* @return Airplane object taken
 */
@Override
public boolean equals(Airplane a) {
	boolean x=false;
	if (a.price==this.price && 
			a.brand.equals(this.brand)
			&& a.horsepower==this.horsepower) x=true;
	return x;
}

/**
 * This is the accessor for the brand
 * @return the brand
 */
public String getBrand() {
	return brand;
}

/**
 * This is the mutator to set brand
 * @param brand the brand to set
 */
public void setBrand(String brand) {
	this.brand = brand;
}

/**This is the accessor for the horsePower
 * @return the horsepower
 */
public int getHorsepower() {
	return horsepower;
}

/**This is the mutator to set HorsePower
 * @param horsepower the horsepower to set
 */
public void setHorsepower(int horsepower) {
	this.horsepower = horsepower;
}

}
