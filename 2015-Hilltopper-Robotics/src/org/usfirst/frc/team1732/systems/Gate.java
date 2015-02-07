package org.usfirst.frc.team1732.systems;

import edu.wpi.first.wpilibj.Solenoid;

public class Gate {
	
	Solenoid m_solenoid = new Solenoid(6);
	
	/**
	 * controls the gate with joysticks and buttons
	 * @param io
	 */
	public void controlGate(IO io) {
		m_solenoid.set(io.getGate());
	}
	
	/**
	 * Make Safe the Gate
	 */
	public void makeSafe() {
		m_solenoid.set(false);
		m_solenoid.free();
	}
	
}
