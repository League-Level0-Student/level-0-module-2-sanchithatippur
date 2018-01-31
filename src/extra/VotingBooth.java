package extra;

import javax.swing.JOptionPane;

public class VotingBooth {

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("How old are you?");
		int age = Integer.parseInt(input);
		if (age < 13) {
			System.out.println("Come back when your older. Nice try!");
		} else {
			System.out.println("Ok fine you can vote. It better be a good choice.");
		}

	}
}
