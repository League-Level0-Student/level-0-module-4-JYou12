package charAt_scanners_optionDialogs;

import javax.swing.JOptionPane;

public class OwnAdventure {

	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null, "							Goal: Survive the day \n"
				+ " Summary: You will make choices throughout the day. Makeing wrong choices will set off a life-threatening disasters.");
		int choice1 = JOptionPane.showOptionDialog(null, "You wake up in your bed. What do you do?", "OwnAdventure", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Get up", "5 more minutes" }, null);

		if (choice1 == 1) {
			JOptionPane.showMessageDialog(null,
					"You overslept and your mom got mad. You were grounded. The next day a comet strikes your house."
							+ "\n Please start over.");
		}
		if (choice1 == 0) {

			int choice2 = JOptionPane.showOptionDialog(null,
					"You get up and get ready for school. Who will take you to school?", "OwnAdventure", 0,
					JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Mom", "Dad" }, null);

			if (choice2 >= 0) {
				int choice3 = JOptionPane.showOptionDialog(null, "You arrive at school early. Who will you talk to?",
						"OwnAdventure", 0, JOptionPane.INFORMATION_MESSAGE, null, new String[] { "New kid", "Friends" },
						null);

				if (choice3 == 0) {

					JOptionPane.showMessageDialog(null,
							"As you walk over to the new kid, you see a glint of silver flash accross your vission. \n "
									+ " You turn your head a see an arrow quivering in the wall. Before you can react another arrow hits you in the side \n"
									+ "					Please start over.");

				}
				if (choice3 == 1) {

					int choice4 = JOptionPane.showOptionDialog(null,
							"After you talk to your friends for a while, you head to your first class. \n "
									+ " Later at lunch another student asks you to sit with them. Do you?",
							"OwnAdventure", 0, JOptionPane.INFORMATION_MESSAGE, null,
							new String[] { "Sit with him", "Walk away" }, null);

					if (choice4 == 0) {
						int choice5 = JOptionPane.showOptionDialog(null,
								"You sit down next to the kid. Suddenly you hear a loud woosh and your stomach feels like it is turned insideout. \n"
										+ " You look around you. You seem to be in a forest of some kind. What do you do?",
								"OwnAdventure", 0, JOptionPane.INFORMATION_MESSAGE, null,
								new String[] { "Take a nap", "Explore" }, null);

						if (choice5 == 0) {
							JOptionPane.showMessageDialog(null,
									"You lay down on a patch of grass. You closs your eyes and fall asleep. \n"
											+ " While you were sleeping a lion came across you. \n"
											+ " You might want to start over.");
						}
						if (choice5 == 1) {
							int choice6 = JOptionPane.showOptionDialog(null,
									"You venture deeper into the forest. You find a small cave. It is almost sunset. Do you?",
									"OwnAdventure", 0, JOptionPane.INFORMATION_MESSAGE, null,
									new String[] { "Sleep in the cave", "Keep going" }, null);

							if (choice6 == 1) {
								JOptionPane.showMessageDialog(null,
										"You keep going past the cave. You feel your foot sliip and you start sliding down a small hill. \n "
												+ "At the bottom of the hill you fall down a steep cliff. \n"
												+ " You may want to start over.");
							}
							if (choice6 == 0) {
								JOptionPane.showMessageDialog(null, "You slept peacefully in the cave");
								JOptionPane.showMessageDialog(null, "Congrats! You survived the day!", "OwnAdventure",
										JOptionPane.PLAIN_MESSAGE);
							}
						}
					}
					if (choice4 == 1) {
						JOptionPane.showMessageDialog(null,
								"'Hey' the kid shouts. 'Don't ignore me!' The kid stants up walking towards you. "
										+ "\n Suddenly you hear a loud crash as the roof collapses. \n"
										+ " 				Please start over");
					}
				}

			}

		}

	}

}
