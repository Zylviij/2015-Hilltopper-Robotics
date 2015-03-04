package org.usfirst.frc.team1732.systems;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.Solenoid;

public class Craaa
{
	/*
	 * Actuators
	 */
	private Solenoid m_solenoidStow = new Solenoid(1, 0);
	private Solenoid m_solenoidOpen = new Solenoid(1, 3);
	
	private CANTalon m_motor = new CANTalon(14);
	
	/*
	 * Sensors
	 */
	//private Encoder m_encoder = new Encoder(2, 3);
	
	/*
	 * Constants
	 */
	private static double UP_SPEED = 1;
	private static double DOWN_SPEED = -0.5;
	private static double SPEED = -1;
	private static double STOP = 0;
	
	
	public void init() {
		// initalize motor
		m_motor.enableControl();
	}
	
	/**
	 * use the joysticks and buttons to control the craaa
	 * @param io
	 */
	public void controlCraaa(IO io) {
		if (io.getCraaaUp()) {
			m_motor.set(UP_SPEED * SPEED);
		} else if (io.getCraaaDown()) {
			m_motor.set(DOWN_SPEED * SPEED);
		} else {
			m_motor.set(STOP);
		}
		m_solenoidOpen.set(io.getOpenCraaa());
		m_solenoidStow.set(io.getCraaaAngle());
	}
	
	public void controlCraaa(double speed, boolean open, boolean active) {
		m_motor.set(speed * SPEED);
		m_solenoidOpen.set(open);
		m_solenoidStow.set(!active);
	}
	
	public double getCANTalon() {
		return m_motor.getOutputCurrent();
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
