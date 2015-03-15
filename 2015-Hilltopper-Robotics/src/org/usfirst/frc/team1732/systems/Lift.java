package org.usfirst.frc.team1732.systems;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.Solenoid;

public class Lift
{
	/*
	 * Make Actuators
	 */
	private CANTalon m_motor = new CANTalon(11);
	
	private Servo m_dropLeft = new Servo(1);
	private Servo m_dropRight = new Servo(0);
	
	private CANTalon m_motorLeft = new CANTalon(12);
	private CANTalon m_motorRight = new CANTalon(23);
	
	// solenoids
	private Solenoid m_solenoidRight = new Solenoid(1, 2);
	private Solenoid m_solenoidLeft = new Solenoid(1, 1);

	private DigitalInput m_limit = new DigitalInput(4);
	
	/*
	 * Make Sensors
	 */
	private Encoder m_encoder = new Encoder(1, 0);
	
	
	/*
	 * Constants
	 */
	// lift
	private static final double UP = 1;
	private static final double UP_SLOW = 0.5;
	private static final double DOWN = -1;
	private static final double DOWN_SLOW = -0.5;
	private static final double LIFT_SPEED = 1;
	
	// flippers
	private static final double RIGHT_OPEN = .5;
	private static final double RIGHT_CLOSED = 0.25;
	private static final double LEFT_OPEN = 0.625;
	private static final double LEFT_CLOSED = 1;
	
	// rollers
	private static final double ROLLER_SPEED = -1;
	private static final double IN = 1;
	private static final double IN_SLOW = 0.5;
	private static final double OUT = -1;
	private static final double OUT_SLOW = -0.5;

	// reused
	private static final double STOP = 0;

	// heights
	private static final double GROUND_HEIGHT = -10;
	private static final double OUT_HEIGHT = -120;
	private static final double HUMAN_PLAYER_HEIGHT = -400;
	private static final double DROP_HEIGHT = -800;
	private static final double LATCH_HEIGHT = -1650;
	
	// time
	private static final int LIFT_DELAY = 200;
	private static final int CENTRE_DELAY = 500;
	private static final int FLIPPER_DELAY = 600;
	private static final int SLOW_DELAY = 500;
	
	private final static double DEADBAND = 12;
		
	// direction variables
	private static boolean m_lastDirLift = false; // true if up, false if down
	private static boolean m_lastDirRollers = false; // true if up, false if down
	
	// state variables
	private static int m_super = 0;
	private static int m_humanPlayer = 0; // 1
	private static int m_centreTote = 0; // 2
	private static int m_latch = 0; // 3
	private static int m_out = 0; // 4
	private static int m_drop = 0; // 5
	
	
	private static long startTime = 0;
	
	public void init() {
		m_motor.enableControl();
		m_motorLeft.enableControl();
		m_motorRight.enableControl();
	}
	
	public void resetEncoder() {
		m_encoder.reset();
	}
	
	public boolean setPos(double setPoint, double k) {
    	double error = m_encoder.get() - setPoint;
    	//if (Math.abs(error) > DEADBAND);
    	double correction;

    	correction = error * k;
    	if (Math.abs(error) < DEADBAND){
    		correction = 0;
    	}

    	m_motor.set(correction);
    	return (correction == 0);
    }
	
	public double getCANTalon() {
		return m_motor.getOutputCurrent();
	}
	
	public void setLift(double input) {
		m_motor.set(input * LIFT_SPEED);
	}
	
	public double getCANTalonHeat() {
		return m_motor.getTemp();
	}
	
	public void setFlippers(boolean open) {
		if (open) {
			m_dropLeft.set(LEFT_OPEN);
			m_dropRight.set(RIGHT_OPEN);
		} else {
			m_dropLeft.set(LEFT_CLOSED);
			m_dropRight.set(RIGHT_CLOSED);
		}
	}
	
	public void setIntakes(boolean input) {
		m_solenoidLeft.set(input);
		m_solenoidRight.set(input);
	}
	
