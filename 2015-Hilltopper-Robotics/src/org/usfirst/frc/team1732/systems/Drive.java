package org.usfirst.frc.team1732.systems;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.RobotDrive.MotorType;
import edu.wpi.first.wpilibj.Talon;

public class Drive
{
	// motors
	private Talon m_leftFrontMotor = new Talon(3);
	private Talon m_rightFrontMotor = new Talon(2);
	private Talon m_leftBackMotor = new Talon(1);
	private Talon m_rightBackMotor = new Talon(0);

	// drive
	private RobotDrive m_drive = new RobotDrive(m_leftFrontMotor, m_leftBackMotor, m_rightFrontMotor, m_rightBackMotor);
	
	/**
	 * Set the drive.
	 * @param io: all input
	 */
	public void drive(IO io)
	{
		m_drive.setInvertedMotor(MotorType.kFrontLeft, true);
		m_drive.setInvertedMotor(MotorType.kRearLeft, true);
				
		// drive mecanum
		if (io.getLeftArcade())
		{
		m_drive.mecanumDrive_Polar(io.getLeftMagnitude(), io.getLeftDirection(), io.getLeftRotation());
		} 
		else if (io.getRightArcade())
		{
			m_drive.mecanumDrive_Polar(io.getRightMagnitude(), io.getRightDirection(), io.getRightRotation());
		}
		else
		{
			m_drive.mecanumDrive_Polar(io.getMagnitude(), io.getDirection(), io.getRotation());
		}
	}
	
	/**
	 * Make safe the drive train.
	 */
	public void makeSafe()
	{
		m_leftFrontMotor.set(0);
		m_leftFrontMotor.free();
		m_leftFrontMotor.disable();
		
		m_rightFrontMotor.set(0);
		m_rightFrontMotor.free();
		m_rightFrontMotor.disable();

		m_leftBackMotor.set(0);
		m_leftBackMotor.free();
		m_leftBackMotor.disable();
		
		m_rightBackMotor.set(0);
		m_rightBackMotor.free();
		m_rightBackMotor.disable();
	}

}
