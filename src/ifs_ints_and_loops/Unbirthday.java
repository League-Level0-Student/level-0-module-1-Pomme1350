package ifs_ints_and_loops;

import javax.swing.JOptionPane;

public class Unbirthday {
	public static void main(String[] args) {
	String birthday=	JOptionPane.showInputDialog(null, "When is your birthday?(Include the month and day only. no capitals)");
	if(birthday.equals("December 5")) {
		JOptionPane.showMessageDialog(null, "Happy Birthday!!!");
		
	}
	else {
	JOptionPane.showMessageDialog(null, "Happy very unmerry Unbirthday!!!");	
	}
		
	}
}
