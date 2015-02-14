
package org.usfirst.frc.team1732.robot;

import org.usfirst.frc.team1732.systems.Auto;
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
    
    Auto auto;
    /*
     * Autonomous Methods
     */
    int m_autonMode;
    int mode;
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
    	auto = new Auto();
    	mode = (int) SmartDashboard.getNumber("Auton Mode", 0);
    }
    
    /**
     * This function is called periodically during autonomous mode.
     */
    //*/
    //All distance values are completely wrong.
    public void autonomousPeriodic()
    {
    	auto.doAuto(m_robotMap, m_io, m_autonMode);
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