
package org.usfirst.frc.team1732.robot;

import com.maggieklein.RobotMap;

import edu.wpi.first.wpilibj.IterativeRobot;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {
	RobotMap robotMap;
	/**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {
    	robotMap = new RobotMap(); 
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {

    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
    	String output = "";
    	output = output + "limit switch output:" + robotMap.limitSwitch.get() +"\n";
    	output = output + "gyro angle:" + robotMap.gyro.getAngle() + "\n";
    	output = output + "gyro rate:" + robotMap.gyro.getRate() + "\n";
    	output = output + "pot output:" + robotMap.pot.getValue() + "\n"; 
    	output = output + "photo output:" + robotMap.photo.get() + "\n";
    	System.out.print(output);
    	
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
    
    }
    
}
