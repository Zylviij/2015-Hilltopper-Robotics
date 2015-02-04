package org.usfirst.frc.team1732.systems;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Solenoid;

public class Lift
{
	/*
	 * Make Actuators
	 */
	/*/
	private CANTalon m_motor = new CANTalon(16);
	//*/
	
	/*/
	private Solenoid m_releaseStackSolenoid = new Solenoid(4);
	//*/
	
	/*
	 * Make Sensors
	 */
	//*/
	private AnalogInput m_pot = new AnalogInput(2);
	//*/
	
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
	/*/
	public void setLift(double speed)
	{
		m_motor.set(speed);
	}
	//*/
	
	/**
	 * Set Hook Solenoid
	 * @param input
	 */
	/*/
	public void setHooks(boolean input)
	{
		m_releaseStackSolenoid.set(input);
	}
	//*/
	
	/**
	 * Gets Pot Values
	 * @return distance of pot
	 */
	//*/
	public double getLiftPot()
	{
		return m_pot.getAverageVoltage();
	}
	//*/
	
	/**
	 * Makes the robot Lift safe
	 */
	/*/
	public void makeSafe()
	{
		m_motor.set(0);
		m_motor.disable();

		//m_releaseStackSolenoid.set(false);
		//m_releaseStackSolenoid.free();
	}
	//*/
}
