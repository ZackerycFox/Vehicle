package vehiclePack;

import java.awt.Image;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class vehicleMake {

	String company; 
	String plantLocation;
	Date mintDate;
	ImageIcon logo; 
	int contactInfo; 
	String webSite; 
	
	vehicleMake() { 
		company = "Toyota"; 
		plantLocation = "Japan";
		try {    mintDate=new SimpleDateFormat ("yyyy-MM-dd").parse("2012-06-06"); }
				catch (Exception e) {;}
		logo = getlogo();
		contactInfo = 4454451;
		webSite = "VisitToyotaToday.com";
		}
	
	vehicleMake(String c, String pL, String wS, Date mD, ImageIcon l, int cI) {
		company = c; 
		plantLocation = pL;
		webSite = wS; 
		mintDate = mD; 
		logo = l;
		contactInfo = cI;
		
	}
	
	ImageIcon getlogo() {
		return logo; 
		
	}
	
	void getvehicleMake() {
		MakeFrame thisOne = new MakeFrame();
		
	}
	
	private class MakeFrame extends JFrame {
		JPanel pnl = new JPanel();
		ClassLoader ldr = this.getClass().getClassLoader();
		ImageIcon duke = logo;
		JLabel lbll = new JLabel( duke );
		
		MakeFrame() {
			super("Subaru");
			setSize(300,600);
			setDefaultCloseOperation( EXIT_ON_CLOSE);
			add(pnl);
			pnl.add( lbll ); 
			setVisible( true );
			
		}
	}

}
