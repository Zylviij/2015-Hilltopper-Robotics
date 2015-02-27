package org.usfirst.frc.team1732.systems;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Servo;

public class Lift
{
	/*
	 * Make Actuators
	 */
	//*/
	private CANTalon m_motor = new CANTalon(11);
	//*/
	
	private Servo m_dropLeft = new Servo(1);
	private Servo m_dropRight = new Servo(0);
	
	/*
	 * Make Sensors
	 */
	//*/
	//private Encoder m_encoder = new Encoder(0, 1, false, Encoder.EncodingType.k4X);
	//*/
	
	/*
	 * Constants
	 */
	//*/
	private static final double FORWARD = 0.7;
	private static final double BACKWARD = -0.6;
	private static final double STOP = 0;
	private static final double MAXIMUM = 100;
	//*/
	
	/*
	 * Variables
	 */
	//*/
	private boolean intake;
	private double minimum = Double.MAX_VALUE;
	//*/
	
	public void init() {
		m_motor.enableControl();
		//m_encoder.reset();
	}
	
	//public double getEncoder() {
		//return m_encoder.get();
	//}
	
	/**
	 * control the lift from joysticks
	 * @param io
	 */
	//*/
	public void controlLift(IO io) {
		/*/
		if (io.getLift()) {
			intake = true;
		}
		if (intake && m_encoder.getDistance() < minimum + MAXIMUM) {
			m_motor.set(FORWARD);
		} else if (m_encoder.getDistance() > minimum) {
			intake = false;
			m_motor.set(BACKWARD);
		} else {
			m_motor.set(STOP);
		}
		//*/
		if (io.getLift()) m_motor.set(FORWARD);
		else if (io.getLeftArcade()) m_motor.set(BACKWARD);
		else m_motor.set(STOP);
		
		if (io.getDropJoy()) {
			m_dropLeft.set(.25);
			m_dropRight.set(1);

		}
		else {
			m_dropLeft.set(.75);
			m_dropRight.set(.5);

		}
				
		//if (m_encoder.getDistance() < minimum) {
		//	minimum = m_encoder.getDistance();
		//}
		
		//System.out.println("Encoder " + m_encoder.getRate());
		//System.out.println("Maximum: " + minimum);

	}
	//*/
	
	public double[] getServo() {
		return new double[]{m_dropLeft.getAngle(), m_dropRight.getAngle()};
	}
	
	/**
	 * Makes the robot Lift safe
	 */
	//*/
	public void makeSafe()
	{
		m_motor.set(0);
		m_motor.disable();
	}
	//*/
}
