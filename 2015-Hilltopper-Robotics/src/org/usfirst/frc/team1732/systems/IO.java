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
	private Button m_arcadeLeft = new JoystickButton(m_leftJoystick, 7);
	private Button m_arcadeRight = new JoystickButton(m_rightJoystick, 7);
		
	private Button m_finesseLeftLeft = new JoystickButton(m_leftJoystick, 5);
	private Button m_finesseRightLeft = new JoystickButton(m_leftJoystick, 6);
	
	private Button m_finesseLeftRight = new JoystickButton(m_rightJoystick, 5);
	private Button m_finesseRightRight = new JoystickButton(m_rightJoystick, 6);
	
	private Button m_resetGyroLeft = new JoystickButton(m_leftJoystick, 2);
	private Button m_resetGyroRight = new JoystickButton(m_rightJoystick, 2);
	
	private Button m_invertLeft = new JoystickButton(m_leftJoystick, 3);
	private Button m_invertRight = new JoystickButton(m_rightJoystick, 3);
	
	private Button m_dropLeft = new JoystickButton(m_leftJoystick, 4);
	private Button m_dropRight = new JoystickButton(m_rightJoystick, 4);
	
	/*
	 * Buttons
	 */
	private Button m_toteOut = new JoystickButton(m_buttons, 16);
	private Button m_toteIn = new JoystickButton(m_buttons, 13);
	private Button m_dropToteStack = new JoystickButton(m_buttons, 18);
	private Button m_liftTote = new JoystickButton(m_buttons, 19);
	private Button m_intakeExtend = new JoystickButton(m_buttons, 12);
	private Button m_openCraaa = new JoystickButton(m_buttons, 3);
	private Button m_craaaUp = new JoystickButton(m_buttons, 17);
	private Button m_craaaDown = new JoystickButton(m_buttons, 20);
	private Button m_craaaAngle = new JoystickButton(m_buttons, 15);
	
	/*
	 * Getters
	 */
	private double minimum = Double.MAX_VALUE;
	private double maximum = Double.MIN_VALUE;
	public double getCraaaHeight() {
		double current = m_buttons.getRawAxis(0);
		if (current > maximum) maximum = current;
		if (current < minimum) minimum = current;
		double range = maximum - minimum;
		double position = current - minimum;
		return position / range;
	}
	
	public boolean getDrop() {
		return m_dropLeft.get() || m_dropRight.get();
	}
	
	public boolean getInvert() {
		return m_invertLeft.get() || m_invertRight.get();
	}
	
	/**
	 * returns the finesse direction
	 * @return -1 if left <br /> 1 if right <br /> 0 if both or neither
	 */
	public int getFinesseMode() {
		
		boolean left = m_finesseLeftLeft.get() || m_finesseLeftRight.get();
		boolean right = m_finesseRightLeft.get() || m_finesseRightRight.get();
		
		if (left && right) { return 0; }
		else if (left) { return -1; }
		else if (right) { return 1; }
		else { return 0; }
	}
	
	public int getArcade() {
		boolean left = m_arcadeLeft.get();
		boolean right = m_arcadeRight.get();
		
		if (left && right) { return 0; }
		else if (left) { return -1; }
		else if (right) { return 1; }
		else { return 0; }
	}
	
	public double getMagnitude() {
		return (m_leftJoystick.getMagnitude() + m_rightJoystick.getMagnitude()) / 2.0;
	}
	
	public double getDirection() {
		return Math.toDegrees(Math.atan2(
										(m_leftJoystick.getX() + m_rightJoystick.getX()) / 2.0,
										(m_leftJoystick.getY() + m_rightJoystick.getY()) / -2.0
										));	
	}
	
	public double getRotation() {
		return (m_rightJoystick.getY() - m_leftJoystick.getY()) / 2.0;
	}
	
	public double getLeftMagnitude() { return m_leftJoystick.getMagnitude(); }
	public double getRightMagnitude() { return m_rightJoystick.getMagnitude(); }
	public double getLeftDirection() { return m_leftJoystick.getDirectionDegrees(); }
	public double getRightDirection() { return m_rightJoystick.getDirectionDegrees(); }
	public double getLeftRotation() { return m_leftJoystick.getTwist(); }
	public double getRightRotation() { return m_rightJoystick.getTwist(); }
	public double getLeftY() { return m_leftJoystick.getY(); }
	public double getRightY() { return m_rightJoystick.getY(); }
	public double getLeftX() { return m_leftJoystick.getX(); }
	public double getRightX() { return m_rightJoystick.getX(); }
	public double getLeftRot() { return m_leftJoystick.getTwist(); }
	public double getRightRot() { return m_rightJoystick.getTwist(); }
	public double getX() { return (getLeftX() + getRightX()) / 2; }
	public double getY() { return (getLeftY() + getRightY()) / 2; }
	public boolean getResetGyro() { return m_resetGyroRight.get() || m_resetGyroLeft.get(); }
	
	public boolean getCartestian() { return m_leftJoystick.getTrigger() || m_rightJoystick.getTrigger(); }
	
	public boolean getCraaaAngle() { return m_craaaAngle.get(); }
	public boolean getCraaaDown() { return m_craaaDown.get(); }
	public boolean getCraaaUp() { return m_craaaUp.get(); }
	public boolean getOpenCraaa() { return m_openCraaa.get(); }
	public boolean getIntakeExtend() { return m_intakeExtend.get(); }
	public boolean getLiftTote() { return m_liftTote.get();}
	public boolean getDropToteStack() { return m_dropToteStack.get(); }
	public boolean getToteOut() { return m_toteOut.get(); }
	public boolean getToteIn() { return m_toteIn.get(); }
}
