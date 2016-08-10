import javax.swing.JOptionPane;

public class Stalker {
	public static void main(String[] args) {
		String answer1 = JOptionPane.showInputDialog("What is your name?");
		System.out.println("My name is " + answer1);
		String answer2 = JOptionPane.showInputDialog(" What is your favorite family member?");
		System.out.println("My favorite family member is " + answer2);
		String answer3 = JOptionPane.showInputDialog(" How would you feel if you never saw them again? ");
		System.out.println("I would feel " + answer3);
		String answer4 = JOptionPane.showInputDialog(" Are you sure?");
		System.out.println("I say " + answer4);
		JOptionPane.showConfirmDialog(null, "Hope you have a second favorite");
		JOptionPane.showConfirmDialog(null, ":)");

	}
}
