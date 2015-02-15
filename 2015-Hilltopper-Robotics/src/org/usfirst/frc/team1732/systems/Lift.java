package org.usfirst.frc.team1732.systems;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.Solenoid;

public class Lift
{
	/*
	 * Make Actuators
	 */
	//*/
	private CANTalon m_motor = new CANTalon(16);
	//*/
	
	private Servo m_drop = new Servo(0);
	
	/*/
	private DigitalInput m_topLimit = new DigitalInput(0);
	private DigitalInput m_botLimit = new DigitalInput(1);
	//*/
	
	//*/
	private static final double FORWARD = 0.5;
	private static final double BACKWARD = -0.5;
	private static final int TOP_LIMIT = 4000;
	private static final int BOT_LIMIT = 5;
	//*/

	private static final double SPEED_LIMIT = 0.5;
	private static final double STOP = 0;
	
	/*
	 * Make Sensors
	 */
	/*/
	private AnalogInput m_pot = new AnalogInput(2);
	//*/
	
	/**
	 * control the lift from joysticks
	 * @param io
	 */
	/*/
	public void controlLift(IO io) {
		
		if (io.getLift() || m_pot.getAverageValue() > TOP_LIMIT) {
			if (m_topLimit.get()) {
				m_motor.set(0);
			} else {
				m_motor.set(BACKWARD);
			}
		} else {
			if (m_botLimit.get() || m_pot.getAverageValue() < BOT_LIMIT) {
				m_motor.set(0);
			} else {
				m_motor.set(FORWARD);
			}
		}
		
		m_drop.set(io.getDrop());
	}
	//*/
	
	public void testForTheWanagon(boolean motorUp, boolean motorDown, boolean servoUp, boolean servoDown) {
		if (motorUp) {
			m_motor.set(SPEED_LIMIT);
		} else if (motorDown) {
			m_motor.set(-1 * SPEED_LIMIT);
		} else {
			m_motor.set(STOP);
		}
		
		if (servoUp) {
			
		} else if(servoDown) {
			
		}
	}
	
	/**
	 * distance of pot
	 * @return pot [5...4000]
	 */
	/*/
	public int getLiftPot() {
		return m_pot.getAverageValue();
	}
	//*/
	
	/**
	 * Makes the robot Lift safe
	 */
	//*/
	public void makeSafe()
	{
		m_motor.set(0);
		m_motor.disable();
	}
	//*/
}
