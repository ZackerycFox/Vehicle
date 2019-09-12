package vehiclePack;

public abstract class vehicle {
	int passengers;
	int fuelcap;
	int mpg;
	int doors;
	int tiresize;
	int year;
	int totalmiles;
	int tonage;
	int distance;
	int topspeed; 
	int speed;
	int fuellevel;
	String key; 
	String hornsound;
	String color;
	
	//This is a constructor for the minivan and sportscar. 
	vehicle(int p, int f, int m) {
		passengers = p;
		fuelcap = f;
		mpg = m;
		doors = 2; 
		tiresize = 24;
		year = 2009;
		totalmiles = 110523;
		tonage = 1100; 
		color = "Very Blue";
	}
	
	//Constructor with 9 varibles
	vehicle(int p, int f, int m, int d, int t, int y, int o, int w, String c) {
		passengers = p; 
		fuelcap =  f; 
		mpg = m; 
		doors = d;
		tiresize = t;
		year = y; 
		totalmiles = o;
		tonage = w;
		color = c;
	}
	
	//Constructor for default Vehicle. 
	vehicle() {
		passengers = 4;
		fuelcap = 18; 
		mpg = 24;
		doors = 4; 
		tiresize = 22;
		year = 2012;
		totalmiles = 75023;
		tonage = 1600; 
		color = "Magnetic Gray";
	} 
	
	//Return the range.
	int range() {
		return mpg * fuelcap; 
	}
		
	//Compute fuel needed for a given distance.
	double fuelneeded(int miles) {
		return (double) miles / mpg;
	}
		
	//Number of refuels needed
	int numrefill(int miles) {
		return (int) miles / range();
	}
	
	//Honking the horn with hornsound
	
	String honk() {
		return hornsound;
	}
	
		
	String forwardmotion() {
		return "accelerating"; 	
		
	}
	
	String slowdown() {
		return "breaking";
	
	}
	
	boolean startcar(String usedkey) {
		if(usedkey == key) {
		return true; 
			}
		return false;
	}
	
	abstract void getMakeAndModel() ;
	
}