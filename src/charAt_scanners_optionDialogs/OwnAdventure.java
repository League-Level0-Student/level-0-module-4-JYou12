package charAt_scanners_optionDialogs;

import javax.swing.JOptionPane;

public class OwnAdventure {
int power = 0;
int health = 100;
int agility = 0;
int speed = 15;
int stealth = 0;

public static void main(String[] args) {
	
	int task = JOptionPane.showOptionDialog(null, "Which race do you want?", "OwnAdventure", 0, JOptionPane.INFORMATION_MESSAGE, null,
			new String[] { "Tech", "Prodigy", "Mystic"}, null);	

	if (task == 0) {
		
		Tech();
		
	}
}
//Mystic Path
public static void Tech() {
	
int character = JOptionPane.showOptionDialog(null, "Which character do you want?", "OwnAdventure", 0, JOptionPane.INFORMATION_MESSAGE, null,
			new String[] { "Atlas uses technoligy to boost agility, speed and stealth.", "", ""}, null);	
	
}
//Prodigy Path
public static void Prodigy() {
	
	
	
}
//Mystic Path
public static void Mystic() {
	
	
	
}


}
