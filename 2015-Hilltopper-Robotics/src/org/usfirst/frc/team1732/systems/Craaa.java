package org.usfirst.frc.team1732.systems;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Talon;

public class Craaa
{
	//Solenoid
	private Solenoid m_datSolenoidDoe=new Solenoid(0,0);
		//TODO: Find teh slot for dat solenoid
	
	//Motor
	private Talon m_datTalonDoe=new Talon(0);
		//TODO: Find teh slot for dat talon
	
	//Encoder
	private Encoder m_datEncoderDoe=new Encoder(0,0);
		//TODO: Find teh slot for dat encoder
	
	/**
	 * Constructs the Craäæ
	 */
	Craaa()
	{
		m_datEncoderDoe.setSamplesToAverage(20);
		m_datEncoderDoe.setDistancePerPulse(10);
	}
	
	/**
	 * Sets the talon value
	 * @param speed sets the motor speed
	 */
	public void setTalonValue(double speed)
	{
		m_datTalonDoe.set(speed);
	}
	
	/**
	 * Sets the solenoid value
	 * @param input turns the solenoid on or off
	 */
	public void setSolenoidValue(boolean input)
	{
		m_datSolenoidDoe.set(input);
	}
	
	/**
	 * gets the encoder value
	 * @return
	 */
	public double getEncoderValue()
	{
		return m_datEncoderDoe.getRate();
	}
	
	/**
	* Makes the robit not kill people
	*/
	public void makeSafe()
	{
		m_datTalonDoe.set(0);
		m_datTalonDoe.free();
		m_datTalonDoe.disable();
		
		m_datSolenoidDoe.set(false);
		m_datSolenoidDoe.free();
	}
	
}
