package org.usfirst.frc.team1732.systems;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.Servo;

public class Lift
{
	/*
	 * Make Actuators
	 */
	private CANTalon m_motor = new CANTalon(11);
	
	private Servo m_dropLeft = new Servo(1);
	private Servo m_dropRight = new Servo(0);
	
	/*
	 * Make Sensors
	 */
	//private Encoder m_encoder = new Encoder(0, 1);
	
	/*
	 * Constants
	 */
	private static double SPEED = -1;
		
	public void init() {
		m_motor.enableControl();
		/*
		 * Grab from Dashboard
		 */
	}
	
	public double getCANTalon() {
		return m_motor.getOutputCurrent();
	}
	
	/*
	public double getEncoder() {
		return -1 * m_encoder.get();
	}
	
	public double getMinimum() {
		return minimum;
	}
	
	public double getDistanceFromBot() {
		return getEncoder() - minimum;
	}
	
	public double getPercentageToTop() {
		return getDistanceFromBot() / maximum;
	}*/
	
	/**
	 * control the lift from joysticks
	 * @param io
	 */
	public void controlLift(IO io) {
		
		/*if (getEncoder() < minimum) minimum = getEncoder();
		
		if (io.getLiftTote()) {
			m_motor.set((maximum - getDistanceFromBot()) * SPEED);
		} else {
			m_motor.set(((minimum - getDistanceFromBot()) * SPEED) + DOWN_DRIFT);
		}*/
		
		if (io.getLiftTote()) {
			m_motor.set(SPEED);
		} else if (io.getDropToteStack()) {
			m_motor.set(-1 * SPEED);
		} else {
			m_motor.set(0);
		}
		
		// set servos
		if (io.getDrop()) {
			m_dropLeft.set(0.625);
			m_dropRight.set(0.5);
		} else {
			m_dropLeft.set(1);
			m_dropRight.set(0);

		}

	}
	
	/**
	 * Makes the robot Lift safe
	 */
	public void makeSafe()
	{
		m_motor.set(0);
		m_motor.disable();
	}
}
