package org.usfirst.frc.team1732.systems;

import edu.wpi.first.wpilibj.Talon;

public class Drive {
	private Talon leftMotor = new Talon(0);
	private Talon rightMotor = new Talon(1);
	
	/**
	 * Set the drive.
	 * @param left
	 * @param right
	 */
	public void drive(double left, double right) {
		leftMotor.set(left);
		rightMotor.set(right);
	}
	
	/**
	 * Make safe the drive train.
	 */
	public void makeSafe() {
		leftMotor.set(0);
		leftMotor.free();;
		leftMotor.disable();
		
		rightMotor.set(0);
		rightMotor.free();
		rightMotor.disable();
	}
}
