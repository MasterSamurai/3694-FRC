package org.MasterSamurai.Applications;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import org.usfirst.frc.team3694.robot.Robot;

//KeyListener for JFRAME
public class MyKeyListener extends KeyAdapter{
	//Detect key pressed, send it back to Robot.java
	public void keyPressed(KeyEvent evt) {
		if (evt.getKeyChar() == '0') {
			System.out.println("0");
			Robot.c = 0;
	    }
		if (evt.getKeyChar() == '1') {
			System.out.println("1");
			Robot.c = 1;
	    }
		if (evt.getKeyChar() == '2') {
			System.out.println("2");
			Robot.c = 2;
	    }
		if (evt.getKeyChar() == '3') {
			System.out.println("3");
			Robot.c = 3;
	    }
		if (evt.getKeyChar() == '4') {
			System.out.println("4");
			Robot.c = 4;
	    }
		if (evt.getKeyChar() == '5') {
			System.out.println("5");
			Robot.c = 5;
	    }
		if (evt.getKeyChar() == '6') {
			System.out.println("6");
			Robot.c = 6;
	    }
		if (evt.getKeyChar() == '7') {
			System.out.println("7");
			Robot.c = 7;
	    }
		if (evt.getKeyChar() == '8') {
			System.out.println("8");
			Robot.c = 8;
	    }
		if (evt.getKeyChar() == '9') {
			System.out.println("9");
			Robot.c = 9;
	    }
		
	}	  
}
//Code Ends Here