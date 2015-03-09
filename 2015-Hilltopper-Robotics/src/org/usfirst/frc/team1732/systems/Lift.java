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
	private static final double UP = 1;
	private static final double UP_SLOW = 0.5;
	private static final double DOWN = -1;
	private static final double DOWN_SLOW = -0.5;
	private static final double SPEED = 1;
	private static final double STOP = 0;
	
	private static boolean m_lastDir = false; // true if up, false if down
	
	public void init() {
		m_motor.enableControl();
		/*
		 * Grab from Dashboard
		 */
	}
	
	public double getCANTalon() {
		return m_motor.getOutputCurrent();
	}
	
	public double getCANTalonHeat() {
		return m_motor.getTemp();
	}
	
	/**
	 * control the lift from joysticks
	 * @param io
	 */
	public void controlLift(IO io) {
		if (io.getLiftUp() && io.getLiftDown()) {
			if (m_lastDir) {
				m_motor.set(UP * SPEED);
			} else {
				m_motor.set(DOWN * SPEED);
			}
		}
		else if (io.getLiftUp()) {
			m_lastDir = true;
			m_motor.set(UP_SLOW * SPEED);
		} else if (io.getLiftDown()) {
			m_lastDir = false;
			m_motor.set(DOWN_SLOW * SPEED);
		} else {
			m_motor.set(STOP);
		}
		
		// set servos
		if (io.getDrop() || io.getOpenCraaa()) {
			m_dropLeft.set(0.25);
			m_dropRight.set(1);
		} else {
			m_dropLeft.set(.75);
			m_dropRight.set(0.5);

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
