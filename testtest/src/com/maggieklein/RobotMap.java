package com.maggieklein;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Gyro;
import edu.wpi.first.wpilibj.Talon;

public class RobotMap {
	public Talon talon0 = new Talon(0);
	public Talon talon1 = new Talon(1);
	public Talon talon2 = new Talon(2);
	public Talon talon3 = new Talon(3);
	public Talon talon4 = new Talon(4);
	public Talon talon5 = new Talon(5);

	public DigitalInput limitSwitch = new DigitalInput(0);
	public Gyro gyro = new Gyro(1);
	public DigitalInput photo = new DigitalInput(5);
	public AnalogInput pot = new AnalogInput(0);
	
}
