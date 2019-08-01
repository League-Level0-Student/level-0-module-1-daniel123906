package _02_unbirthday;

import javax.swing.JOptionPane;

public class Unbirthdy {
public static void main(String[] args) {
	String input=JOptionPane.showInputDialog("What is your birthday");
	if(input.equals("7/31/19")); {
		JOptionPane.showMessageDialog(null, "Happy Birthday!");
	  } else {
		JOptionPane.showMessageDialog(null, "Happy unbirthday!");
		}
	}
}
