package org.usfirst.frc.team1732.systems;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.Solenoid;

public class Craaa
{
	/*
	 * Actuators
	 */
	private Solenoid m_solenoidOpen = new Solenoid(1, 0);
	
	private CANTalon m_motor = new CANTalon(14);
	
	/*
	 * Sensors
	 */
	//private Encoder m_encoder = new Encoder(2, 3);
	
	/*
	 * Constants
	 */
	private static final double UP = 1;
	private static final double UP_SLOW = 0.5;
	private static final double DOWN = -1;
	private static final double DOWN_SLOW = -0.5;
	private static final double SPEED = -1;
	private static final double STOP = 0;
	
	private static boolean m_lastDir = false; // false if down, true if up
	
	public void init() {
		// initalize motor
		m_motor.enableControl();
	}
	
	/**
	 * use the joysticks and buttons to control the craaa
	 * @param io
	 */
	public void controlCraaa(IO io) {
		boolean up = io.get00();
		boolean down = io.get10();
		if (up && down) {
			if (m_lastDir) {
				m_motor.set(UP * SPEED);
			} else {
				m_motor.set(DOWN * SPEED);
			}
		}
		else if (up) {
			m_lastDir = true;
			m_motor.set(UP_SLOW * SPEED);
		} else if (down) {
			m_lastDir = false;
			m_motor.set(DOWN_SLOW * SPEED);
		} else {
			m_motor.set(STOP);
		}
		boolean open = io.get20();
		m_solenoidOpen.set(open);
	}
	
	public void controlCraaa(double speed, boolean open) {
		m_motor.set(speed * SPEED);
		m_solenoidOpen.set(open);
	}
	
	public double getCANTalon() {
		return m_motor.getOutputCurrent();
	}
	
	public double getCANTalonHeat() {
		return m_motor.getTemp();
	}
	
	public void makeSafe()
	{
		m_motor.set(0);
		m_motor.disable();
		
		m_solenoidOpen.set(true);
		m_solenoidOpen.free();
	}
}
