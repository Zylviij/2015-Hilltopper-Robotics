package org.usfirst.frc.team1732.systems;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.Solenoid;

public class Intake 
{
	// motors
	//*/
	private CANTalon m_motor = new CANTalon(15);
	//*/
	
	// solenoids
	//*/
	private Solenoid m_solenoid = new Solenoid(2);
	//*/
	
	//*/
	private static final double IN_SPEED = 1;
	private static final double OUT_SPEED = -1;
	//*/
	
	/**
	 * control the intake with joysticks and buttons
	 * @param io
	 */
	public void controlIntake(IO io) {
		if (io.getIntakeIn()) {
			m_motor.set(IN_SPEED);
		} else if (io.getIntakeOut()) {
			m_motor.set(OUT_SPEED);
		} else {
			m_motor.set(0);
		}
		
		m_solenoid.set(io.getIntakeDirection());
			
	}
	
	/**
	 * make safe the intake
	 */
	//*/
	public void makeSafe()
	{
		m_motor.set(0);
		m_motor.disable();
		m_solenoid.set(false);
		m_solenoid.free();
	}
	//*/
}