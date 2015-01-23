package org.usfirst.frc.team1732.systems;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Talon;

public class Lift
{
	/*
	 * Make Actuators
	 */
	private Talon m_liftMotor = new Talon(0); //TODO: set pwm
	private Solenoid m_releaseStackSolenoid = new Solenoid(0, 0); //TODO set solenoid number and can number
	
	/*
	 * Make Sensors
	 */
	private Encoder m_liftEncoder = new Encoder(0, 0); //TODO set DIOs
	
	/**
	 * Create Lift and set Encoder Samples
	 */
	Lift()
	{
		m_liftEncoder.setSamplesToAverage(20);
		m_liftEncoder.setDistancePerPulse(10);
	}
	
	/**
	 * Set Lift Motor speed
	 * @param speed
	 */
	public void setLift(double speed)
	{
		m_liftMotor.set(speed);
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
		m_liftMotor.set(0);
		m_liftMotor.free();
		m_liftMotor.disable();

		m_releaseStackSolenoid.set(false);
		m_releaseStackSolenoid.free();
	}
}
