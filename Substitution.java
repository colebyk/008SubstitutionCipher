import java.util.Scanner;

import javax.swing.JOptionPane;

public class Substitution {
	
	private String alpha = "zebracdfghijklmnopqstuvwxy0123456789.:";
	private String plainText = "";
	private String encodedText = "";
	private int key = 0;
	private String answer;
	//Scanner keyboard = new Scanner(System.in);
	public Substitution() {
		
	}
	
	// methods
	public void getPlainText() {
		//System.out.println("Please enter the plain text: ");
		plainText = JOptionPane.showInputDialog("Please enter the plain text");
		plainText = plainText.toLowerCase();
		//System.out.println("You have entered: " + plainText);
	}
	
	public void getKey() {
		//System.out.println("Please enter the key #: ");
		key = Integer.parseInt(JOptionPane.showInputDialog("Please enter the key"));
		//key = keyboard.nextInt();
		//System.out.println("You have entered: " + key);
	}
	
	public void encrypt() {
		encodedText = "";
		for (int i = 0; i < plainText.length(); i++) {
			if (String.valueOf(plainText.charAt(i)).equals(" ") || alpha.indexOf(plainText.charAt(i)) == -1) // or do !alpha.contains
				encodedText += " ";
			else
				encodedText += alpha.charAt((alpha.indexOf(plainText.charAt(i)) + key)%alpha.length());
		}
		//System.out.println(encodedText);
		JOptionPane.showMessageDialog(null, "Encoded text: " + encodedText);
	}

	public String getEncryptDecrypt() {

		while (true) {
			answer = JOptionPane.showInputDialog("Would you like to encrypt or decrypt? (enter encrypt or decrypt)");
			//System.out.println("Would you like to encrypt or decrypt? (enter encrypt or decrypt)");
			//answer = keyboard.nextLine();
			answer = String.valueOf(answer.charAt(0)).toUpperCase();;
		
			if (answer.equals("E")) {
				break;
			}
			if (answer.equals("D")) {
				break;
			}
			
			//System.out.println("please try again");
			JOptionPane.showMessageDialog(null, "Error--please try again");
		
		
		}
		return answer;
	}

	public void getEncodedText() {
		//System.out.println("Please enter the encoded text: ");
		encodedText = JOptionPane.showInputDialog("Enter the encoded text: ");
		//encodedText = keyboard.nextLine();
		//System.out.println("You have entered: " + encodedText);
		
	}

	public void decrypt() {
		plainText = "";
		for (int i = 0; i < encodedText.length(); i++) {
			plainText += alpha.charAt((alpha.indexOf(encodedText.charAt(i)) - key)%alpha.length());
		}
		//System.out.println(plainText);
		JOptionPane.showMessageDialog(null, "decoded text: " + plainText);
		
	}
	
}
