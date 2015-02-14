package org.usfirst.frc.team1732.systems;

import java.util.Collections;

import edu.wpi.first.wpilibj.BuiltInAccelerometer;
import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.CANTalon.ControlMode;
import edu.wpi.first.wpilibj.Gyro;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.RobotDrive.MotorType;

public class Drive
{

	//*/ motors
	private CANTalon m_leftFrontMotor = new CANTalon(13);
	private CANTalon m_rightFrontMotor = new CANTalon(12);
	private CANTalon m_leftBackMotor = new CANTalon(11);
	private CANTalon m_rightBackMotor = new CANTalon(10);
	//*/

	//*/ accel
	BuiltInAccelerometer m_accelerometer = new BuiltInAccelerometer();
	//*/
	
	//*/ gyro
	Gyro m_gyro = new Gyro(0);
	//*/
	
	public double getAveEncoder() {
		double[] encoders=getEncoders();
		return (encoders[0] + encoders[1] + encoders[2] + encoders[3]) / 4;
	}
	
	public double[] getEncoders() {
		return new double[]{
				m_leftFrontMotor.getEncPosition(),
				m_rightFrontMotor.getEncPosition(),
				m_leftBackMotor.getEncPosition(),
				m_rightBackMotor.getEncPosition()
		};
	}
	
	//*/ drive
	private RobotDrive m_drive = new RobotDrive(m_leftFrontMotor, m_leftBackMotor, m_rightFrontMotor, m_rightBackMotor);
	//*/
	
	private static final double SLOW = 0.5;
	
	/**
	 * organizes values of talons for dashboard
	 * @return values for dashboard
	 */
	//*/
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
	//*/
	
	/**
	 * gets gyro value for dashboard and catestian
	 * @return gyro value
	 */
	//*/
	public double getGyro() {
		return m_gyro.getAngle();
	}
	//*/
	
	/**
	 * gets and oraganizes values for dashboard
	 * @return oraganized values for dashboard
	 */
	//*/
	public double[] getAccels() {
		return new double[]{m_accelerometer.getX(), m_accelerometer.getY(), m_accelerometer.getZ()};
	}
	//*/
	
	/**
	 * start the motors
	 */
	//*/
	public void teleopInit() {
		m_leftFrontMotor.enableControl();
		m_rightFrontMotor.enableControl();
		m_leftBackMotor.enableControl();
		m_rightBackMotor.enableControl();
		
		m_leftFrontMotor.changeControlMode(ControlMode.Speed);
		m_rightFrontMotor.changeControlMode(ControlMode.Speed);
		m_leftBackMotor.changeControlMode(ControlMode.Speed);
		m_rightBackMotor.changeControlMode(ControlMode.Speed);
		
		m_drive.setInvertedMotor(MotorType.kFrontLeft, true);
		m_drive.setInvertedMotor(MotorType.kRearLeft, true);
	
	}
	//*/
	
	/**
	 * Set the drive for auto.
	 * @param mag Magnitude
	 * @param dir Direction
	 * @param rot Rotation
	 */
	public void drive(double mag, double dir, double rot)
	{
		m_drive.mecanumDrive_Cartesian(mag, dir, rot, getGyro());
	}
	//*/
	
	/**
	 * Set the drive for tele.
	 * @param io: all input
	 */
	//*/
	public void drive(IO io)
	{	
		if (io.getResetGyro()) m_gyro.reset();
		
		//*/
		if (io.getFinesseMode() == -1) {
			m_drive.mecanumDrive_Polar(0.3, 270, 0);
		} 
		else if (io.getFinesseMode() == 1) {
			m_drive.mecanumDrive_Polar(0.3, 90, 0);
		}
		else {
			if (!io.getShift())
			{				
				// drive polar mecanum reduced speed
				if (io.getLeftArcade())
				{
					m_drive.mecanumDrive_Polar(io.getLeftMagnitude() * SLOW, io.getLeftDirection(), io.getLeftRotation());
				} 
				else if (io.getRightArcade())
				{
					m_drive.mecanumDrive_Polar(io.getRightMagnitude() * SLOW, io.getRightDirection(), io.getRightRotation());
				}
				else
				{
					m_drive.mecanumDrive_Polar(io.getMagnitude() * SLOW, io.getDirection(), io.getRotation());
				}
			}
			else 
			{				
				// drive cartestain mecanum full speed
				if (io.getLeftArcade())
				{
				m_drive.mecanumDrive_Cartesian(io.getLeftX(), io.getLeftY(), io.getLeftRotation(), m_gyro.getAngle());
				} 
				else if (io.getRightArcade())
				{
					m_drive.mecanumDrive_Cartesian(io.getRightX(), io.getRightY(), io.getRightRotation(), m_gyro.getAngle());
				}
				else
				{
					m_drive.mecanumDrive_Cartesian(((io.getLeftX() + io.getRightX()) / 2), ((io.getLeftY() + io.getRightY()) / 2), io.getRotation(), m_gyro.getAngle());
				}
			}
		}
	}
	//*/

	/**
	 * Make safe the drive train.
	 */
	//*/
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
	//*/
}
