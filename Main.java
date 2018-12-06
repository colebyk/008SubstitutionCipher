import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {
	

	
	public static void main(String[] args) {
		
		//Scanner keyboard = new Scanner(System.in);

		// first, ask if they want to encrypt or decrypt
		String playAgain = "Yes";
		while (playAgain.equals("Yes") || playAgain.equals("yes")) {
			Substitution openCaesar = new Substitution();
		
			String answer = openCaesar.getEncryptDecrypt();
			//System.out.println("in main: " + answer);
			switch (answer) {
			case "E":
				//System.out.println("You have chosen to encrypt");
				JOptionPane.showMessageDialog(null, "You have chosen to encrypt");
				openCaesar.getPlainText();
				openCaesar.getKey();
				openCaesar.encrypt();
				break;
			case "D":
				//System.out.println("You have chosen to decrypt");
				JOptionPane.showMessageDialog(null, "You have chosen to decrypt");
				openCaesar.getEncodedText();
				openCaesar.getKey();
				openCaesar.decrypt();
				break;
			}
		playAgain = JOptionPane.showInputDialog("Would you like to play again? (Yes or No)");
		//System.out.println("Would you like to play again? (Yes or No)");
		//playAgain = keyboard.nextLine();
		}
		
	//	System.out.println("come again");
		JOptionPane.showMessageDialog(null, "come again");
		// ask if they want to go again
		// for dev, syso scanner are fine
		// for ops, change to JOps -- graded
			
	}
}
