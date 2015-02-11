
package org.usfirst.frc.team1732.robot;

import org.usfirst.frc.team1732.systems.IO;
import org.usfirst.frc.team1732.systems.RobotMap;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot
{
	
	// creates all buttons and joysticks
	static IO m_io;
		
	// creates all robot parts (motors, solenoids, sensors)
	static RobotMap m_robotMap;
	
	// auto start time
	long startTime;
	
	// allows us to multiply distances (distances will assume cm)
	double distanceConstant;
	
	/**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit()
    {
    	m_io = new IO();
    	
    	m_robotMap = new RobotMap();
    }

    /*
     * Disabled Methods
     */
    /**
     * This function is run when the robot is first in
     * disabled mode.
     */
    public void disabledInit()
    {
    	m_robotMap.makeSafe();
    }
    
    private boolean m_dpFirstRun = true;
    /**
     * This function is called periodically during disabled mode.
     */
    public void disabledPeriodic()
    {
    	if (m_dpFirstRun)
    	{
            System.out.println("In disabled Periodic mode!");
            m_dpFirstRun = false;
        }
    }
    
    /*
     * Autonomous Methods
     */
    int m_autonMode;
    /**
     * This function is run when the robot is first in
     * autonomous mode. 
     */
    public void autonomousInit()
    {
    	/*
    	startTime = System.currentTimeMillis();
    	m_autonMode = (int) SmartDashboard.getNumber("auton mode");
    	distanceConstant=1;
    	*/
    }
    
    /**
     * This function is called periodically during autonomous mode.
     */
    //*/
    //All distance values are completely wrong.
    public void autonomousPeriodic()
    {
    	if(m_autonMode == 1)
    	{
    		if (m_robotMap.m_drive.getEncoders()[0] < 95 * distanceConstant) 
    		{
    			m_robotMap.m_drive.drive(1, 90, 0);
    		}
    	}
    	
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
    	}
    	
    	else if(m_autonMode == 2)
    	{
    		/*/
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
    		
    		//*/
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
    		*/
    		
    		//Grab tote then proceed with parabolic motion (toward wall) in order to shove cans and pick up more totes
    		//https://docs.google.com/file/d/0B9czK-IAVhjLLW1YZVViSWE1dnNzMkNKc0J2cWlFS3NYZmhZ/edit
    		//*/
    	}
    	
    	else if(m_autonMode == 4)
    	{
    		/*/
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
    		
    		//<GRAB WITH CRAäæ>
    		 
    		 if (m_robotMap.m_drive.getEncoders()[0] < 410 * distanceConstant){
    			m_robotMap.m_drive.drive(1, 270, 0);
    		}
    		
    		//Grab first tote, rotate 180deg, grab can then strafe into auto zone
    		//https://docs.google.com/file/d/0B9czK-IAVhjLdWJETm1UT3VzRWxzZXZDM1dwSVpXemRxOTJN/edit
    		//*/
    	}
    	
    	else if(m_autonMode == 5)
    	{
    		/*/
    		m_robotMap.m_intake.classsetrightIntakeSolenoid(true);
    		m_robotMap.m_intake.setleftIntakeSolenoid(true);
    		m_robotMap.m_intake.setrightIntakeMotor(1);
    		m_robotMap.m_intake.setleftIntakeMotor(1);
    		
    		if (m_robotMap.m_drive.getEncoders()[0] < 20 * distanceConstant){
    			m_robotMap.m_drive.drive(.35, 0, 0);
    		}
    		
    		//<GRAB WITH Craäæ>
    		
    		if (m_robotMap.m_drive.getEncoders()[0] < 320 * distanceConstant){
    			m_robotMap.m_drive.drive(1, 270, 0);
    		}
    		
    		//Grab tote in front of bot then back up and grab can behind it, then strafe into auto zone
    		//https://docs.google.com/file/d/0B9czK-IAVhjLREdkN3FDRnZKVm9NRFhOSXlfcnhVQzlVT2NZ/edit
    		//*/
       	}
    	
    	
    	else if(m_autonMode == 6)
    	{
    		/*/
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
    		//*/
    	}
    	else
    	{
    		//*/
    		//Drive forward anyway.
    		if (m_robotMap.m_drive.getEncoders()[0] < 95 * distanceConstant) 
    		{
    			m_robotMap.m_drive.drive(1, 90, 0);
    		}
    		
    		//*/
    	}
    	
    }
    //*/
    
    
    /*
     * Teleop Methods
     */
    /**
     * This function is run when the robot is first in
     * teleop mode.
     */
    public void teleopInit()
    {
    	m_robotMap.m_drive.teleopInit();
    }
    
    int test = 0;
    /**
     * This function is called periodically during teleop mode.
     */
    public void teleopPeriodic()
    {
    	//* drive
    	m_robotMap.m_drive.drive(m_io);
    	//*/
    	
    	//*/
   		setDashboard();
       	//*/
    }
    
    /*
     * Test Methods
     */
    /**
     * This function is run when the robot is first in
     *
     * test mode.
     */
    public void testInit()
    {
    	
    }
    
    private boolean tpFirstRun = true;
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic()
    {
    	if (tpFirstRun)
    	{
            System.out.println("In test Periodic mode!");
            tpFirstRun = false;
        }
    }
    
    //*
    public void setDashboard() {
    	SmartDashboard.putNumber("Left Joystick X", m_io.getLeftX());
    	SmartDashboard.putNumber("Left Joystick Y", m_io.getLeftY());
    	SmartDashboard.putNumber("Right Joystick X", m_io.getRightX());
    	SmartDashboard.putNumber("Right Joystick Y", m_io.getRightY());
    	SmartDashboard.putBoolean("Left Joystick Arcade", m_io.getLeftArcade());
    	SmartDashboard.putBoolean("Right Joystick Arcade", m_io.getRightArcade());
    	SmartDashboard.putBoolean("Shift", m_io.getShift());
    	
    	double[][] talonInfo = m_robotMap.m_drive.getCANTalon();
    	SmartDashboard.putNumber("Front Left Motor Output Current", talonInfo[0][0]);
    	SmartDashboard.putNumber("Front Right Motor Output Current", talonInfo[1][0]);
    	SmartDashboard.putNumber("Rear Left Motor Output Current", talonInfo[2][0]);
    	SmartDashboard.putNumber("Rear Right Motor Output Current", talonInfo[3][0]);
    	SmartDashboard.putNumber("Front Left Motor Temperature", talonInfo[0][1]);
    	SmartDashboard.putNumber("Front Right Motor Temperature", talonInfo[1][1]);
    	SmartDashboard.putNumber("Rear Left Motor Temperature", talonInfo[2][1]);
    	SmartDashboard.putNumber("Rear Right Motor Temperature", talonInfo[3][1]);
    	
    	SmartDashboard.putNumber("Finesse Mode", m_io.getFinesseMode());
    	//SmartDashboard.putNumber("Lift Pot", m_robotMap.m_lift.getLiftPot());
    	SmartDashboard.putNumber("Drive Gyro", m_robotMap.m_drive.getGyro()%360);
    	
    	double[] accels = m_robotMap.m_drive.getAccels();
    	SmartDashboard.putNumber("Accelerometer X", accels[0]);
    	SmartDashboard.putNumber("Accelerometer Y", accels[1]);
    	SmartDashboard.putNumber("Accelerometer Z", accels[2]);
    	
    	//boolean[] limits = m_robotMap.m_craaa.getLimits();
    	//SmartDashboard.putBoolean("Craaa Top Limit", limits[0]);
    	//SmartDashboard.putBoolean("Craaa Bottom Limit", limits[1]);
    }//*/
}