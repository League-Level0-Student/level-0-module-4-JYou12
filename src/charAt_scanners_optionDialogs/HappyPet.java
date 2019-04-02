package charAt_scanners_optionDialogs;
import java.util.Random;

import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: 
	static int happinessLevel = 0;
	static String action;
	static String pet = JOptionPane.showInputDialog("What kind of pet do you want?");
	// this will be used to store the happiness of your pet
	
	public static void main(String[] args) {
		boolean run = true;
		int turns = 9;
		while (run == true){
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "What do you want to do to make your " +pet+ " happy?", "HappyPet", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Cuddle", "Walk", "Groom", "Water" }, null);
			ActionString(task);
			Action(action);
			
			if (happinessLevel >= 100) {
				
				JOptionPane.showMessageDialog(null, "Your "+pet +"loves you");
				run = false;
			}
			if (turns == 0) {
				JOptionPane.showMessageDialog(null, "Your "+pet+" does not love you");
				System.exit(0);
			}
			turns --;
		}
			// 5. Use user input to call the appropriate method created in step 4.

			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
		
	}

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.


	public static void Action(String action) {
		Random random = new Random();
		int rand = random.nextInt(10)+1;
		
		if (rand <= 2) {
			
			JOptionPane.showMessageDialog(null, "Your " + pet + " was unsatisfied with your care");
			
		}else if (rand <= 8 && rand > 2) {
			
			JOptionPane.showMessageDialog(null, "You " + pet + " is happier because you " + action +"ed it");
			happinessLevel += 10;
			
		}else if (rand > 8) {
			
			JOptionPane.showMessageDialog(null, "You "+pet+" loved it when you "+ action +"ed it");
			happinessLevel += 50;

		}
	}
	public static void ActionString(int task) {
	if (task == 0) {
		action = "Cuddle";
	}else if (task == 1) {
		action = "Walk";
	}else if (task == 2) {
		action = "Groom";
	}else if (task == 3) {
		action = "Water";
	}
		
	
	}
}