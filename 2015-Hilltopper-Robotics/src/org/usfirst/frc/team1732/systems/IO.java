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
	private Joystick m_buttons = new Joystick(2);
	
	
	/*
	 * Create Joystick Buttons
	 */
	private Button m_arcadeLeft = new JoystickButton(m_leftJoystick, 1);
	private Button m_arcadeRight = new JoystickButton(m_rightJoystick, 1);
		
	private Button m_spinLeft = new JoystickButton(m_leftJoystick, 7);
	private Button m_spinRight = new JoystickButton(m_rightJoystick, 7);

	private Button m_strafeLeftLeft = new JoystickButton(m_leftJoystick, 5);
	private Button m_strafeLeftRight = new JoystickButton(m_rightJoystick, 5);
	
	private Button m_strafeRightLeft = new JoystickButton(m_leftJoystick, 6);
	private Button m_strafeRightRight = new JoystickButton(m_rightJoystick, 6);
	
	private Button m_resetGyroLeft = new JoystickButton(m_leftJoystick, 3);
	private Button m_resetGyroRight = new JoystickButton(m_rightJoystick, 4);
	
	private Button m_invertLeft = new JoystickButton(m_leftJoystick, 2);
	private Button m_invertRight = new JoystickButton(m_rightJoystick, 2);
	
	private Button m_gyroLeft = new JoystickButton(m_leftJoystick, 4);
	private Button m_gyroRight = new JoystickButton(m_rightJoystick, 3);
	
	
	/*
	 * Buttons
	 */
	private Button m_00 = new JoystickButton(m_buttons, 16);
	private Button m_10 = new JoystickButton(m_buttons, 13);
	private Button m_03 = new JoystickButton(m_buttons, 18);
	private Button m_13 = new JoystickButton(m_buttons, 19);
	private Button m_20 = new JoystickButton(m_buttons, 12);
	private Button m_23 = new JoystickButton(m_buttons, 3);
	private Button m_01 = new JoystickButton(m_buttons, 17);
	private Button m_11 = new JoystickButton(m_buttons, 20);
	private Button m_21 = new JoystickButton(m_buttons, 15);
	private Button m_02 = new JoystickButton(m_buttons, 000); // update
	private Button m_12 = new JoystickButton(m_buttons, 001); // update
	private Button m_22 = new JoystickButton(m_buttons, 002); // update
	
	public boolean get00() { return m_00.get(); }
	public boolean get01() { return m_01.get(); }
	public boolean get02() { return m_02.get(); }
	public boolean get03() { return m_03.get(); }
	public boolean get10() { return m_10.get(); }
	public boolean get11() { return m_11.get(); }
	public boolean get12() { return m_12.get(); }
	public boolean get13() { return m_13.get(); }
	public boolean get20() { return m_20.get(); }
	public boolean get21() { return m_21.get(); }
	public boolean get22() { return m_22.get(); }
	public boolean get23() { return m_23.get(); }
	
	public double getMagnitude() { return (m_leftJoystick.getMagnitude() + m_rightJoystick.getMagnitude()) / 2.0; }
	public double getDirection() { return Math.toDegrees(Math.atan2((m_leftJoystick.getX() + m_rightJoystick.getX()) / 2.0, (m_leftJoystick.getY() + m_rightJoystick.getY()) / -2.0));	}
	public double getRotation() { return (m_rightJoystick.getY() - m_leftJoystick.getY()) / 2.0; }
	
	public double getX() { return (getLeftX() + getRightX()) / 2; }
	public double getY() { return (getLeftY() + getRightY()) / 2; }
	
	public double getLeftMagnitude() { return m_leftJoystick.getMagnitude(); }
	public double getRightMagnitude() { return m_rightJoystick.getMagnitude(); }
	public double getLeftDirection() { return m_leftJoystick.getDirectionDegrees(); }
	public double getRightDirection() { return m_rightJoystick.getDirectionDegrees(); }
	public double getLeftRotation() { return m_leftJoystick.getZ(); }
	public double getRightRotation() { return m_rightJoystick.getZ(); }
	
	
	public double getLeftY() { return m_leftJoystick.getY(); }
	public double getRightY() { return m_rightJoystick.getY(); }
	public double getLeftX() { return m_leftJoystick.getX(); }
	public double getRightX() { return m_rightJoystick.getX(); }
	
	public boolean getArcadeLeft() { return m_arcadeLeft.get(); }
	public boolean getArcadeRight() { return m_arcadeRight.get(); }
	public boolean getSpinLeft() { return m_spinLeft.get(); }
	public boolean getSpinRight() { return m_spinRight.get(); }
	
	public boolean getStrafeLeftLeft() { return m_strafeLeftLeft.get(); }
	public boolean getStrafeLeftRight() { return m_strafeLeftRight.get(); }
	public boolean getStrafeRightLeft() { return m_strafeRightLeft.get(); }
	public boolean getStrafeRightRight() { return m_strafeRightRight.get(); }

	public boolean getGyroLeft() { return m_gyroLeft.get(); }
	public boolean getGyroRight() { return m_gyroRight.get(); }
	
	public boolean getResetGyroLeft() { return m_resetGyroLeft.get(); }
	public boolean getResetGyroRight() { return m_resetGyroRight.get(); }
	
	public boolean getInvertLeft() { return m_invertLeft.get(); }
	public boolean getInvertRight() { return m_invertRight.get(); }
}
