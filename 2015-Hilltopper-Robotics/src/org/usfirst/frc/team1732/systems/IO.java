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
	public Joystick m_leftJoystick = new Joystick(0);
	public Joystick m_rightJoystick = new Joystick(1);
	
	
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
	public boolean getShifter() {
		return m_shiftLeft.get() || m_shiftRight.get();
	}
	
	/**
	 * Gets the arcade drive state
	 * @return 0 for tank, 1 for left, 2 for right
	 */
	public int getArcade() {
		if (m_arcadeLeft.get()) return 1;
		if (m_arcadeRight.get()) return 2;
		return 0;
	}
	
	/**
	 * Gets average magnitude
	 * @return mean magnitude [0.....1]
	 */
	public double k_getMagnitude() {
		return (m_leftJoystick.getMagnitude() + m_rightJoystick.getMagnitude()) / 2.0;
	}
	
	/**
	 * Gets average direction
	 * @return mean direction in degrees
	 */
	public double k_getDirection() {
		return Math.toDegrees(Math.atan2(((m_leftJoystick.getX() + m_rightJoystick.getX()) / 2.0), ((m_leftJoystick.getY() + m_rightJoystick.getY()) / -2.0)));	
	}
	
	/**
	 * Gets rotation
	 * @return rotation [-1.....1]
	 */
	public double k_getRotation() {
		return (m_rightJoystick.getY() + (-1 * m_leftJoystick.getY()) / 2.0);
	}
	
	public Joysticks getJoysticks() {
		return new Joysticks(m_leftJoystick, m_rightJoystick);
	}
	
	/*
	 * Subclasses
	 */
	public class Joysticks {
		
		// axis
		private double m_leftX;
		private double m_leftY;
		private double m_rightX;
		private double m_rightY;
		
		// polar
		private double m_leftMagnitude;
		private double m_leftDirection;
		private double m_leftRotation;
		
		private double m_rightMagnitude;
		private double m_rightDirection;
		private double m_rightRotation;
		
		// mode
		private boolean m_shift;
		
		private int m_arcadeMode;
		
		// average polar
		private double m_magnitude;
		private double m_direction;
		private double m_rotation;
		
		// get axis
		public double getLeftX() { return m_leftX; }
		public double getLeftY() { return m_leftY; }
		
		public double getRightX() { return m_rightX; }
		public double getRightY() { return m_rightY; }
		
		// get polar
		public double getLeftMagnitude() { return m_leftMagnitude; }
		public double getLeftDirection() { return m_leftDirection; }
		public double getLeftRotation() { return m_leftRotation; }
		
		public double getRightMagnitude() { return m_rightMagnitude; }
		public double getRightDirection() { return m_rightDirection; }
		public double getRightRotation() { return m_rightRotation; }
		
		// get mode
		public int getArcadeMode() { return m_arcadeMode; }
		
		public boolean getShift() { return m_shift; }
		
		// get average polar
		public double getMagnitude() { return m_magnitude; }
		public double getDirection() { return m_direction; }
		public double getRotation() { return m_rotation; }
		
		Joysticks(Joystick left, Joystick right) {
			
			// axis
			m_leftX = left.getX();
			m_leftY = left.getY();
			m_rightX = right.getX();
			m_rightY = right.getY();
			
			// mode
			m_arcadeMode = getArcade();
			
			m_shift = getShifter();
			
			// polar
			m_leftMagnitude = left.getMagnitude();
			m_leftDirection = left.getDirectionDegrees();
			m_leftRotation = left.getTwist();
			
			m_rightMagnitude = right.getMagnitude();
			m_rightDirection = right.getDirectionDegrees();
			m_rightRotation = right.getTwist();
			
			// average polar
			m_magnitude = k_getMagnitude();
			m_direction = k_getDirection();
			m_rotation = k_getRotation();
		}
	}
}
