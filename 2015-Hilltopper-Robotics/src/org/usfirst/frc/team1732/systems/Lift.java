package org.usfirst.frc.team1732.systems;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Preferences;
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
	private Encoder m_encoder = new Encoder(0, 1);
	
	/*
	 * Constants
	 */
	private static double SPEED = 0.5;
	private static double maximum = 1000;
	private static double minimum = Double.MAX_VALUE;
	private static double DOWN_DRIFT = -0.05;
	
	Preferences prefs;
	
	public void init() {
		m_motor.enableControl();
		/*
		 * Grab from Dashboard
		 */
		maximum = prefs.getDouble("Lift Maximum", maximum);
		SPEED = prefs.getDouble("Lift Speed", SPEED);
		DOWN_DRIFT = prefs.getDouble("Lift Down Drift Speed", DOWN_DRIFT);
	}
	
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
	}
	
	/**
	 * control the lift from joysticks
	 * @param io
	 */
	public void controlLift(IO io) {
		
		if (getEncoder() < minimum) minimum = getEncoder();
		
		if (io.getLiftTote()) {
			m_motor.set((maximum - getDistanceFromBot()) * SPEED);
		} else {
			m_motor.set(((minimum - getDistanceFromBot()) * SPEED) + DOWN_DRIFT);
		}
		
		// set servos
		if (io.getDropToteStack()) {
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
