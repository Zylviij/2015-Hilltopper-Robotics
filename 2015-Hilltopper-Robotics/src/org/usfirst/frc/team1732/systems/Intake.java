package org.usfirst.frc.team1732.systems;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Talon;

public class Intake 
{
	// motors
	private Talon m_rightIntakeMotor = new Talon(0);//TODO set pwm #
	private Talon m_leftIntakeMotor = new Talon(0);//TODO set pwm #
	
	// solenoids
	private Solenoid m_rightIntakeSolenoid = new Solenoid(0,0);//TODO set solenoid, cam #
	private Solenoid m_leftIntakeSolenoid = new Solenoid(0,0);//TODO set solenoid, cam #


	public void setrightIntakeMotor(double speed)
	{
		m_rightIntakeMotor.set(speed);
			
	}
	public void setleftIntakeMotor(double speed)
	{
		m_leftIntakeMotor.set(speed);
	}
	public void setrightIntakeSolenoid(boolean input)
	{
		m_rightIntakeSolenoid.set(input);
	}
	public void setleftIntakeSolenoid(boolean input)
	{
		m_leftIntakeSolenoid.set(input);
	}
}