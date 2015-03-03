package org.usfirst.frc.team1732.systems;

import edu.wpi.first.wpilibj.BuiltInAccelerometer;
import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.Gyro;
import edu.wpi.first.wpilibj.Preferences;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.RobotDrive.MotorType;

public class Drive
{
	/*
	 * Actuators
	 */
	// motors
	private CANTalon m_leftFrontMotor = new CANTalon(24);
	private CANTalon m_rightFrontMotor = new CANTalon(21);
	private CANTalon m_leftBackMotor = new CANTalon(13);
	private CANTalon m_rightBackMotor = new CANTalon(22);
	
	// drive
	private RobotDrive m_drive = new RobotDrive(m_leftFrontMotor, m_leftBackMotor, m_rightFrontMotor, m_rightBackMotor);
	
	/*
	 * Sensors
	 */
	// accel
	BuiltInAccelerometer m_accelerometer = new BuiltInAccelerometer();
	
	// gyro
	Gyro m_gyro = new Gyro(0);
		
	/*
	 * Constants
	 */
	private static double strafeSpeed = 0.5;
	
	Preferences prefs;
	
	/**
	 * organizes values of talons for dashboard
	 * @return values for dashboard
	 */
	public double[][] getCANTalon() {
		return new double[][]{
			{
				m_leftFrontMotor.getOutputCurrent(),
				m_leftFrontMotor.getTemp()
			},
			{
				m_rightFrontMotor.getOutputCurrent(),
				m_rightFrontMotor.getTemp()
			},
			{
				m_leftBackMotor.getOutputCurrent(),
				m_leftBackMotor.getTemp()
			},
			{
				m_rightBackMotor.getOutputCurrent(),
				m_rightBackMotor.getTemp()
			}
		};
	}
	
	/**
	 * gets gyro value for dashboard
	 * @return gyro value
	 */
	public double getGyro() { return m_gyro.getAngle(); }
	
	/**
	 * gets and oraganizes values for dashboard
	 * @return oraganized values for dashboard
	 */
	public double[] getAccels() { return new double[]{m_accelerometer.getX(), m_accelerometer.getY(), m_accelerometer.getZ()}; }

	public void init() {
		// enables
		m_leftFrontMotor.enableControl();
		m_rightFrontMotor.enableControl();
		m_leftBackMotor.enableControl();
		m_rightBackMotor.enableControl();
		
		// inverts left side motors
		m_drive.setInvertedMotor(MotorType.kFrontLeft, true);
		m_drive.setInvertedMotor(MotorType.kRearLeft, true);
	
		/*
		 * Grab from dashboard
		 */
		strafeSpeed = prefs.getDouble("Strafe Speed", strafeSpeed);
		
	}

	public void drive(double mag, double dir, double rot) {
		m_drive.mecanumDrive_Polar(mag, dir, rot);
	}
	
	public void drive(IO io) {	
		
		if (io.getFinesseMode() == -1) { m_drive.mecanumDrive_Polar(strafeSpeed, 270, 0); } 
		else if (io.getFinesseMode() == 1) { m_drive.mecanumDrive_Polar(strafeSpeed, 90, 0); }
		else {
			int arcade = io.getArcade();
			if (!io.getCartestian()) {
				if (arcade == -1) { m_drive.mecanumDrive_Polar(io.getLeftMagnitude(), io.getLeftDirection(), io.getLeftRotation()); } 
				else if (arcade == 1) { m_drive.mecanumDrive_Polar(io.getRightMagnitude(), io.getRightDirection(), io.getRightRotation()); }
				else if (arcade == 0) {	m_drive.mecanumDrive_Polar(io.getMagnitude(), io.getDirection(), io.getRotation()); }
				else { System.out.println("Error: Arcade button meathod not working properly!"); }
			} else {
				if (arcade == -1) { m_drive.mecanumDrive_Cartesian(io.getLeftX(), io.getLeftY(), io.getLeftRot(), getGyro()); }
				else if (arcade == 1) { m_drive.mecanumDrive_Cartesian(io.getRightX(), io.getRightY(), io.getRightRot(), getGyro()); }
				else if (arcade == 0) { m_drive.mecanumDrive_Cartesian(io.getX(), io.getY(), io.getRotation(), getGyro()); }
				else { System.out.println("Error: Arcade button meathod not working properly!"); }
			}
		}
	}

	public void makeSafe() {
		m_leftFrontMotor.set(0);
		m_leftFrontMotor.disable();
		
		m_rightFrontMotor.set(0);
		m_rightFrontMotor.disable();

		m_leftBackMotor.set(0);
		m_leftBackMotor.disable();
		
		m_rightBackMotor.set(0);
		m_rightBackMotor.disable();
		
	}
}
