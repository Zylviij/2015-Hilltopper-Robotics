package org.usfirst.frc.team1732.systems;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * Creates all IO. (Joysticks and buttons)
 */
public class IO {
	
	/*
	 * Create Joysticks
	 */
	public Joystick leftJoystick = new Joystick(0);
	public Joystick rightJoystick = new Joystick(1);
	
	
	/*
	 * Create Joystick Buttons
	 */
	private Button button = new JoystickButton(leftJoystick, 2);
	
	/**
	 * Gets Button state
	 * @return boolean value of button
	 */
	public boolean getButton() {
		return button.get();
	}
	
}
