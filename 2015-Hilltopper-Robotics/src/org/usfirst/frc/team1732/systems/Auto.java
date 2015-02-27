package org.usfirst.frc.team1732.systems;

public class Auto {
	
	public static final double INCH = 1;
	
	public void doAuto(RobotMap robotMap, IO io, int mode) {
		if (mode == 1) {
			
		}
		else if (mode == 2) {
			
		}
		else {
			doDefAuton(robotMap, io);
		}
	}
	
	public void doDefAuton(RobotMap robotMap, IO io) {
		/*if (robotMap.m_drive.getAveEncoder() < 95 * INCH) 
		{
			robotMap.m_drive.drive(0.4, 90, 0);
		}*/
	}
}
/*
else if(m_autonMode == 1)
{
	/*
	m_robotMap.m_intake.classsetrightIntakeSolenoid(true);
	m_robotMap.m_intake.setleftIntakeSolenoid(true);
	m_robotMap.m_intake.setrightIntakeMotor(1);
	m_robotMap.m_intake.setleftIntakeMotor(1);
	
	if (m_robotMap.m_drive.getEncoders()[0] < 0 * distanceConstant){
		m_robotMap.m_drive.drive(.5, 270, 0);
	}
	if (m_robotMap.m_drive.getEncoders()[0] < 0 * distanceConstant){	
		m_robotMap.m_drive.drive(1, 180, 0);
	}
	if (m_robotMap.m_drive.getEncoders()[0] < 0 * distanceConstant){
		m_robotMap.m_drive.drive(.5, 90, 0);
	}
	if (m_robotMap.m_drive.getEncoders()[0] < 0 * distanceConstant){
		m_robotMap.m_drive.drive(.5, 180, 0);
	}
	
	<RAISE TOTE>
	m_robotMap.m_intake.classsetrightIntakeSolenoid(true);
	m_robotMap.m_intake.setleftIntakeSolenoid(true);
	m_robotMap.m_intake.setrightIntakeMotor(1);
	m_robotMap.m_intake.setleftIntakeMotor(1);
	
	if (m_robotMap.m_drive.getEncoders()[0] < 0 * distanceConstant){
		m_robotMap.m_drive.drive(.5, 270, 0);
	}
	if (m_robotMap.m_drive.getEncoders()[0] < 0 * distanceConstant){
		m_robotMap.m_drive.drive(1, 180, 0);
	}
	if (m_robotMap.m_drive.getEncoders()[0] < 0 * distanceConstant){
		m_robotMap.m_drive.drive(.5, 90, 0);
	}
	if (m_robotMap.m_drive.getEncoders()[0] < 0 * distanceConstant){
		m_robotMap.m_drive.drive(.5, 180, 0);
	}
	
	<RAISE TOTE>
	m_robotMap.m_intake.classsetrightIntakeSolenoid(true);
	m_robotMap.m_intake.setleftIntakeSolenoid(true);
	m_robotMap.m_intake.setrightIntakeMotor(1);
	m_robotMap.m_intake.setleftIntakeMotor(1);
	
	if (m_robotMap.m_drive.getEncoders()[0] < 0 * distanceConstant){
		m_robotMap.m_drive.drive(1, 270, 0);
	}
	
	//Grab tote, strafe away from wall, drive forward, strafe toward wall, repeat.
	//https://docs.google.com/file/d/0B9czK-IAVhjLMkx3enNrVmVwRHBnaHFnSDEzZlVlZ0ttN01j/edit
	
	//*/
//}

