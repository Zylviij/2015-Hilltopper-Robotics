package org.usfirst.frc.team1732.systems;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Talon;

public class Lift
{
	private Talon m_liftMotor = new Talon(0); //TODO: set pwm
	private Solenoid m_releaseStackSolenoid = new Solenoid(0, 0); //TODO set solenoid number and can number
	private Encoder m_liftEncoder = new Encoder(0, 0); //TODO set DIOs
	
	Lift()
	{
		m_liftEncoder.setSamplesToAverage(20);
		m_liftEncoder.setDistancePerPulse(10);
	}
	
	public void setLift(double speed)
	{
		m_liftMotor.set(speed);
	}
	
	public void setHooks(boolean input)
	{
		m_releaseStackSolenoid.set(input);
	}
	
	public double getLiftEncoder()
	{
		return m_liftEncoder.getDistance();
	}
}
