
package org.usfirst.frc.team1732.robot;

import org.usfirst.frc.team1732.systems.IO;
import org.usfirst.frc.team1732.systems.RobotMap;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Timer;
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
	private IO m_io;
		
	// creates all robot parts (motors, solenoids, sensors)
	private RobotMap m_robotMap;
	
	// auto start time
	private long startTime;
	
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
        Timer.delay(0.001);
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
    	startTime = System.currentTimeMillis();
    	m_autonMode = (int) SmartDashboard.getNumber("auton mode");
    }
    
    /**
     * This function is called periodically during autonomous mode.
     */
    public void autonomousPeriodic()
    {
    	if(m_autonMode == 1)
    	{
    		//Grab tote, strafe away from wall, drive forward, strafe toward wall, repeat.
    		//https://docs.google.com/file/d/0B9czK-IAVhjLMkx3enNrVmVwRHBnaHFnSDEzZlVlZ0ttN01j/edit
    	}
    	
    	else if(m_autonMode == 2)
    	{
    		//Pick up tote then strafe toward wall. Drive forward a bit then strafe into can to bash it. Drive forward to tote then repeat 2x.
    		//https://docs.google.com/file/d/0B9czK-IAVhjLYWJHeFRCVG5iaVd2NUhRSGItU1hfTjNkd1Jn/edit
    		
    	}
    	
    	else if(m_autonMode == 3)
    	{
    		//Grab tote then proceed with parabolic motion (toward wall) in order to shove cans and pick up more totes
    		//https://docs.google.com/file/d/0B9czK-IAVhjLLW1YZVViSWE1dnNzMkNKc0J2cWlFS3NYZmhZ/edit
    		
    	}
    	
    	else if(m_autonMode == 4)
    	{
    		//Grab first tote, rotate 180deg, grab can then strafe into auto zone
    		//https://docs.google.com/file/d/0B9czK-IAVhjLdWJETm1UT3VzRWxzZXZDM1dwSVpXemRxOTJN/edit
    		
    	}
    	
    	else if(m_autonMode == 5)
    	{
    		//Grab tote in front of bot then back up and grab can behind it, then strafe into auto zone
    		//https://docs.google.com/file/d/0B9czK-IAVhjLREdkN3FDRnZKVm9NRFhOSXlfcnhVQzlVT2NZ/edit
    		m_robotMap.m_intake.setleftIntakeMotor(0);
    		m_robotMap.m_intake.setrightIntakeMotor(0);
    		m_robotMap.m_intake.setleftIntakeSolenoid(true);
    		m_robotMap.m_intake.setrightIntakeSolenoid(true);
    		
    		while(System.currentTimeMillis() - startTime < 500) 
    		{
    			m_robotMap.m_drive.drive(.2, 270, 0);
    		}
    		
       	}
    	
    	
    	else if(m_autonMode == 6)
    	{
    		//Pick up first tote, bash first can, drive forward and pick up second tote, then push the second can into the auto zone
    		//https://docs.google.com/file/d/0B9czK-IAVhjLOFBCbkJaaTB4QldQMTYtWG45dHBCZXlVMko0/edit
    		
    	}
    	else
    	{
    		//Drive forward anyway.
    		if (System.currentTimeMillis() - startTime < 3000) 
    		{
    			m_robotMap.m_drive.drive(1, 90, 0);
    		}
    		else
    		{
    			m_robotMap.m_drive.drive(0, 0, 0);
    		}
    	}
    }
    
    
    
    /*
     * Teleop Methods
     */
    /**
     * This function is run when the robot is first in
     * teleop mode.
     */
    public void teleopInit()
    {
    	
    }
    
    int m_slower = 0;
    /**
     * This function is called periodically during teleop mode.
     */
    public void teleopPeriodic()
    {
    	// drive
    	m_robotMap.m_drive.drive(m_io);
    	if (m_slower++%10 == 0) {
    		setDashboard();
    	}
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
        Timer.delay(0.001);
    }
    
    public void setDashboard() {
    	SmartDashboard.putNumber("Left Joystick X", m_io.getLeftX());
    	SmartDashboard.putNumber("Left Joystick Y", m_io.getLeftY());
    	SmartDashboard.putNumber("Right Joystick X", m_io.getRightX());
    	SmartDashboard.putNumber("Right Joystick Y", m_io.getRightY());
    	SmartDashboard.putBoolean("Left Joystick Arcade", m_io.getLeftArcade());
    	SmartDashboard.putBoolean("Right Joystick Arcade", m_io.getRightArcade());
    	SmartDashboard.putBoolean("Right Joystick Shift", m_io.getLeftShift());
    	SmartDashboard.putBoolean("Right Joystick Shift", m_io.getRightShift());
    	SmartDashboard.putBoolean("Left Joystick, Fast Left Finesse", m_io.getFinesse()[0][0]);
    	SmartDashboard.putBoolean("Left Joystick, Slow Left Finesse", m_io.getFinesse()[0][1]);
    	SmartDashboard.putBoolean("Left Joystick, Fast Right Finesse", m_io.getFinesse()[0][2]);
    	SmartDashboard.putBoolean("Left Joystick, Slow Right Finesse", m_io.getFinesse()[0][3]);
    	SmartDashboard.putBoolean("Right Joystick, Fast Left Finesse", m_io.getFinesse()[1][0]);
    	SmartDashboard.putBoolean("Right Joystick, Slow Left Finesse", m_io.getFinesse()[1][1]);
    	SmartDashboard.putBoolean("Right Joystick, Fast Right Finesse", m_io.getFinesse()[1][2]);
    	SmartDashboard.putBoolean("Right Joystick, Slow Right Finesse", m_io.getFinesse()[1][3]);
    	SmartDashboard.putNumber("Gyro", m_robotMap.m_drive.getGyro());
    	SmartDashboard.putNumber("Accelerometer X", m_robotMap.m_drive.getAccels()[0]);
    	SmartDashboard.putNumber("Accelerometer Y", m_robotMap.m_drive.getAccels()[1]);
    	SmartDashboard.putNumber("Accelerometer Z", m_robotMap.m_drive.getAccels()[2]);
    	SmartDashboard.putNumber("Endocer Left Front", m_robotMap.m_drive.getEncoders()[0]);
    	SmartDashboard.putNumber("Endocer Right Front", m_robotMap.m_drive.getEncoders()[1]);
    	SmartDashboard.putNumber("Endocer Left Back", m_robotMap.m_drive.getEncoders()[2]);
    	SmartDashboard.putNumber("Endocer Right Back", m_robotMap.m_drive.getEncoders()[3]);
    	SmartDashboard.putNumber("Craaa Encoder", m_robotMap.m_craaa.getEncoderValue());
    	SmartDashboard.putBoolean("Craaa Top Limit", m_robotMap.m_craaa.getLimits()[0]);
    	SmartDashboard.putBoolean("Craaa Bottom Limit", m_robotMap.m_craaa.getLimits()[1]);
    }
}