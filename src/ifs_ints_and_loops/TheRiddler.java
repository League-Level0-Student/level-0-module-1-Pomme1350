package ifs_ints_and_loops;
//    Copyright (c) The League of Amazing Programmers 2013-2017

//    Level 0

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		JOptionPane.showMessageDialog(null, "I will give you a riddle");
		JOptionPane.showMessageDialog(null,
				"Imagine that you are at a resteraunt and you order spaghetti. You eat the spaghetti and you pay your check. Then, as you put your hand on the door knob something catches your attention. There is a huge black hole that sucks up everything and everyone but you inside. The whole building then turns into metal.");
		String Answer1=JOptionPane.showInputDialog(null, "How do you get out?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by
		// one
		if(Answer1.equals("You stop imagining.")) {
			JOptionPane.showMessageDialog(null, "Correct!!!");
			score++;
		}

		// 5. Otherwise, say "wrong" and tell them the answer
		else {
			JOptionPane.showMessageDialog(null, "WRONG!!!");
			JOptionPane.showMessageDialog(null, "You stop imagining.");
		}

		// 6. Add some more riddles

		// 2. Make a pop up to show the score.

	}
}
