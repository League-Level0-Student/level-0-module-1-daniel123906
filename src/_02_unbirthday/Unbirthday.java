package _02_unbirthday;

import javax.swing.JOptionPane;

public class Unbirthday {
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("What is your birthday?");
		if (input.equals("07/10/19")) {
			JOptionPane.showMessageDialog(null, "Happy birthday!");
		} else {
			JOptionPane.showMessageDialog(null, "Happy Unbirthday");
		}
	}
}
