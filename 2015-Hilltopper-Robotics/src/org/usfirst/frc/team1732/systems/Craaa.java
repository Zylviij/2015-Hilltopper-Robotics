package org.usfirst.frc.team1732.systems;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Preferences;
import edu.wpi.first.wpilibj.Solenoid;

public class Craaa
{
	/*
	 * Actuators
	 */
	private Solenoid m_solenoidStow = new Solenoid(3);
	private Solenoid m_solenoidOpen = new Solenoid(0);
	
	private CANTalon m_motor = new CANTalon(14);
	
	/*
	 * Sensors
	 */
	private Encoder m_encoder = new Encoder(2, 3);
	
	/*
	 * Constants
	 */
	private static double minimum = Double.MAX_VALUE;
	private static double maximum = 2000;
	private static double UP_SPEED = 0.05;
	private static double DOWN_SPEED = -0.05;
	private static double SPEED = 0.5;
	
	Preferences prefs;
	
	public void init() {
		// initalize motor
		m_motor.enableControl();
		/*
		 * Grab from Dashboard
		 */
		UP_SPEED = prefs.getDouble("Craaa Up Speed", UP_SPEED);
		DOWN_SPEED = prefs.getDouble("Craaa Down Speed", DOWN_SPEED);
		SPEED = prefs.getDouble("Craaa Speed", SPEED);
		maximum = prefs.getDouble("Craaa Maximum", maximum);
	}
	
	public double getEncoder() {
		return m_encoder.get();
	}
	public double getMinumum() {
		return minimum;
	}
	
	public double getDistanceFromBot() {
		return getEncoder() - minimum;
	}
	
	public double getPercentageToTop() {
		return getDistanceFromBot() / maximum;
	}
	
	/**
	 * use the joysticks and buttons to control the craaa
	 * @param io
	 */
	public void controlCraaa(IO io) {
		/*
		 * Update Minimum
		 */
		if (getEncoder() < minimum) {
			minimum = getEncoder();
		}
		
		m_solenoidOpen.set(io.getOpenCraaa());
		m_solenoidStow.set(io.getCraaaAngle());
		
		if (io.getCraaaUp()) {
			minimum += UP_SPEED;
		} else if (io.getCraaaDown()) {
			minimum += DOWN_SPEED;
		}
		
		m_motor.set((io.getCraaaHeight() - getPercentageToTop()) * SPEED);
		
	}
	
	public void makeSafe()
	{
		m_motor.set(0);
		m_motor.disable();
		
		m_solenoidOpen.set(false);
		m_solenoidOpen.free();
		
		m_solenoidStow.set(false);
		m_solenoidStow.free();
	}
}
