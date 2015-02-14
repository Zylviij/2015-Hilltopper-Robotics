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
	
	private Button m_shiftLeft = new JoystickButton(m_leftJoystick, 1);
	private Button m_shiftRight = new JoystickButton(m_rightJoystick, 1);
	
	private Button m_centerLeft = new JoystickButton(m_leftJoystick, 2);
	private Button m_centerRight = new JoystickButton(m_rightJoystick, 2);
	
	private Button m_finesseLeftLeft = new JoystickButton(m_leftJoystick, 5);
	private Button m_finesseRightLeft = new JoystickButton(m_leftJoystick, 6);
	private Button m_finesseLeftRight = new JoystickButton(m_rightJoystick, 5);
	private Button m_finesseRightRight = new JoystickButton(m_rightJoystick, 6);

	private Button m_resetGyroLeft = new JoystickButton(m_leftJoystick, 11);
	private Button m_resetGyroRight = new JoystickButton(m_rightJoystick, 11);
	

	/*
	 * Buttons
	 */
	private Button m_craaa = new JoystickButton(m_buttons, 0);
	
	private Button m_craaa0 = new JoystickButton(m_buttons, 1);
	private Button m_craaa1 = new JoystickButton(m_buttons, 2);
	private Button m_craaa2 = new JoystickButton(m_buttons, 3);
	private Button m_craaa3 = new JoystickButton(m_buttons, 4);
	private Button m_craaa4 = new JoystickButton(m_buttons, 5);
	
	private Button m_craaaToleranceDown = new JoystickButton(m_buttons, 12);
	
	private Button m_craaaToleranceUp = new JoystickButton(m_buttons, 13);
	
	private Button m_intakeOut = new JoystickButton(m_buttons, 6);
	
	private Button m_intakeIn = new JoystickButton(m_buttons, 7);
	
	private Button m_intakeInOut = new JoystickButton(m_buttons, 8);
	
	private Button m_gate = new JoystickButton(m_buttons, 9);
	
	private Button m_lift = new JoystickButton(m_buttons, 10);
	
	private Button m_drop = new JoystickButton(m_buttons, 11);
	
	public boolean getCentering() {
		return m_centerLeft.get() || m_centerRight.get();
	}
	
	/**
	 * to move craaa up
	 * @return true if button is depressed
	 */
	public boolean getCraaaToleranceUp() {
		return m_craaaToleranceUp.get();
	}
	
	/**
	 * to move craaa down
	 * @return true if button is depressed
	 */
	public boolean getCraaaToleranceDown() {
		return m_craaaToleranceDown.get();
	}
	
	/**
	 * reset gyro angle
	 * @return if either button is depressed
	 */
	public boolean getResetGyro() {
		return m_resetGyroLeft.get() || m_resetGyroRight.get();
	}
	
	/**
	 * WARNING WARNING THIS IS A NUCLEAR STARTER
	 * @return true if button is deceased
	 */
	public boolean getDrop() {
		return m_drop.get();
	}
	
	/**
	 * intake in button
	 * @return true if button is depressed
	 */
	public boolean getIntakeIn() {
		return m_intakeIn.get();
	}
	
	/**
	 * intake out button
	 * @return true if button is depressed
	 */
	public boolean getIntakeOut() {
		return m_intakeOut.get();
	}
	
	/**
	 * open or close intake arms
	 * @return true if button is depressed
	 */
	public boolean getIntakeInOut() {
		return m_intakeInOut.get();
	}
	
	/**
	 * Gets Craaa position
	 * @return position [0...4]
	 */
	public int getCraaaPos() {
		if (m_craaa0.get()) return 0;
		else if (m_craaa1.get()) return 1;
		else if (m_craaa2.get()) return 2;
		else if (m_craaa3.get()) return 3;
		else if (m_craaa4.get()) return 4;
		else return 0;
	}
	
	/**
	 * Gets button state OR
	 * @return shift
	 */
	public boolean getShift()
	{
		return m_shiftLeft.get() || m_shiftRight.get();
	}

	
	/**
	 * returns values for dashboard
	 * @return array of finesse buttons
	 */
	public boolean[][] getFinesse() {
		return new boolean[][]
			{
				{
					m_finesseLeftLeft.get(),
					m_finesseRightLeft.get(),
				},
				{
					m_finesseLeftRight.get(),
					m_finesseRightRight.get(),
				}
			};
	}
	
	/**
	 * returns the finesse direction
	 * @return -1 if left <br /> 1 if right <br /> 0 if both or neither
	 */
	public int getFinesseMode() {
		if ((m_finesseLeftLeft.get() || m_finesseLeftRight.get()) && (m_finesseRightLeft.get() || m_finesseRightRight.get())) return 0;
		else if (m_finesseLeftLeft.get() || m_finesseLeftRight.get()) return -1;
		else if (m_finesseRightLeft.get() || m_finesseRightRight.get()) return 1;
		else return 0;
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
	 * gets craaa opening button
	 * @return true if button is depressed
	 */
	public boolean getCraaaOpen() {
		return m_craaa.get();
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
	
	/**
	 * gets the gate button
	 * @return true if button is depressed
	 */
	public boolean getGate() {
		return m_gate.get();
	}
	
	/**
	 * gets the lift button
	 * @return true if button is depressed
	 */
	public boolean getLift() {
		return m_lift.get();
	}
	
}
