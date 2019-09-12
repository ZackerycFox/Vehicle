package vehiclePack;

import java.awt.Image;
import java.util.Date;

public class vehicleMake {

	String company; 
	String plantLocation;
	Date mintDate;
	Image logo; 
	int contactInfo; 
	String webSite; 
	
	vehicleMake() { 
		company = "Toyota"; 
		plantLocation = "Japan";
		//mintDate = "";  
		//logo = getlogo(Toyota);
		contactInfo = 4454451;
		webSite = "VisitToyotaToday.com";
				
	}
	
	Image getlogo() {
		return logo; 
		
	}
	
	void getvehicleMake() {
		
	}

}
