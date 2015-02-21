package org.usfirst.frc.team1732.systems;

/**
 * Creates all motors and actuators.
 */
public class RobotMap
{
	
	/*
	 * creates robot subsystems
	 */
	public Drive m_drive = new Drive();
	public Lift m_lift = new Lift();
	public Intake m_intake = new Intake();
	//public Craaa m_craaa = new Craaa();
	
	public void teleop(IO io) {
		m_drive.drive(io);
		m_lift.controlLift(io);
		m_intake.controlIntake(io);
	}
	
	/**
	 * Make safe the robot.
	 */
	public void makeSafe()
	{
		m_drive.makeSafe();
		m_lift.makeSafe();
		m_intake.makeSafe();
		//m_craaa.makeSafe();
	}
}
