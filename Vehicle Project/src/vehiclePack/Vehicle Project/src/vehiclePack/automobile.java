package vehiclePack;

public class automobile extends vehicle {
	
	private boolean trunk;
	private boolean workingAC;
	private boolean windowTint;
	private String owner; 
	private String title;
	private vehicleMake automake;
	private vehicleModel automodel; 
	
	
		automobile(){
			super();
			trunk = true; 
			workingAC = true; 
			windowTint = false; 
			owner = "Zackery"; 
			title = "Zackery Fox";
			automake = new vehicleMake();
			automodel = new vehicleModel();
			updateVehical();
		}
		
		automobile(int passengers, int fuelcap, int mpg, vehicleMake VW, vehicleModel Golf){
			super(passengers, fuelcap, mpg);
			trunk = true; 
			workingAC = true; 
			windowTint = false; 
			owner = "Zackery"; 
			title = "Zackery Fox";
			automake = new vehicleMake();
			automodel = new vehicleModel();
			updateVehical();
		}
		
		automobile(int passengers, int fuelcap, int mpg, int doors, int tiresize, int year, int totalmiles, int tonage, String color,  vehicleMake Toyota, vehicleModel Tacoma){
			super(passengers, fuelcap, mpg, doors, tiresize, year, totalmiles, tonage, color);
			trunk = true; 
			workingAC = true; 
			windowTint = false; 
			owner = "Zackery"; 
			title = "Zackery Fox";
			automake = new vehicleMake();
			automodel = new vehicleModel();
			updateVehical();
		}
		
	public int getnumWheels() {
		String[] trimPackage = automodel.getTrimPackage();
		int wheelCount = 0;
		try {
				wheelCount = Integer.parseInt(trimPackage[1]);
		}
		catch(Exception e) {
			System.out.println("Bad Trim Package");
		}
		return wheelCount; 
	}
	
	private void updateVehical() { 
		String[] trimPack = automodel.getTrimPackage();
		//"Wheels", "4", "MPG", "28", "Color", "Burnt Orange", "Seats", "5", "Fuel Capacity", "18.5", "tonage", "1600lb"
		int wCount, MPG, pass, fuelCap; 
		double tonage; 
		String colour = trimPack[5];
		
		try {
			wCount = Integer.parseInt(trimPack[1]);
			MPG = Integer.parseInt(trimPack[3]);
			pass = Integer.parseInt(trimPack[7]);
			fuelCap = Integer.parseInt(trimPack[9]);
		}
		catch(Exception e) {
			wCount = 4; 
			MPG = 20; 
			pass = 4;
			fuelCap = 20; 
		
			System.out.println("Bad Trim Package");
		}
		
		try {
			tonage = Double.parseDouble(trimPack[11]);
		}
		catch (Exception e) {
			tonage = 75; 
			System.out.println("Bad Trim Package");
		}
		
	}
	
	public int getnumDoors() {
		return super.doors; 
	}
	public void getMakeAndModel() {
		//Special Boi
		automake.getvehicleMake();
		//automodel.getModelName();
		System.out.println(automodel.getModelName());
	}	
	public boolean isTrunk() {
		return trunk;
	}
	public void setTrunk(boolean trunk) {
		this.trunk = trunk;
	}
	public boolean isWorkingAC() {
		return workingAC;
	}
	public void setWorkingAC(boolean workingAC) {
		this.workingAC = workingAC;
	}
	public boolean isWindowTint() {
		return windowTint;
	}
	public void setWindowTint(boolean windowTint) {
		this.windowTint = windowTint;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	} 	
}

