package org.usfirst.frc.team1732.systems;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.Preferences;
import edu.wpi.first.wpilibj.Solenoid;

public class Intake 
{
	// motors
	private CANTalon m_motorLeft = new CANTalon(12);
	private CANTalon m_motorRight = new CANTalon(23);
	
	// solenoids
	private Solenoid m_solenoidRight = new Solenoid(1, 2);
	private Solenoid m_solenoidLeft = new Solenoid(1, 1);
	
	private static final double STOP = 0;
	private static double IN = 0.7;
	private static double OUT = -0.5;
	private static final double LEFT = -1;
	private static final double RIGHT = 1;
	
	Preferences prefs;
		
	public void init() {
		// init motors for use
		m_motorLeft.enableControl();
		m_motorRight.enableControl();
		/*
		 * Grab from Dashboard
		 */
		IN = prefs.getDouble("Intake In Speed", IN);
		OUT = prefs.getDouble("Intake Out Speed", OUT);
	}
	
	/**
	 * control the intake with joysticks and buttons
	 * @param io
	 */
	public void controlIntake(IO io) {		
		
		boolean in = io.getToteIn();
		boolean out = io.getToteOut();
		if (in && out) {
			m_motorLeft.set(STOP);
			m_motorRight.set(STOP);
		}
		else if (in) {
			m_motorLeft.set(LEFT * IN);
			m_motorRight.set(RIGHT * IN);
		}
		else if (out) {
			m_motorLeft.set(LEFT * OUT);
			m_motorRight.set(RIGHT * OUT);
		}
		else {
			m_motorLeft.set(STOP);
			m_motorRight.set(STOP);
		}
		
		
		boolean getIntakeExtend = io.getIntakeExtend();
		m_solenoidLeft.set(getIntakeExtend);
		m_solenoidRight.set(getIntakeExtend);
	}
	
	public void makeSafe()
	{
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