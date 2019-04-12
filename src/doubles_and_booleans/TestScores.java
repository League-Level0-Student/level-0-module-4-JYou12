package doubles_and_booleans;

import javax.swing.JOptionPane;

public class TestScores {
public static void main(String[] args) {
	
	
	String TS = JOptionPane.showInputDialog("What was your test score?");
	Double d = new Double("90.25");
	double retval = d.parseDouble(TS);	
	
	if (d >= 90) {
		JOptionPane.showMessageDialog(null, "You must have studdied hard!");
	}
	if (d <= 90) {
		JOptionPane.showMessageDialog(null, "You need to study!");
	}
	}
}
