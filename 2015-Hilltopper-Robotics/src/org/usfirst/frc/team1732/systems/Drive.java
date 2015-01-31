package org.usfirst.frc.team1732.systems;

import edu.wpi.first.wpilibj.BuiltInAccelerometer;
import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Gyro;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.RobotDrive.MotorType;

public class Drive
{

	// motors
	private CANTalon m_leftFrontMotor = new CANTalon(3);
	private CANTalon m_rightFrontMotor = new CANTalon(2);
	private CANTalon m_leftBackMotor = new CANTalon(1);
	private CANTalon m_rightBackMotor = new CANTalon(0);
	
	// encoders
	private Encoder m_leftFrontEncoder = new Encoder(0, 1);
	private Encoder m_rightFrontEncoder = new Encoder(2, 3);
	private Encoder m_leftBackEncoder = new Encoder(4, 5);
	private Encoder m_rightBackEncoder = new Encoder(6, 7);

	// accel
	BuiltInAccelerometer m_accelerometer = new BuiltInAccelerometer();

	// gyro
	Gyro m_gyro = new Gyro(0);
	
	public double[] getEncoders() {
		return new double[]{
				m_leftFrontEncoder.getDistance(), 
				m_rightFrontEncoder.getDistance(),
				m_leftBackEncoder.getDistance(), 
				m_rightBackEncoder.getDistance()};
	}
	
	/*public double[][] getCANTalon() {
		return {
			{
				m_leftFrontMotor
			},
			{
					
			},
			{
				
			},
			{
				
			}
		};
	}*/
	
	public double getGyro() {
		return m_gyro.getAngle();
	}
	
	public double[] getAccels() {
		return new double[]{m_accelerometer.getX(), m_accelerometer.getY(), m_accelerometer.getZ()};
	}
	
	// drive
	private RobotDrive m_drive = new RobotDrive(m_leftFrontMotor, m_leftBackMotor, m_rightFrontMotor, m_rightBackMotor);
	
	public Drive()
	{
		m_drive.setInvertedMotor(MotorType.kFrontLeft, true);
		m_drive.setInvertedMotor(MotorType.kRearLeft, true);
	}
	
	/**
	 * Set the drive for auto.
	 * @param mag Magnitude
	 * @param dir Direction
	 * @param rot Rotation
	 */
	public void drive(double mag, double dir, double rot)
	{
		m_drive.mecanumDrive_Polar(mag, dir, rot);
	}
	
	/**
	 * Set the drive for tele.
	 * @param io: all input
	 */
	public void drive(IO io)
	{	
		if (io.getFinesseMode() == 1) {
			m_drive.mecanumDrive_Polar(0.3, 180, 0);
		} 
		else if (io.getFinesseMode() == 2) {
			m_drive.mecanumDrive_Polar(0.3, 0, 0);
		}
		else {
			if (!io.getShift())
			{
				// drive mecanum full speed
				if (io.getLeftArcade())
				{
					m_drive.arcadeDrive(io.getLeftX(), io.getLeftY());
				} 
				else if (io.getRightArcade())
				{
					m_drive.arcadeDrive(io.getRightX(), io.getRightY());
				}
				else
				{
					m_drive.tankDrive(io.getLeftY(), io.getRightY());
				}
			}
			else 
			{
				// drive mecanum full speed
				if (io.getLeftArcade())
				{
				m_drive.mecanumDrive_Polar(io.getLeftMagnitude(), io.getLeftDirection(), io.getLeftRotation());
				} 
				else if (io.getRightArcade())
				{
					m_drive.mecanumDrive_Polar(io.getRightMagnitude(), io.getRightDirection(), io.getRightRotation());
				}
				else
				{
					m_drive.mecanumDrive_Polar(io.getMagnitude(), io.getDirection(), io.getRotation());
				}
			}
		}
	}
	
	/**
	 * Make safe the drive train.
	 */
	public void makeSafe()
	{
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
