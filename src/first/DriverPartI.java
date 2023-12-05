package first;
import first.FlyingObject;
import fourth.UAV;
import first.Airplane;
import second.Helicopter;
import second.Quadcopter;
import third.Multirotor;
import fifth.AgriculturalDrone;
import fifth.MAV;
public class DriverPartI {

	public static void main(String[] args) {
		Airplane airplane = new Airplane(2000000,"Tejas", 30000);
	    Helicopter helicopter = new Helicopter(1000000,"Marteen", 20000, 4, 2005, 500);
	    Quadcopter quadcopter = new Quadcopter(5000000, "Boeing",  45000, 8, 2010, 600, 500);
	    Multirotor multirotor = new Multirotor(4670000, "Boeing",  45000, 6, 2010, 550, 2);
	    UAV uav = new UAV(400000, 100.56);
	    AgriculturalDrone ad = new AgriculturalDrone(300000, 89.45,  "HAL", 10);
	    MAV mav = new MAV(200001.34, 50.6, "HAL 674-Canadian", 120.8);

	    System.out.println(airplane.toString());
	    System.out.println(helicopter.toString());
	    System.out.println(quadcopter.toString());
	    System.out.println(multirotor.toString());
	    System.out.println(uav.toString());
	    System.out.println(ad.toString());
	    System.out.println(mav.toString());
	    System.out.println("");
	    
	    
	    FlyingObject aerial1[] = new FlyingObject[15];
	    aerial1[0]=airplane ;
	    aerial1[1]=helicopter;
	    aerial1[2]=quadcopter;
	    aerial1[3]=multirotor;
	    aerial1[4]=uav ;
	    aerial1[5]=ad ;
	    aerial1[6]=mav ;
	    aerial1[7]=new Helicopter(1000000,"Marteen", 20000, 4, 2005, 500);
	    aerial1[8]=new AgriculturalDrone(300000, 89.45,  "HAL", 10);
	    aerial1[9]=new Multirotor(4670000, "Boeing",  45000, 6, 2010, 550, 2);
	    aerial1[10]=new AgriculturalDrone(800000, 89.45,  "HAL", 25);
	    aerial1[11]=new MAV(200001.34, 50.6, "HAL 674-Canadian", 120.8);
	    aerial1[12]=new MAV(200001.34, 50.6, "HAL 674-Canadian", 120.0);
	    aerial1[13]=new Multirotor(4670000, "MIG",  45000, 6, 2010, 550, 2);
	    aerial1[14]=new Helicopter(4670000, "MIG",  45000, 6, 2010, 550);
	    
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
	    
	    findLeastAndMostExpensiveUAV(aerial1);
	    findLeastAndMostExpensiveUAV(aerial2);
	    

	}
	
public static int[] findLeastAndMostExpensiveUAV(FlyingObject[] aerial) {
	
    double minPrice = Double.MAX_VALUE;
    double maxPrice =Double.MIN_VALUE;
    
    /*Array for the return of information on the location of the least and most expensive UAVs in the original array. 
	The first value is the index of the least expensive UAV and the 2nd value is the index of the most expensive UAV. */
    int[] minMaxIndexes= {-1,-1}; 
   
    int uavCount=0;    
    
//Create an array with info of only UAVs that are present in the passed array.
    
    //Determine the number of UAVs to get array size
    for (int i=0; i<aerial.length; i++) {    
    	if (aerial[i].getClass().toString().equals("class fourth.UAV")||
    			aerial[i].getClass().toString().equals("class fifth.MAV") ||
    			aerial[i].getClass().toString().equals("class fifth.AgriculturalDrone")) uavCount++;
    }
    System.out.println("You have "+uavCount+" UAVs in this array.");
    
    if (uavCount==0) System.out.println("There are no UAVs in the given array of flying objects.");
    
    //Special case - only 1 UAV present in the given array of Flying Objects.
    else if (uavCount==1) {
    	
    	for (int i = 0; i<aerial.length; i++) {
			if (aerial[i].getClass().toString().equals("class fourth.UAV") ||
        			aerial[i].getClass().toString().equals("class fifth.MAV") ||
        			aerial[i].getClass().toString().equals("class fifth.AgriculturalDrone")) 
    		
    		System.out.println("There is only one UAV in the array. The same UAV is the least and the most expensive:"
    				+ "UAV information:\t"+aerial[i].toString()
    				+ "\nIts location is "+ i+"\n");
    		minMaxIndexes[0]=i;
    		minMaxIndexes[1]=i;
    		}
    	
    	}
        	
    
    else if (uavCount>1) {    	
    	double[][] uavMinMax=new double[uavCount][2];    	
    	
    	
        //Fill the arrays with UAV objects' information
    	
    	int uavAddedCount=0; //Counts how many UAvs have been copied
    	for (int i = 0; i < aerial.length; i++) {    		
        	if (aerial[i].getClass().toString().equals("class fourth.UAV") ||
        			aerial[i].getClass().toString().equals("class fifth.MAV") ||
        			aerial[i].getClass().toString().equals("class fifth.AgriculturalDrone")) {
        		uavMinMax[uavAddedCount][0]=aerial[i].getPrice(); //uavMinMax[i][0] is where the price is stored
        		uavMinMax[uavAddedCount][1]=i; //uavMinMax[i][1] is where the location in original array is stored
        		uavAddedCount++;
        	
        	}
        	
    	}	
    	
    	/*
    	//Quick check: printing the uavMinMax array containing only UAVs.
    	for (int i=0; i<uavMinMax.length; i++) {
    		System.out.println("UAV array item "+i+" :"+uavMinMax[i][0]+"\t"+uavMinMax[i][1]);
    	} */
        	
        //Finding the least and the most expensive UAVs
    	for (int i=0; i<uavMinMax.length; i++) {
    		if (uavMinMax[i][0]<minPrice) {
    			minPrice=uavMinMax[i][0];
    			minMaxIndexes[0]=(int)uavMinMax[i][1];	
    		}
    		
    		if (uavMinMax[i][0]>maxPrice) {
    			maxPrice=uavMinMax[i][0];
    			minMaxIndexes[1]=(int)uavMinMax[i][1];
    		}
    	
        }
    	//Printing out the info of least and most expensive UAVs
		System.out.println("Least expensive UAV information:\t"+aerial[minMaxIndexes[0]].toString()
				+"\nLeast expensive UAV location:\t" + (minMaxIndexes[0])
				+ "\nMost expensive UAV information:\t"+aerial[minMaxIndexes[1]].toString()
				+ "\nMost expensive UAV location is "+ (minMaxIndexes[1])+"\n");
		
	    
       
    }
    
    return minMaxIndexes;
   
}

}