	public static final double LEFT = 1;
	public static final double RIGHT = -1;
	public void setRollers(double input) {
		m_motorLeft.set(ROLLER_SPEED * input * LEFT);
		m_motorRight.set(ROLLER_SPEED * input * RIGHT);
	}
	
	public double getEncoder() {
		return m_encoder.getDistance();
	}
	
	public int[] getModes() {
		return new int[]{
				m_super,
				m_humanPlayer,
				m_centreTote,
				m_latch,
				m_out,
				m_drop
		};
	}
	
	/**
	 * control the lift from joysticks
	 * @param io
	 */
	public void controlLift(IO io) {
		// auto
		if (io.getMode()) {
			// choose mode or wait
			if (io.getHumanPlayer()) m_super = 1;
			else if (io.getCentreTote() && m_centreTote == 0) m_super = 2;
			else if (io.getLatch()) m_super = 3;
			else if (io.getOut()) m_super = 4;
			else if (io.getDrop()) m_super = 5;
			
			// human player
			if (m_super == 1) {
				if (m_humanPlayer == 0) {
					m_humanPlayer = 1;
					startTime = System.currentTimeMillis();
				}
				if (m_humanPlayer == 1) {
					setIntakes(true);
					setRollers(STOP);
					if (System.currentTimeMillis() - startTime > LIFT_DELAY) m_humanPlayer = 2;
				}
				if (m_humanPlayer == 2) {
					if (setPos(HUMAN_PLAYER_HEIGHT, 0.003) || io.getHumanPlayer()) m_humanPlayer = 3;
				}
				if (m_humanPlayer == 3) {
					m_super = 0;
					m_humanPlayer = 0;
				}
			}
			// centre tote
			else if (m_super == 2) {
				if (m_centreTote == 0) {
					m_centreTote = 1;
					startTime = System.currentTimeMillis();
				}
				if (m_centreTote == 1) {
					setIntakes(true);
					setRollers(STOP);
					if (System.currentTimeMillis() - startTime > LIFT_DELAY) m_centreTote = 2;
				} 
				if (m_centreTote == 2) {
					if (setPos(GROUND_HEIGHT, 0.008) || io.getCentreTote()) {
						m_centreTote = 3;
						startTime = System.currentTimeMillis();
					}
				}
				if (m_centreTote == 3) {
					setIntakes(false);
					setRollers(IN_SLOW);
					if (System.currentTimeMillis() - startTime > CENTRE_DELAY) m_centreTote = 4;
				}
				if (m_centreTote == 4) {
					setRollers(STOP);
					m_centreTote = 0;
					m_super = 0;
				}
			}
			// latch
			else if (m_super == 3) {
				if (m_latch == 0) {
					m_latch = 1;
					setFlippers(false);
					startTime = System.currentTimeMillis();
				}
				if (m_latch == 1) {
					setIntakes(true);
					setRollers(IN_SLOW);
					if (System.currentTimeMillis() - startTime > LIFT_DELAY) m_latch = 2;
				}
				if (m_latch == 2) {
					setRollers(STOP);
					if (setPos(LATCH_HEIGHT, 0.010) || io.getLatch()) {
						m_latch = 3;
						startTime = System.currentTimeMillis();
					}
				}
				if (m_latch == 3) {
					if (System.currentTimeMillis() - startTime > LIFT_DELAY) {
						m_latch = 4;
						startTime = System.currentTimeMillis();
					}
				}
				if (m_latch == 4) {
					m_motor.set(DOWN * 0.2);
					if (System.currentTimeMillis() - startTime > SLOW_DELAY) {
						m_latch = 5;
						m_motor.set(STOP);
					}
				}
				if (m_latch == 5) {
					m_latch = 0;
					m_super = 1;
				}
			}
			// out
			else if (m_super == 4) {
				if (m_out == 0) {
					m_out = 1;
					startTime = System.currentTimeMillis();
				}
				if (m_out == 1) {
					setIntakes(true);
					setRollers(STOP);
					if (System.currentTimeMillis() - startTime > LIFT_DELAY) m_out = 2;
				}
				if (m_out == 2) {
					setPos(OUT_HEIGHT, 0.016);
					if (io.getOut()) {
						m_out = 3;						
						m_motor.set(STOP);
					}
				}
				if (m_out == 3) {
					setIntakes(false);
					setRollers(OUT_SLOW);
					if (!io.getOut()) m_out = 4;
				}
				if (m_out == 4) {
					setIntakes(true);
					setRollers(STOP);
					setFlippers(false);
					m_out = 0;
					m_super = 0;
				}
			}
			// drop
			else if (m_super == 5) {
				if (m_drop == 0) {
					m_drop = 1;
					startTime = System.currentTimeMillis();
					
				}
				if (m_drop == 1) {
					setIntakes(true);
					setRollers(STOP);
					if (System.currentTimeMillis() - startTime > LIFT_DELAY) m_drop = 2;
				}
				if (m_drop == 2) {
					if (setPos(DROP_HEIGHT, 0.010) || io.getDrop()) {
						m_drop = 3;
						startTime = System.currentTimeMillis();
					}
				}
				if (m_drop == 3) {
					setFlippers(true);
					if (System.currentTimeMillis() - startTime > FLIPPER_DELAY) m_drop = 4;
				}
				if (m_drop == 4) {
					m_motor.set(DOWN * 0.3);
					if (Math.abs(m_encoder.get() - GROUND_HEIGHT) < DEADBAND) {
						m_drop = 5;
					}
				}
				if (m_drop == 5) {
					m_drop = 0;
					m_super = 2;
				}
			}
			else {
				System.out.println("Error:" + m_super);
			}
		}
		// manual
		else {
			m_super = 0;
			m_humanPlayer = 0;
			m_centreTote = 0;
			m_out = 0;
			m_drop = 0;
			m_latch = 0;
			// lift
			boolean up = io.getLiftUp();
			boolean down = io.getLiftDown();
			if (up && down) {
				if (m_lastDirLift) {
					m_motor.set(UP * LIFT_SPEED);
				} else {
					m_motor.set(DOWN * LIFT_SPEED);
				}
			}
			else if (up) {
				m_lastDirLift = true;
				m_motor.set(UP_SLOW * LIFT_SPEED);
			} else if (down) {
				m_lastDirLift = false;
				m_motor.set(DOWN_SLOW * LIFT_SPEED);
			} else {
				m_motor.set(STOP);
			}
			
			// intake arms
			boolean extend = io.getIntakesExtended();
			m_solenoidLeft.set(extend);
			m_solenoidRight.set(extend);
			
			// rollers
			boolean in = io.getRollersIn();
			boolean out = io.getRollersOut();
			if (in && out) {
				if (m_lastDirRollers) {
					setRollers(IN);
				} else {
					setRollers(OUT);
				}
			}
			else if (in) {
				m_lastDirRollers = true;
				setRollers(IN_SLOW);
			} else if (out) {
				m_lastDirRollers = false;
				setRollers(OUT_SLOW);
			} else {
				setRollers(STOP);
			}
			boolean drop = io.getFlippers();
			
			// set servos
			setFlippers(drop);
			if (drop) m_encoder.reset();
			
			//if (m_limit.get()) m_encoder.reset();
		}
	}
	
	/**
	 * Makes the robot Lift safe
	 */
	public void makeSafe()
	{
		m_motor.set(0);
		m_motor.disable();
		
		m_motorLeft.set(0);
		m_motorLeft.disable();
		
		m_motorRight.set(0);
		m_motorRight.disable();
		
		m_solenoidLeft.set(false);
		m_solenoidRight.set(false);
		
		m_solenoidLeft.free();
		m_solenoidRight.free();
	}
}
