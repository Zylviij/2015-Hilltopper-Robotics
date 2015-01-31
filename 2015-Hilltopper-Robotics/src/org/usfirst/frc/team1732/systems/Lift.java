package org.usfirst.frc.team1732.systems;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Solenoid;

public class Lift
{
	/*
	 * Make Actuators
	 */
	private CANTalon m_motor = new CANTalon(7);
	private Solenoid m_releaseStackSolenoid = new Solenoid(7);
	
	/*
	 * Make Sensors
	 */
	private Encoder m_liftEncoder = new Encoder(9, 10);
	
	/**
	 * Create Lift and set Encoder Samples
	 */
	Lift()
	{

	}
	
	/**
	 * Set Lift Motor speed
	 * @param speed
	 */
	public void setLift(double speed)
	{
		m_motor.set(speed);
	}
	
	/**
	 * Set Hook Solenoid
	 * @param input
	 */
	public void setHooks(boolean input)
	{
		m_releaseStackSolenoid.set(input);
	}
	
	/**
	 * Gets Encoder Values
	 * @return distance of encoder
	 */
	public double getLiftEncoder()
	{
		return m_liftEncoder.getDistance();
	}
	
	/**
	 * Makes the robot Lift safe
	 */
	public void makeSafe()
	{
		m_motor.set(0);
		m_motor.disable();

		m_releaseStackSolenoid.set(false);
		m_releaseStackSolenoid.free();
	}
}
