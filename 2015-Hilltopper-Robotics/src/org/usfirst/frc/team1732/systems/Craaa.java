package org.usfirst.frc.team1732.systems;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Solenoid;

public class Craaa
{
	//*/
	private Solenoid m_solenoid = new Solenoid(1);
	//*/
	
	//*/
	private CANTalon m_motor = new CANTalon(14);
	//*/
	
	//*/
	private DigitalInput m_limitTop = new DigitalInput(0);
	private DigitalInput m_limitBottom = new DigitalInput(1);
	//*/
	
	private static final double SPEED_LIMIT = 0.5;
	private static final double STOP = 0;
	private static final double ELEVATOR_SPEED = 0.4;
	
	private static int SPOT_GROUND = 0;
	private static int SPOT_ONE_TOTE = 50;
	private static int SPOT_STEP = 70;
	private static int SPOT_TWO_TOTE = 100;
	private static int SPOT_THREE_TOTE = 150;
	private static int SPOT_FOUR_TOTE = 200;
	private static int SPOT_FIVE_TOTE = 250;

	
	/**
	 * use the joysticks and buttons to control the craaa
	 * @param io
	 */
	public void controlCraaa(IO io) {
		
		m_solenoid.set(io.getCraaaOpen());
		
		if (io.getCraaaToleranceUp()) {
			SPOT_GROUND++;
			SPOT_ONE_TOTE++;
			SPOT_STEP++;
			SPOT_TWO_TOTE++;
			SPOT_THREE_TOTE++;
			SPOT_FOUR_TOTE++;
			SPOT_FIVE_TOTE++;
		}
		if (io.getCraaaToleranceDown()) {
			SPOT_GROUND--;
			SPOT_ONE_TOTE--;
			SPOT_STEP--;
			SPOT_TWO_TOTE--;
			SPOT_THREE_TOTE--;
			SPOT_FOUR_TOTE--;
			SPOT_FIVE_TOTE--;
		}
		
		if (m_limitTop.get()) {
			m_motor.set(-1 * SPEED_LIMIT);
		}
		else if (m_limitBottom.get()) {
			m_motor.set(SPEED_LIMIT);
		}
		else {
			if (io.getCraaaPos() == 0) {
				m_motor.set((m_motor.getEncPosition() - SPOT_GROUND) * ELEVATOR_SPEED);
			}
			else if (io.getCraaaPos() == 1) {
				m_motor.set((m_motor.getEncPosition() - SPOT_ONE_TOTE) * ELEVATOR_SPEED);
			}
			else if (io.getCraaaPos() == 2) {
				m_motor.set((m_motor.getEncPosition() - SPOT_STEP) * ELEVATOR_SPEED);
			}
			else if (io.getCraaaPos() == 3) {
				m_motor.set((m_motor.getEncPosition() - SPOT_TWO_TOTE) * ELEVATOR_SPEED);
			}
			else if (io.getCraaaPos() == 4) {
				m_motor.set((m_motor.getEncPosition() - SPOT_THREE_TOTE) * ELEVATOR_SPEED);
			}
			else if (io.getCraaaPos() == 5) {
				m_motor.set((m_motor.getEncPosition() - SPOT_FOUR_TOTE) * ELEVATOR_SPEED);
			}
			else if (io.getCraaaPos() == 6){
				m_motor.set((m_motor.getEncPosition() - SPOT_FIVE_TOTE) * ELEVATOR_SPEED);
			} else {
				m_motor.set(STOP);
			}
		}
	}
	
	/**
	 * organizes limits for dashboard
	 * @return craca limit switches for dashboard
	 */
	//*/
	public boolean[] getLimits() {
		return new boolean[]{m_limitTop.get(), m_limitBottom.get()};
	}
	//*/
	
	/**
	* Makes the robit not kill people
	*/
	//*/
	public void makeSafe()
	{
		m_motor.set(0);
		m_motor.disable();
		
		m_solenoid.set(false);
		m_solenoid.free();
	}
	//*/
}
