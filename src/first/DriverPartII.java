package first;

import fifth.AgriculturalDrone;
import fifth.MAV;
import fourth.UAV;
import second.Helicopter;
import second.Quadcopter;
import third.Multirotor;

public class DriverPartII {
	
	
	public static FlyingObject[] copyFlyingObjects (FlyingObject[] aerial){
		FlyingObject[] copyOfAerial=new FlyingObject[aerial.length];
		System.out.println("Copying the array...");
		for (int i=0; i<aerial.length; i++) {
			copyOfAerial[i]=new FlyingObject(aerial[i]);
		}
		System.out.println("Array copied");
		return copyOfAerial;
		
	}

	public static void main(String[] args) {
		FlyingObject aerial2[]=new FlyingObject[18];
	    aerial2[0]= new Airplane(30000000, "Aerobus", 600);
	    aerial2[1]=new Helicopter(7033300, "Helios", 700, 12, 2022, 1000);
	    aerial2[2]=new Helicopter(7569900, "Helios", 700, 12, 2022, 2000);
	    aerial2[3]=new UAV(60000000, 800.0);
	    aerial2[4]=new UAV(75000000, 900.0);
	    aerial2[5]=new AgriculturalDrone(7600000, 500.0, "AgriDrone", 100);
	    aerial2[6]=new Quadcopter(6500000, "AirHelios",2500, 250, 2018, 10, 975);
	    aerial2[7]=new MAV(64000000, 460., "MAV-200", 200.);
	    aerial2[8]=new Multirotor(78300000, "AirRotor", 400, 36, 2050, 13, 10);
	    aerial2[9]=new Helicopter(767000000, "Airbus", 250, 48, 2020, 60);
	    aerial2[10]=new AgriculturalDrone(676700000, 540.25, "AgriAIR", 6);
	    aerial2[11]=new MAV(4500000, 490., "MAV-250", 250.);
	    aerial2[12]=new MAV(5000000, 460., "MAV-200XL", 400.);
	    aerial2[13]=new Airplane(600000000, "Airbus", 45000);
	    aerial2[14]=new Airplane(6000000, "Boeing", 4500);
	    aerial2[15]=new Helicopter(4000000, "Boeing", 4500, 75, 2012, 39);
	    aerial2[16]=new Helicopter(3400000, "Boeing", 5000, 66, 2002, 12);
	    aerial2[17]=new MAV(3250000, 340., "AIB-256-AL", 300.);
	    
	    FlyingObject.toStringArray(aerial2);
	    
	    FlyingObject[] copyArray;
	    copyArray=copyFlyingObjects(aerial2);
	    
	    System.out.println("Printing coppied array");
	    FlyingObject.toStringArray(copyArray);
	    	    }

	}


