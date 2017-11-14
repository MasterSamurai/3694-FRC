package org.usfirst.frc.team3694.robot;

import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.interfaces.Gyro;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Robot extends IterativeRobot {
	
	//motors
		public static Victor left = new Victor(0);
		public static Victor right = new Victor(1);
	
	//Joysticks
		public static Joystick leftStick = new Joystick(0);
		public static Joystick rightStick = new Joystick(1);
		public static Joystick manStick = new Joystick(2);
		
	//Buttons
		public static JoystickButton reverse = new JoystickButton(rightStick, 1);
	
	//timers
		Timer autoTimer = new Timer();
		
	//gyroscope
		private Gyro gyro;
		double kp = 0.03;
		
	//robotdrive for autonomous
		RobotDrive autonomous;
	
	//servos for camera mount
		Servo leftServo = new Servo(2);
		Servo rightServo = new Servo(3);
		
				
		
	@Override
	public void robotInit() {
		autonomous = new RobotDrive(left, right);
		CameraServer.getInstance().startAutomaticCapture();
	}
	
	@Override
	public void autonomousInit() {

	}
	
	@Override
	public void teleopPeriodic() {
		while (isEnabled() && isOperatorControl()) {
			while (leftStick.getY() > 0) {
				left.set(leftStick.getY() * leftStick.getY());
			}
			while (leftStick.getY() < 0) {
				left.set(-1 * leftStick.getY() * leftStick.getY());
			}
			while (rightStick.getY() > 0) {
				right.set(rightStick.getY() * rightStick.getY());
			}
			while (rightStick.getY() < 0) {
				right.set(-1 * rightStick.getY() * rightStick.getY());
			}
			while (manStick.getX() > 0) {
				rightServo.set(-1 * manStick.getX());
				leftServo.set(manStick.getX());
			}
			while (manStick.getX() < 0) {
				leftServo.set(manStick.getX());
				rightServo.set(-1 * leftStick.getX());
			}
			if (reverse.get() == true) {
				left.set(leftStick.getY() * -1);
				right.set(rightStick.getY() * -1);
			}
		}	
	}
	@Override
	public void autonomousPeriodic() {
	}
}