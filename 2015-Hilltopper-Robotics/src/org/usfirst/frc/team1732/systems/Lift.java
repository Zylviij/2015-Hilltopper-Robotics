package org.usfirst.frc.team1732.systems;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.Solenoid;

public class Lift
{
	/*
	 * Make Actuators
	 */
	private CANTalon m_motor = new CANTalon(11);
	
	private Servo m_dropLeft = new Servo(1);
	private Servo m_dropRight = new Servo(0);
	
	private CANTalon m_motorLeft = new CANTalon(12);
	private CANTalon m_motorRight = new CANTalon(23);
	
	// solenoids
	private Solenoid m_solenoidRight = new Solenoid(1, 2);
	private Solenoid m_solenoidLeft = new Solenoid(1, 1);

	
	/*
	 * Make Sensors
	 */
	//private Encoder m_encoder = new Encoder(0, 1);
	
	/*
	 * Constants
	 */
	// lift
	private static final double UP = 1;
	private static final double UP_SLOW = 0.5;
	private static final double DOWN = -1;
	private static final double DOWN_SLOW = -0.5;
	private static final double LIFT_SPEED = 1;
	
	// flippers
	private static final double RIGHT_OPEN = 1;
	private static final double RIGHT_CLOSED = 0.5;
	private static final double LEFT_OPEN = 0.25;
	private static final double LEFT_CLOSED = 0.75;
	
	// rollers
	private static final double ROLLER_SPEED = -1;
	private static final double IN = 1;
	private static final double IN_SLOW = 0.5;
	private static final double OUT = -1;
	private static final double OUT_SLOW = -0.5;

	// reused
	private static final double STOP = 0;
	
	// direction variables
	private static boolean m_lastDirLift = false; // true if up, false if down
	private static boolean m_lastDirRollers = false; // true if up, false if down
	
	// state variables
	private static boolean m_default = true;
	private static boolean m_humanPlayer = false;
	private static boolean m_centreTote = false;
	private static boolean m_latch = false;
	private static boolean m_drop = false;
	private static boolean m_readyForLift = false;
	private static boolean m_out = false;
	
	public void init() {
		m_motor.enableControl();
		m_motorLeft.enableControl();
		m_motorRight.enableControl();
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
		// auto
		if (io.get21()) {
			boolean hp = io.get01();
			boolean lift = io.get11();
			boolean out = io.get02();
			boolean in = io.get12();
		}
		// manual
		else {
			// lift
			boolean up = io.get02();
			boolean down = io.get12();
			if (up && down) {
				if (m_lastDirLift) {
					m_motor.set(UP * LIFT_SPEED);
				} else {
					m_motor.set(DOWN * LIFT_SPEED);
				}
			}
			else if (up) {
				m_lastDirLift = true;
				m_motor.set(UP_SLOW * LIFT_SPEED);
			} else if (down) {
				m_lastDirLift = false;
				m_motor.set(DOWN_SLOW * LIFT_SPEED);
			} else {
				m_motor.set(STOP);
			}
			
			// intake arms
			boolean extend = io.get23();
			m_solenoidLeft.set(extend);
			m_solenoidRight.set(extend);
			
			// rollers
			boolean in = io.get03();
			boolean out = io.get13();
			if (in && out) {
				if (m_lastDirRollers) {
					m_motor.set(IN * ROLLER_SPEED);
				} else {
					m_motor.set(OUT * ROLLER_SPEED);
				}
			}
			else if (in) {
				m_lastDirRollers = true;
				m_motor.set(IN_SLOW * ROLLER_SPEED);
			} else if (out) {
				m_lastDirRollers = false;
				m_motor.set(OUT_SLOW * ROLLER_SPEED);
			} else {
				m_motor.set(STOP);
			}
		}
		
		boolean drop = io.get22();
		
		// set servos
		if (drop) {
			m_dropLeft.set(LEFT_OPEN);
			m_dropRight.set(RIGHT_OPEN);
		} else {
			m_dropLeft.set(LEFT_CLOSED);
			m_dropRight.set(RIGHT_CLOSED);

		}
	}
	
	/**
	 * Makes the robot Lift safe
	 */
	public void makeSafe()
	{
		m_motor.set(0);
		m_motor.disable();
		
		m_motorLeft.set(0);
		m_motorLeft.disable();
		
		m_motorRight.set(0);
		m_motorRight.disable();
		
		m_solenoidLeft.set(false);
		m_solenoidRight.set(false);
		
		m_solenoidLeft.free();
		m_solenoidRight.free();
	}
}
