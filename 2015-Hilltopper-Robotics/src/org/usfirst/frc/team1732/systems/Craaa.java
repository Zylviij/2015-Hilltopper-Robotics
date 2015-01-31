package org.usfirst.frc.team1732.systems;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Solenoid;

public class Craaa
{
	/*/
	private Solenoid m_solenoid = new Solenoid(1);
	//*/
	
	/*/
	private CANTalon m_motor = new CANTalon(14);
	//*/
	
	/*/
	private Encoder m_encoder = new Encoder(8, 9);
	//*/
	
	//*/
	private DigitalInput m_limitTop = new DigitalInput(0);
	private DigitalInput m_limitBottom = new DigitalInput(1);
	//*/
	
	/**
	 * Constructs the Craaa
	 */
	Craaa()
	{

	}
	
	//*/
	public boolean[] getLimits() {
		return new boolean[]{m_limitTop.get(), m_limitBottom.get()};
	}
	//*/
	
	/**
	 * Sets the talon value
	 * @param speed sets the motor speed
	 */
	/*/
	public void setTalonValue(double speed)
	{
		m_motor.set(speed);
	}
	//*/
	
	/**
	 * Sets the solenoid value
	 * @param input turns the solenoid on or off
	 */
	/*/
	public void setSolenoidValue(boolean input)
	{
		m_solenoid.set(input);
	}
	//*/
	
	/**
	 * gets the encoder value
	 * @return
	 */
	/*/
	public double getEncoderValue()
	{
		return m_encoder.getDistance();
	}
	//*/
	
	/**
	* Makes the robit not kill people
	*/
	/*/
	public void makeSafe()
	{
		m_motor.set(0);
		m_motor.disable();
		
		m_solenoid.set(false);
		m_solenoid.free();
	}
	//*/
}