/*else if(m_autonMode == 2)
{
	///
	m_robotMap.m_intake.classsetrightIntakeSolenoid(true);
	m_robotMap.m_intake.setleftIntakeSolenoid(true);
	m_robotMap.m_intake.setrightIntakeMotor(1);
	m_robotMap.m_intake.setleftIntakeMotor(1);
	
	if (m_robotMap.m_drive.getEncoders()[0] < 40 * distanceConstant){
		m_robotMap.m_drive.drive(.5, 90, 0);
	}
	if (m_robotMap.m_drive.getEncoders()[0] < 130 * distanceConstant){
		m_robotMap.m_drive.drive(1, 180, 0);
	}
	if (m_robotMap.m_drive.getEncoders()[0] < 170 * distanceConstant){	
		m_robotMap.m_drive.drive(1, 270, 0);
	}
	if (m_robotMap.m_drive.getEncoders()[0] < 205 * distanceConstant){	
		m_robotMap.m_drive.drive(.7, 180, 0);
	}
	
	//<RAISE TOTE>
	m_robotMap.m_intake.classsetrightIntakeSolenoid(true);
	m_robotMap.m_intake.setleftIntakeSolenoid(true);
	m_robotMap.m_intake.setrightIntakeMotor(1);
	m_robotMap.m_intake.setleftIntakeMotor(1);
	
	if (m_robotMap.m_drive.getEncoders()[0] < 245 * distanceConstant){
		m_robotMap.m_drive.drive(.5, 90, 0);
	}
	if (m_robotMap.m_drive.getEncoders()[0] < 235 * distanceConstant){
		m_robotMap.m_drive.drive(1, 180, 0);
	}
	if (m_robotMap.m_drive.getEncoders()[0] < 275 * distanceConstant){	
		m_robotMap.m_drive.drive(1, 270, 0);
	}
	if (m_robotMap.m_drive.getEncoders()[0] < 310 * distanceConstant){	
		m_robotMap.m_drive.drive(.7, 180, 0);
	}
	
	//<RAISE TOTE>
	m_robotMap.m_intake.classsetrightIntakeSolenoid(true);
	m_robotMap.m_intake.setleftIntakeSolenoid(true);
	m_robotMap.m_intake.setrightIntakeMotor(1);
	m_robotMap.m_intake.setleftIntakeMotor(1);
	
	if (m_robotMap.m_drive.getEncoders()[0] < 350 * distanceConstant){
		m_robotMap.m_drive.drive(.5, 90, 0);
	}
	if (m_robotMap.m_drive.getEncoders()[0] < 440 * distanceConstant){
		m_robotMap.m_drive.drive(1, 180, 0);
	}
	if (m_robotMap.m_drive.getEncoders()[0] < 630 * distanceConstant){	
		m_robotMap.m_drive.drive(1, 270, 0);
	}
	
	//Pick up tote then strafe toward wall. Drive forward a bit then strafe into can to bash it. Drive forward to tote then repeat 2x.
	//https://docs.google.com/file/d/0B9czK-IAVhjLYWJHeFRCVG5iaVd2NUhRSGItU1hfTjNkd1Jn/edit
	
	///
}

else if(m_autonMode == 3)
{
	/*
	 * THIS IS MADNESS!
	 * (A.K.A. something beyond Brandon's desire to attempt)
	double derkahurp=90;
	if (m_robotMap.m_drive.getEncoders()[0] < 180 * distanceConstant && derkahurp<=270){
		m_robotMap.m_drive.drive(1, derkahurp, 0);
		derkahurp++;
	}
	/
	
	//Grab tote then proceed with parabolic motion (toward wall) in order to shove cans and pick up more totes
	//https://docs.google.com/file/d/0B9czK-IAVhjLLW1YZVViSWE1dnNzMkNKc0J2cWlFS3NYZmhZ/edit
	///
}

else if(m_autonMode == 4)
{
	//
	m_robotMap.m_intake.classsetrightIntakeSolenoid(true);
	m_robotMap.m_intake.setleftIntakeSolenoid(true);
	m_robotMap.m_intake.setrightIntakeMotor(1);
	m_robotMap.m_intake.setleftIntakeMotor(1);
	
	if (m_robotMap.m_drive.getEncoders()[0] < 20 * distanceConstant){
		m_robotMap.m_drive.drive(.5, 0, 0);
	}
	
	if (m_robotMap.m_drive.getEncoders()[0] < 70 * distanceConstant){
		m_robotMap.m_drive.drive(0, 0, 1);
	}
	
	if (m_robotMap.m_drive.getEncoders()[0] < 110 * distanceConstant){
		m_robotMap.m_drive.drive(.5, 180, 0);
	}
	 
	 if (m_robotMap.m_drive.getEncoders()[0] < 410 * distanceConstant){
		m_robotMap.m_drive.drive(1, 270, 0);
	}
	
	//Grab first tote, rotate 180deg, grab can then strafe into auto zone
	//https://docs.google.com/file/d/0B9czK-IAVhjLdWJETm1UT3VzRWxzZXZDM1dwSVpXemRxOTJN/edit
	///
}

else if(m_autonMode == 5)
{
	//
	m_robotMap.m_intake.classsetrightIntakeSolenoid(true);
	m_robotMap.m_intake.setleftIntakeSolenoid(true);
	m_robotMap.m_intake.setrightIntakeMotor(1);
	m_robotMap.m_intake.setleftIntakeMotor(1);
	
	if (m_robotMap.m_drive.getEncoders()[0] < 20 * distanceConstant){
		m_robotMap.m_drive.drive(.35, 0, 0);
	}
		
	if (m_robotMap.m_drive.getEncoders()[0] < 320 * distanceConstant){
		m_robotMap.m_drive.drive(1, 270, 0);
	}
	
	//Grab tote in front of bot then back up and grab can behind it, then strafe into auto zone
	//https://docs.google.com/file/d/0B9czK-IAVhjLREdkN3FDRnZKVm9NRFhOSXlfcnhVQzlVT2NZ/edit
	///
	}


else if(m_autonMode == 6)
{
	//
	m_robotMap.m_intake.classsetrightIntakeSolenoid(true);
	m_robotMap.m_intake.setleftIntakeSolenoid(true);
	m_robotMap.m_intake.setrightIntakeMotor(1);
	m_robotMap.m_intake.setleftIntakeMotor(1);
	
	if (m_robotMap.m_drive.getEncoders()[0] < 40 * distanceConstant){
		m_robotMap.m_drive.drive(.5, 90, 0);
	}
	if (m_robotMap.m_drive.getEncoders()[0] < 130 * distanceConstant){
		m_robotMap.m_drive.drive(1, 180, 0);
	}
	if (m_robotMap.m_drive.getEncoders()[0] < 170 * distanceConstant){j
		m_robotMap.m_drive.drive(1, 0, 0);
	}
	if (m_robotMap.m_drive.getEncoders()[0] < 210 * distanceConstant){
		m_robotMap.m_drive.drive(.35, 180, 0);
	}
	
	//<RAISE TOTE>7
	m_robotMap.m_intake.classsetrightIntakeSolenoid(true);
	m_robotMap.m_intake.setleftIntakeSolenoid(true);
	m_robotMap.m_intake.setrightIntakeMotor(1);
	m_robotMap.m_intake.setleftIntakeMotor(1);
	
	if (m_robotMap.m_drive.getEncoders()[0] < 250 * distanceConstant){
		m_robotMap.m_drive.drive(.5, 90, 0);
	}
	if (m_robotMap.m_drive.getEncoders()[0] < 340 * distanceConstant){
		m_robotMap.m_drive.drive(1, 180, 0);
	}
	if (m_robotMap.m_drive.getEncoders()[0] < 500 * distanceConstant){j
		m_robotMap.m_drive.drive(1, 0, 0);
	}
	
	//Pick up first tote, bash first can, drive forward and pick up second tote, then push the second can into the auto zone
	//https://docs.google.com/file/d/0B9czK-IAVhjLOFBCbkJaaTB4QldQMTYtWG45dHBCZXlVMko0/edit
	///
}
else
{
	///
	//Drive forward anyway.
	if (m_robotMap.m_drive.getAveEncoder() < 95 * distanceConstant) 
	{
		m_robotMap.m_drive.drive(0.4, 90, 0);
	}
	
	///
}*/