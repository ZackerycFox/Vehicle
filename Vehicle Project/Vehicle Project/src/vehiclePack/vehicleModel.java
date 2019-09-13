package vehiclePack;

public class vehicleModel {
	
	private String bodyType;
	private String modelName;
	private String[] trimPackage;
	
	vehicleModel() { 
		bodyType = "Crossover"; 
		modelName = "CrossTrek";
		trimPackage = new String[] {"Wheels", "4", "MPG", "28", "Color", "Burnt Orange", "Seats", "5", "Fuel Capacity", "18", "tonage", "1600"}; 
	}
	
	vehicleModel(String Bt, String Mn, String[] trimPac) {
		bodyType = Bt;
		modelName = Mn;
		trimPackage = trimPac; 
		
	}
	
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public String getBodyType() {
		return bodyType;
	}
	public void setBodyType(String bodyType) {
		this.bodyType = bodyType;
	}
	public String[] getTrimPackage() {
		return trimPackage;
	}
	public void setTrimPackage(String[] trimPackage) {
		this.trimPackage = trimPackage;
	} 
}
