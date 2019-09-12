package vehiclePack;

public class automobile extends vehicle {
	
	private boolean trunk;
	private boolean workingAC;
	private boolean windowTint;
	private String owner; 
	private String title;
	@Override
	void getMakeAndModel() {
		// TODO Auto-generated method stub
		
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
