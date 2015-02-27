package org.usfirst.frc.team1732.systems;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Ultrasonic;

public class Intake 
{
	// motors
	//*/
	private CANTalon m_motorLeft = new CANTalon(12);
	private CANTalon m_motorRight = new CANTalon(23);
	//*/
	
	// solenoids
	//*/
	private Solenoid m_solenoidRight = new Solenoid(1, 2);
	private Solenoid m_solenoidLeft = new Solenoid(1, 1);
	//*/
	
	//*/
	private static final double STOP = 0;
	private static final double SPEED = 0.5;
	private static final double LEFT = -1;
	private static final double RIGHT = 1;
	//*/
		
	public void init() {
		m_motorLeft.enableControl();
		m_motorRight.enableControl();
	}
	
	/**
	 * control the intake with joysticks and buttons
	 * @param io
	 */
	//*/
	public void controlIntake(IO io) {
		if (io.getIntakeInJoy() && io.getIntakeOutJoy()) {
			m_motorLeft.set(LEFT * STOP);
			m_motorRight.set(RIGHT * STOP);
		}
		else if (io.getIntakeInJoy()) {
			m_motorLeft.set(LEFT * SPEED);
			m_motorRight.set(RIGHT * SPEED);
		}
		else if (io.getIntakeOutJoy()) {
			m_motorLeft.set(-1 * LEFT * SPEED);
			m_motorRight.set(-1 * RIGHT * SPEED);
		}
		else {
			m_motorLeft.set(LEFT * STOP);
			m_motorRight.set(RIGHT * STOP);
		}
		
		// extends intakes
		boolean solenoid = io.getIntakeSolenoidJoy();
		m_solenoidLeft.set(!solenoid);
		m_solenoidRight.set(!solenoid);
	}
	//*/
	
	/**
	 * make safe the intake
	 */
	//*/
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
	//*/
}