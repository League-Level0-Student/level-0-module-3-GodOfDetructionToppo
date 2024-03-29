
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _06_birthday_reminder;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "May 24th";
		String dadsBirthday = "October 12th";
		String myBirthday = "November 28th";

		// 2. Find out which birthday the user wants and and store their response in a variable
	String birthday= JOptionPane.showInputDialog(null,"what birthday do you want");
		// 3. Print out what the user typed
		JOptionPane.showMessageDialog(null,"you put in: " + birthday);
		// 4. if user asked for "mom"
			//print mom's birthday
		if(birthday.equals("mom")|| birthday.equals("Mom")) {
			JOptionPane.showMessageDialog(null,momsBirthday);
		}
		// 5. if user asked for "dad"
			// print dad's birthday
		else if(birthday.equals("dad")|| birthday.equals("Dad")) {
			JOptionPane.showMessageDialog(null,dadsBirthday);
		}
		// 6. if user asked for your name
			// print myBirthday
		else if(birthday.equals("your")|| birthday.equals("Your")) {
			JOptionPane.showMessageDialog(null,myBirthday);
		}
		//7. otherwise print "Sorry, i don't remember that person's birthday!"
		else {
			JOptionPane.showMessageDialog(null,"Sorry,I don't remember that person birthday");
		}
	}
}
