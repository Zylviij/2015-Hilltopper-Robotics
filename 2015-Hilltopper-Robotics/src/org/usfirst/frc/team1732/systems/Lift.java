package org.usfirst.frc.team1732.systems;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Servo;

public class Lift
{
	/*
	 * Make Actuators
	 */
	//*/
	private CANTalon m_motor = new CANTalon(11);
	//*/
	
	private Servo m_drop = new Servo(0);
	
	/*
	 * Constants
	 */
	//*/
	private static final double FORWARD = 0.5;
	private static final double BACKWARD = -0.5;
	private static final double STOP = 0;
	private static final double MAXIMUM = 100;
	//*/
	
	/*
	 * Variables
	 */
	//*/
	private boolean intake;
	private double minimum = 0;
	//*/
	
	/*
	 * Make Sensors
	 */
	//*/
	private Encoder m_encoder = new Encoder(2, 3);
	//*/
	
	/**
	 * control the lift from joysticks
	 * @param io
	 */
	//*/
	public void controlLift(IO io) {
		if (io.getLift()) {
			intake = true;
		}
		if (intake && m_encoder.getDistance() < minimum + MAXIMUM) {
			m_motor.set(FORWARD);
		} else if (m_encoder.getDistance() > minimum) {
			intake = false;
			m_motor.set(BACKWARD);
		} else {
			m_motor.set(STOP);
		}
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
