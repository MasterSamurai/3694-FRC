/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team3694.robot;

import Subsystems.DriveTrain;
import Subsystems.Sensors;
import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


public class Robot extends IterativeRobot {
	//Smart Dashboard
	private static final String crossLine = "Cross the Line";
	private static final String switchLeft = "far Left putting cube into switch";
	private static final String switchMiddle = "middle putting cube into switch";
	private static final String switchRight = "far Right putting cube into switch";
	private String m_autoSelected;
	private SendableChooser<String> m_chooser = new SendableChooser<>();
	
	//Subsystems n' stuff
	OI Interface = new OI();
	DriveTrain drivetrain = new DriveTrain();
	Sensors sensors = new Sensors();
	
	//FMS
	String gameData;
	
	
	@Override
	public void robotInit() {
		//Smart Dashboard
		m_chooser.addDefault("Cross the Line", crossLine);
		m_chooser.addObject("far Left putting cube into switch", switchLeft);
		m_chooser.addObject("Middle putting cube into switch", switchMiddle);
		m_chooser.addObject("far Right putting cube into switch", switchRight);
		SmartDashboard.putData("Auto choices", m_chooser);
		
		//FMS
		gameData = DriverStation.getInstance().getGameSpecificMessage();
	}

	
	@Override
	public void autonomousInit() {
		m_autoSelected = m_chooser.getSelected();
		System.out.println("Auto selected: " + m_autoSelected);
	}
	
	//This function is called periodically during autonomous.
	@Override
	public void autonomousPeriodic() {
		switch (m_autoSelected) {
			case crossLine:
				default:
				// Put default auto code here
				break;
			case switchLeft:
				if(gameData.charAt(0) == 'L')
				{
					//Put left auto code here
				} 
				else {
					//Put right auto code here
				}
				break;
			case switchMiddle:
				if(gameData.charAt(0) == 'L')
				{
					//Put left auto code here
				} 
				else {
					//Put right auto code here
				}
				break;
			case switchRight:
				if(gameData.charAt(0) == 'L')
				{
					//Put left auto code here
				} 
				else {
					//Put right auto code here
				}
				break;	
		}
	}

	//This function is called periodically during operator control.
	@Override
	public void teleopPeriodic() {
		while (isOperatorControl() && isEnabled()) {
			
		}
	}

	
    //This function is called periodically during test mode.
	@Override
	public void testPeriodic() {
	}
}