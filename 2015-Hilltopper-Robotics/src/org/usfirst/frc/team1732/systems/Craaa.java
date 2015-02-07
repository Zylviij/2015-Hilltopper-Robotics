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
	
	private static int LIMIT;
	
	/**
	 * Constructs the Craaa
	 */
	//*/
	Craaa()
	{
		// TODO: REDO the next line
		LIMIT = m_motor.getEncPosition();
	}
	//*/
	
	/**
	 * use the joysticks and buttons to control the craaa
	 * @param io
	 */
	public void controlCraaa(IO io) {
		m_solenoid.set(io.getCraaaOpen());
		if (!(m_limitTop.get() || m_limitBottom.get())) {
			m_motor.set(
					((LIMIT / 5) * io.getCraaaPos()) -
					(m_motor.getEncPosition())
					);
		}
		else {
			m_motor.set(0);
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
