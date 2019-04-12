package charAt_scanners_optionDialogs;

import javax.swing.JOptionPane;

public class OwnAdventure {
int power = 0;
int health = 100;
int agility = 0;
int speed = 15;
int stealth = 0;
int regen = 5;

public static void main(String[] args) {
	
	int task = JOptionPane.showOptionDialog(null, "Which faction do you want?", "OwnAdventure", 0, JOptionPane.INFORMATION_MESSAGE, null,
			new String[] { "Tech", "Prodigy", "Mystic"}, null);	

	if (task == 0) {
		
		Tech();
		
	}
}
//Mystic Path
public static void Tech() {
	//Character choice
int character = JOptionPane.showOptionDialog(null, "Which character do you want?", "OwnAdventure", 0, JOptionPane.INFORMATION_MESSAGE, null,
			new String[] { "Atlas, he uses technoligy to his boost agility, speed and stealth.", 
					"Ceres, she uses technoligy to boost her strength and healing.",
					"Griffith, he uses technolgiy to boost his hand eye coordination and ability to think"}, null);	
//Atlas Path
if (character == 0) {

	JOptionPane.showMessageDialog(null, "");
	
}

}

//Prodigy Path
public static void Prodigy() {
	
	
	
}
//Mystic Path
public static void Mystic() {
	
	
	
}


}
