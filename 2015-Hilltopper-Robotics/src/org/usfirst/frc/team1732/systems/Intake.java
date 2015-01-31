package org.usfirst.frc.team1732.systems;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.Solenoid;

public class Intake 
{
	// motors
	private CANTalon m_rightIntakeMotor = new CANTalon(7);
	private CANTalon m_leftIntakeMotor = new CANTalon(8);
	
	// solenoids
	private Solenoid m_rightIntakeSolenoid = new Solenoid(8);
	private Solenoid m_leftIntakeSolenoid = new Solenoid(7);

	/**
	 * @param speed boolean for solenoid setter
	 */
	public void setrightIntakeMotor(double speed)
	{
		m_rightIntakeMotor.set(speed);	
	}
	/**
	 * @param speed double for motor setter
	 */
	public void setleftIntakeMotor(double speed)
	{
		m_leftIntakeMotor.set(speed);
	}
	/**
	 * @param input boolean for solenoid setter
	 */
	public void setrightIntakeSolenoid(boolean input)
	{
		m_rightIntakeSolenoid.set(input);
	}
	/**
	 * @param input boolean for solenoid setter
	 */
	public void setleftIntakeSolenoid(boolean input)
	{
		m_leftIntakeSolenoid.set(input);
	}
	/**
	 * make safe the intake
	 */
	public void makeSafe()
	{
		m_rightIntakeMotor.set(0);
		m_rightIntakeMotor.disable();
		m_leftIntakeMotor.set(0);
		m_leftIntakeMotor.disable();
		m_rightIntakeSolenoid.set(false);
		m_rightIntakeSolenoid.free();
		m_leftIntakeSolenoid.set(false);
		m_leftIntakeSolenoid.free();
	}
}