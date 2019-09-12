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
	
	public int getnumDoors() {
		return super.doors; 
	}
	public void getMakeAndModel() {
		
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
