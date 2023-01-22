package br.com.flipacoin;

import java.util.Random;

import javax.swing.JOptionPane;

public class FlipACoin {
	static final int YES = 0;
	static final int NO = 1;
	static final int CANCEL = 2;

	public static void main(String[] args) {

		int inputWelcome = JOptionPane.showConfirmDialog(null,
				"Hello! welcome to heads or tails!" + "\n Do you want to play?");
		if (inputWelcome == YES) {
			String[] headsOrTails = { "Heads", "Tails" };
			int inputUserChoice = JOptionPane.showOptionDialog(null, "Do you choice heads or tails?", null,
					JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, headsOrTails, null);
			int randomChoice = new Random().nextInt(2) + 1;
			System.out.println(randomChoice);
			if (inputUserChoice + 1 == randomChoice) {
				JOptionPane.showMessageDialog(null, "Congratulations! You win the game!!");
			} else {
				JOptionPane.showMessageDialog(null, "What a pity, you lose!");
			}

		} else {
			JOptionPane.showMessageDialog(null, "Okay! See you!");
		}

	}
}
