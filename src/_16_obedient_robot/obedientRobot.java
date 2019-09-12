package _16_obedient_robot;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class obedientRobot {
	static Robot rob=new Robot();
	
	
	public static void main(String[] args) {
		String shape= JOptionPane.showInputDialog(null,"which shape do you want");
		rob.penDown();
		rob.setSpeed(55);
		if(shape.equals("Square")) {
			drawSquare();
		}
		else if(shape.equals("Triangle")) {
			drawtriangle();
		}
		
		drawcircle();
	}
	
	public static void drawSquare() {
		for(int i=0;i<4;i++) {
	
		
		rob.move(100);
		rob.turn(90);
		
		
	}
	}
	public static void drawtriangle() {
		for(int i=0;i<3;i++) {
			
			rob.move(100);
			rob.turn(120);
			
		}
	}
	public static void drawcircle() {
		for(int i=0;i<360;i++) {
			rob.move(4);
			rob.turn(1);
		}
	}
}
