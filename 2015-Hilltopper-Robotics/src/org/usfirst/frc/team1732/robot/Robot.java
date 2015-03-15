
package org.usfirst.frc.team1732.robot;

import org.usfirst.frc.team1732.systems.IO;
import org.usfirst.frc.team1732.systems.RobotMap;

import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.PowerDistributionPanel;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Robot extends IterativeRobot
{
	
	// creates all buttons and joysticks
	private IO m_io;
		
	// creates all robot parts (motors, solenoids, sensors)
	private RobotMap m_robotMap;
	
	// creates a way to chose auto mode
	private SendableChooser choice;
		
	private PowerDistributionPanel pdp = new PowerDistributionPanel();
	
    public void robotInit()
    {
    	m_io = new IO();
    	
    	m_robotMap = new RobotMap();
    	
    	choice = new SendableChooser();
    	choice.addDefault("Drive Forward", Integer.valueOf(0));
    	choice.addObject("Get Recycling Container", Integer.valueOf(1));
    	choice.addObject("Get Recycling Container Long", Integer.valueOf(3));
    	choice.addObject("Reset Encoder", Integer.valueOf(4));
    	choice.addObject("Stop", Integer.valueOf(2));
    	SmartDashboard.putData("Auton Chooser", choice);
    	
    	CameraServer camera = CameraServer.getInstance();
    	camera.setQuality(20);
    	camera.startAutomaticCapture("cam0");
    }
    
    Object mode;
    public static long startTime;
    public void autonomousInit() {
    	m_robotMap.init();
    	
    	mode = choice.getSelected();
    	
    	startTime = System.currentTimeMillis();
   	}
    boolean once = true;
    public void autonomousPeriodic()
    {
    	// drive forward
    	if (mode == Integer.valueOf(0)) {
	    	if (System.currentTimeMillis() - startTime < 3000) {
	    		m_robotMap.m_drive.drive(0.5, 0, 0);
	    	}
    	}	
    	// get Recycling Container 
    	else if (mode == Integer.valueOf(1)) {
    		if (System.currentTimeMillis() - startTime < 1000) {
    			m_robotMap.m_drive.drive(0.2, 180, 0);
    			m_robotMap.m_craaa.controlCraaa(0, false);
    		} else if (System.currentTimeMillis() - startTime < 1500) {
    			m_robotMap.m_drive.drive(0, 0, 0);
    			m_robotMap.m_craaa.controlCraaa(0, true);
    		} else if (System.currentTimeMillis() - startTime < 5000) {
    			m_robotMap.m_drive.drive(0.3, 0, 0);
    			m_robotMap.m_craaa.controlCraaa(0, true);
    		} else if (System.currentTimeMillis() - startTime < 6250){
    			m_robotMap.m_craaa.controlCraaa(0, false);
    		}
    	}
    	// stop
    	else if (mode == Integer.valueOf(2)) {
    		m_robotMap.m_drive.drive(0, 0, 0);
    	}
    	// get Recycling Container long
    	else if (mode == Integer.valueOf(3)) {
    		 if (System.currentTimeMillis() - startTime < 500) {
    			m_robotMap.m_drive.drive(0, 0, 0);
    			m_robotMap.m_craaa.controlCraaa(0, true);
    		} else if (System.currentTimeMillis() - startTime < 6000) {
    			m_robotMap.m_drive.drive(0.27, 0, 0);
    			m_robotMap.m_craaa.controlCraaa(0, true);
    		} else {
    			m_robotMap.m_drive.drive(0, 0, 0);
    			m_robotMap.m_craaa.controlCraaa(0, false);
    		}
    	}
    	else if (mode == Integer.valueOf(4)) {
    		if (System.currentTimeMillis() - startTime < 5000) {
    			m_robotMap.m_lift.setIntakes(false);
    			m_robotMap.m_lift.setRollers(0);
    			m_robotMap.m_lift.setLift(-0.2);
    		} else if (once) {
    			m_robotMap.m_lift.resetEncoder();
    			once = false;
    		}
    	}
    }
    
    public void teleopInit() { m_robotMap.init(); }
    
    byte i = 0;
    public void teleopPeriodic()
    {
  		m_robotMap.teleop(m_io);
    	
   		if (i++ % 10 == 0) { setDashboard(); }

    }
    
    public void setDashboard() {
    	
    	// io    	
    	
    	SmartDashboard.putNumber("Magnitude", m_io.getMagnitude());
    	SmartDashboard.putNumber("Direction", m_io.getDirection());
    	SmartDashboard.putNumber("Rotation", m_io.getRotation());
    	SmartDashboard.putNumber("X", m_io.getX());
    	SmartDashboard.putNumber("Y", m_io.getY());
    	
    	SmartDashboard.putNumber("Left Magnitude", m_io.getLeftMagnitude());
    	SmartDashboard.putNumber("Left Direction", m_io.getLeftDirection());
    	SmartDashboard.putNumber("Left Rotation", m_io.getLeftRotation());
    	SmartDashboard.putNumber("Left X", m_io.getLeftX());
    	SmartDashboard.putNumber("Left Y", m_io.getLeftY());
    	
    	SmartDashboard.putNumber("Right Magnitude", m_io.getRightMagnitude());
    	SmartDashboard.putNumber("Right Direction", m_io.getRightDirection());
    	SmartDashboard.putNumber("Right Rotation", m_io.getRightRotation());
    	SmartDashboard.putNumber("Right X", m_io.getRightX());
    	SmartDashboard.putNumber("Right Y", m_io.getRightY());
    	// drive
    	double[][] talonInfo = m_robotMap.m_drive.getCANTalon();
    	
    	SmartDashboard.putNumber("Front Left Motor Output Current", talonInfo[0][0]);
    	SmartDashboard.putNumber("Front Right Motor Output Current", talonInfo[1][0]);
    	SmartDashboard.putNumber("Rear Left Motor Output Current", talonInfo[2][0]);
    	SmartDashboard.putNumber("Rear Right Motor Output Current", talonInfo[3][0]);
    	
    	SmartDashboard.putNumber("Front Left Motor Temperature", talonInfo[0][1]);
    	SmartDashboard.putNumber("Front Right Motor Temperature", talonInfo[1][1]);
    	SmartDashboard.putNumber("Rear Left Motor Temperature", talonInfo[2][1]);
    	SmartDashboard.putNumber("Rear Right Motor Temperature", talonInfo[3][1]);
    	
    	SmartDashboard.putNumber("Drive Gyro", m_robotMap.m_drive.getGyro());
    	
    	SmartDashboard.putNumber("Craaa Output Current", m_robotMap.m_craaa.getCANTalon());       
    	SmartDashboard.putNumber("Craaa Temp", m_robotMap.m_craaa.getCANTalonHeat());
    	SmartDashboard.putNumber("Lift Temp", m_robotMap.m_lift.getCANTalonHeat());
    	SmartDashboard.putNumber("Lift Output Current", m_robotMap.m_lift.getCANTalon());     
    	
    	int[] modes = m_robotMap.m_lift.getModes();
    	SmartDashboard.putNumber("SUPER", modes[0]);
    	SmartDashboard.putNumber("HUMAN_PLAYER", modes[1]);
    	SmartDashboard.putNumber("CENTRE_TOTE", modes[2]);
    	SmartDashboard.putNumber("LATCH", modes[3]);
    	SmartDashboard.putNumber("OUT", modes[4]);
    	SmartDashboard.putNumber("DROP", modes[5]);
    	
    	SmartDashboard.putNumber("Lift Encoder", m_robotMap.m_lift.getEncoder());
    	/*SmartDashboard.putNumber("Current 0", pdp.getCurrent(0));
    	SmartDashboard.putNumber("Current 1", pdp.getCurrent(1));
    	SmartDashboard.putNumber("Current 2", pdp.getCurrent(2));
    	SmartDashboard.putNumber("Current 3", pdp.getCurrent(3));
    	SmartDashboard.putNumber("Current 4", pdp.getCurrent(4));
    	SmartDashboard.putNumber("Current 5", pdp.getCurrent(5));
    	SmartDashboard.putNumber("Current 6", pdp.getCurrent(6));
    	SmartDashboard.putNumber("Current 7", pdp.getCurrent(7));
    	SmartDashboard.putNumber("Current 8", pdp.getCurrent(8));
    	SmartDashboard.putNumber("Current 9", pdp.getCurrent(9));
    	SmartDashboard.putNumber("Current 10", pdp.getCurrent(10));
    	SmartDashboard.putNumber("Current 11", pdp.getCurrent(11));
    	SmartDashboard.putNumber("Current 12", pdp.getCurrent(12));
    	SmartDashboard.putNumber("Current 13", pdp.getCurrent(13));
    	SmartDashboard.putNumber("Current 14", pdp.getCurrent(14));
    	SmartDashboard.putNumber("Current 15", pdp.getCurrent(15));*/
    }
    
    public void disabledInit() { m_robotMap.makeSafe(); }
    public void disabledPeriodic() { setDashboard(); }
}