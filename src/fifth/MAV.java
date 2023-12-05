package fifth;
import fourth.UAV;

public class MAV extends UAV {
	public String model=new String();
	public double size;

	/**
	 * default constructor
	 */
	public MAV(){
	super();
	this.model="unk model";
	this.size=0;
}

	/**
	 * parameterized constructor
	 * @param p calls for price from super class flying object
	 * @param w calls for weight from super class UAV
	 * @param m model
	 * @param s size
	 */
	public MAV(double p, double w, String m, double s){
	super(p, w);
	this.model=m;
	this.size=s;
}

public MAV(MAV a){
	super(a);
	this.model=a.model;
	this.size=a.size;
}

	/**
	 * update string for MAV model
	 * @return output updated String
	 */
	@Override
public String toString() {
	return "MAV Model: " + model + "\tSize: " + size + "\tWeight: " + weight + "\tPrice: $" + price + ".";
}

	/**
	 * verifies information between two objects
	 * @param a object
	 * @return verification of the method
	 */
	@Override
public boolean equals(MAV a) {
	boolean x=false;
	if (a.price==this.price
			&& a.weight==this.weight
			&& a.model.equals(this.model)
			&& a.size==this.size) x=true;
		return x;
}

	/**
	 * accessor
	 * @return model
	 */
	public String getModel() {
	return model;
}

	/**
	 * mutator
	 * @param model is set as model
	 */
	public void setModel(String model) {
	this.model = model;
}

	/**
	 * accessor
	 * @return size
	 */
	public double getSize() {
	return size;
}

	/**
	 * mutator
	 * @param size is set as size
	 * @param size is set as size
	 */
	public void setSize(double size) {
	this.size = size;
}

}
