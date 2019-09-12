package vehiclePack;
public class testdriver {
	public static void main (String args[]) {
		Vehicle minivan = new Vehicle(7,16,21);
		Vehicle sportscar = new Vehicle(2,14,12);
		Vehicle Truck = new Vehicle();
		Vehicle VWthing = new Vehicle(8,10,10,4,26,1952,226758,1850,"Olive Green");
			
		double gallons;
		double refuels;
		int dist = 252;
		
		/*
		//assign values to fields in minivan
		minivan.passengers = 7; 
		minivan.fuelcap = 16;
		minivan.mpg = 21;
		
		//assign values to fields in sportscar
		sportscar.passengers = 2;
		sportscar.fuelcap = 14;
		sportscar.mpg = 12;
		*/
		
		//displaying minivan data
		gallons = minivan.fuelneeded(dist);
		
		refuels = minivan.numrefill(dist);
		
		System.out.println("To go " + dist + " miles the minivan needs " + gallons + " gallons of fuel.");
		
		System.out.println("To go " + dist + " miles the minivan needs " + refuels + " refuels "); 
		
		
		//displaying sportscar data
		gallons = sportscar.fuelneeded(dist);
		
		refuels = sportscar.numrefill(dist);
		
		System.out.println("To go " + dist + " miles the sportscar needs " + gallons + " gallons of fuel.");
		
		System.out.println("To go " + dist + " mile the sportscar needs " + refuels + " refuels ");
		
		
		//displaying Truck data
		gallons = Truck.fuelneeded(dist);
		
		refuels = Truck.numrefill(dist);
		
		System.out.println("To go " + dist + " miles the Truck needs " + gallons + " gallons of fuel.");
		
		System.out.println("To go " + dist + " mile the Truck needs " + refuels + " refuels ");
		
		
		//displaying VWthing data
		gallons = VWthing.fuelneeded(dist);
		
		refuels = VWthing.numrefill(dist);
		
		System.out.println("To go " + dist + " miles the VWthing needs " + gallons + " gallons of fuel.");
		
		System.out.println("To go " + dist + " mile the VWthing needs " + refuels + " refuels ");
		
		
		
		
		//Part A Completed 
		}
	}	