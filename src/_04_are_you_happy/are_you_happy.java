package _04_are_you_happy;

import javax.swing.JOptionPane;

public class are_you_happy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String answer=JOptionPane.showInputDialog("Are you happy?");
		if(answer.equalsIgnoreCase("yes")) {
			JOptionPane.showMessageDialog(null,"Keep doing whatever you're doing" );
			
		}
		if(answer.equalsIgnoreCase("no")) {
			String answer2=	JOptionPane.showInputDialog(null,"Do you want to be happy?");
			if(answer2.equalsIgnoreCase("no")) {
				JOptionPane.showMessageDialog(null,"Keep doing whatever you're doing" );
			
		}
			if(answer2.equalsIgnoreCase("yes")) {
				JOptionPane.showMessageDialog(null,"Change something");
		}
		}

	}

}
