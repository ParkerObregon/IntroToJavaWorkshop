package day3;

import javax.swing.JOptionPane;

public class WorldDomination {
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
		String answer = JOptionPane.showInputDialog("Do you code, brah ?");
		// 2. If they say "yes", tell them they will rule the world.
		if (answer.equals("yes")) {
			JOptionPane.showMessageDialog(null, " You are going to be king, brah !");

		} else {
			JOptionPane.showMessageDialog(null, "Get back to the kitchen then, brah !");
		}

		// 3. Otherwise, wish them good luck washing dishes.

	}
}
