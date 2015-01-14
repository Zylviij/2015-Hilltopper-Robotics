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
	
	/**
	 * Make safe the robot.
	 */
	public void makeSafe()
	{
		m_drive.makeSafe();
	}
}
