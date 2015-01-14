package org.usfirst.frc.team1732.systems;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * Creates all IO. (Joysticks and buttons)
 */
public class IO
{
	
	/*
	 * Create Joysticks
	 */
	private Joystick m_leftJoystick = new Joystick(0);
	private Joystick m_rightJoystick = new Joystick(1);
	
	
	/*
	 * Create Joystick Buttons
	 */
	private Button m_arcadeLeft = new JoystickButton(m_leftJoystick, 7);
	private Button m_arcadeRight = new JoystickButton(m_rightJoystick, 7);
	private Button m_shiftLeft = new JoystickButton(m_leftJoystick, 1);
	private Button m_shiftRight = new JoystickButton(m_rightJoystick, 1);

	
	/**
	 * Gets Button state
	 * @return boolean value of button
	 */
	public boolean getShift()
	{
		return m_shiftLeft.get() || m_shiftRight.get();
	}

	/**
	 * Gets Button state
	 * @return boolean value of button
	 */
	public boolean getLeftArcade()
	{
		return m_arcadeLeft.get();
	}
	
	/**
	 * Gets Button state
	 * @return boolean value of button
	 */
	public boolean getRightArcade()
	{
		return m_arcadeRight.get();
	}
	
	/**
	 * Gets left magnitude
	 * @return left magnitude
	 */
	public double getLeftMagnitude()
	{
		return m_leftJoystick.getMagnitude();
	}
	
	/**
	 * Gets right magnitude
	 * @return right magnitude
	 */
	public double getRightMagnitude()
	{
		return m_rightJoystick.getMagnitude();
	}
	
	/**
	 * Gets left direction
	 * @return left direction
	 */
	public double getLeftDirection()
	{
		return m_leftJoystick.getDirectionDegrees();
	}
	
	/**
	 * Gets right direction
	 * @return right direction
	 */
	public double getRightDirection()
	{
		return m_rightJoystick.getDirectionDegrees();
	}
	
	/**
	 * Gets left rotation
	 * @return left rotation
	 */
	public double getLeftRotation()
	{
		return m_leftJoystick.getTwist();
	}
	
	/**
	 * Gets right rotation
	 * @return right rotation
	 */
	public double getRightRotation()
	{
		return m_rightJoystick.getTwist();
	}
	
	/**
	 * Gets left x axis
	 * @return left x axis
	 */
	public double getLeftX()
	{
		return m_leftJoystick.getX();
	}
	
	/**
	 * Gets right x axis
	 * @return right x axis
	 */
	public double getRightX()
	{
		return m_rightJoystick.getX();
	}
	
	/**
	 * Gets left y axis
	 * @return left y axis
	 */
	public double getLeftY()
	{
		return m_leftJoystick.getY();
	}
	
	/**
	 * Gets right y axis
	 * @return right y axis
	 */
	public double getRightY()
	{
		return m_rightJoystick.getY();
	}
	
	/**
	 * Gets average magnitude
	 * @return mean magnitude [0.....1]
	 */
	public double getMagnitude()
	{
		return (m_leftJoystick.getMagnitude() + m_rightJoystick.getMagnitude()) / 2.0;
	}
	
	/**
	 * Gets average direction
	 * @return mean direction in degrees
	 */
	public double getDirection()
	{
		return Math.toDegrees(Math.atan2(
				((m_leftJoystick.getX() + m_rightJoystick.getX()) / 2.0),
				((m_leftJoystick.getY() + m_rightJoystick.getY()) / -2.0)
				));	
	}
	
	/**
	 * Gets rotation
	 * @return rotation [-1.....1]
	 */
	public double getRotation()
	{
		return (m_rightJoystick.getY() + (-1 * m_leftJoystick.getY()) / 2.0);
	}
	
}
