
package org.usfirst.frc.team1732.robot;

import org.usfirst.frc.team1732.systems.IO;
import org.usfirst.frc.team1732.systems.RobotMap;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Robot extends IterativeRobot
{
	
	// creates all buttons and joysticks
	private IO m_io;
		
	// creates all robot parts (motors, solenoids, sensors)
	private RobotMap m_robotMap;
	
    public void robotInit()
    {
    	m_io = new IO();
    	
    	m_robotMap = new RobotMap();
    }
    
    public static int a = 0;
    public void disabledPeriodic()
    {
    	if (++a % 100 == 0) {
    		System.out.println(a);
    	}
    }

    public static long startTime;
    public void autonomousInit() { startTime = System.currentTimeMillis(); }
    
    public void autonomousPeriodic()
    {
    	if (System.currentTimeMillis() - startTime < 1000) {
    		m_robotMap.m_drive.drive(0.5, 0, 0);
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
    	SmartDashboard.putNumber("Craaa Height Slider", m_io.getCraaaHeight());
    	
    	SmartDashboard.putNumber("Finesse Mode", m_io.getFinesseMode());
    	SmartDashboard.putNumber("Arcade Mode", m_io.getArcade());
    	
    	SmartDashboard.putNumber("Magnitude", m_io.getMagnitude());
    	SmartDashboard.putNumber("Direction", m_io.getDirection());
    	SmartDashboard.putNumber("Rotation", m_io.getRotation());
    	
    	SmartDashboard.putNumber("Left Magnitude", m_io.getLeftMagnitude());
    	SmartDashboard.putNumber("Left Direction", m_io.getLeftDirection());
    	SmartDashboard.putNumber("Left Rotation", m_io.getLeftRotation());
    	SmartDashboard.putNumber("Right Magnitude", m_io.getRightMagnitude());
    	SmartDashboard.putNumber("Right Direction", m_io.getRightDirection());
    	SmartDashboard.putNumber("Right Rotation", m_io.getRightRotation());
    	SmartDashboard.putNumber("Left X", m_io.getLeftX());
    	SmartDashboard.putNumber("Right X", m_io.getRightX());
    	SmartDashboard.putNumber("Left Y", m_io.getLeftY());
    	SmartDashboard.putNumber("Right Y", m_io.getRightY());
    	SmartDashboard.putNumber("Left Rotation", m_io.getLeftRot());
    	SmartDashboard.putNumber("Right Rotation", m_io.getRightRot());
    	
    	SmartDashboard.putBoolean("Cartesian", m_io.getCartestian());
    	
    	SmartDashboard.putBoolean("Craaa Angle", m_io.getCraaaAngle());
    	SmartDashboard.putBoolean("Craaa Down", m_io.getCraaaDown());
    	SmartDashboard.putBoolean("Craaa Up", m_io.getCraaaUp());
    	SmartDashboard.putBoolean("Intake Extend", m_io.getIntakeExtend());
    	SmartDashboard.putBoolean("Lift Tote", m_io.getLiftTote());
    	SmartDashboard.putBoolean("Drop Tote Stack", m_io.getDropToteStack());
    	SmartDashboard.putBoolean("Tote In", m_io.getToteIn());
    	SmartDashboard.putBoolean("Tote Out", m_io.getToteOut());
    	
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
    	
    	double[] accels = m_robotMap.m_drive.getAccels();
    	
    	SmartDashboard.putNumber("Accelerometer X", accels[0]);
    	SmartDashboard.putNumber("Accelerometer Y", accels[1]);
    	SmartDashboard.putNumber("Accelerometer Z", accels[2]);
    	
    	// lift
    	SmartDashboard.putNumber("Lift Minimum Encoder Value", m_robotMap.m_lift.getMinimum());
    	SmartDashboard.putNumber("Lift Current Encoder Value", m_robotMap.m_lift.getEncoder());
    	SmartDashboard.putNumber("Lift Height From Bottom", m_robotMap.m_lift.getDistanceFromBot());
    	SmartDashboard.putNumber("Lift Percantage To Top", m_robotMap.m_lift.getPercentageToTop());
    	
    	// craaa
    	SmartDashboard.putNumber("Craaa Minimum Encoder Value", m_robotMap.m_craaa.getMinumum());
    	SmartDashboard.putNumber("Craaa Current Encoder Value", m_robotMap.m_craaa.getEncoder());
    	SmartDashboard.putNumber("Craaa Height From Bottom", m_robotMap.m_craaa.getDistanceFromBot());
    	SmartDashboard.putNumber("Craaa Percentage to Top", m_robotMap.m_craaa.getPercentageToTop());
    	                
    }
    
    public void disabledInit() { m_robotMap.makeSafe(); }
}