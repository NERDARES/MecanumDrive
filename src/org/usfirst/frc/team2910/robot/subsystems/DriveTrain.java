package org.usfirst.frc.team2910.robot.subsystems;
import org.usfirst.frc.team2910.robot.RobotMap;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;

/**
 *
 */
public class DriveTrain extends Subsystem {
    
	private SpeedController frontLeft = new Talon(RobotMap.DRIVETRAIN_FRONT_LEFT);
	private SpeedController frontRight = new Talon(RobotMap.DRIVETRAIN_FRONT_RIGHT);
	private SpeedController backLeft = new Talon(RobotMap.DRIVETRAIN_BACK_LEFT);
	private SpeedController backRight = new Talon(RobotMap.DRIVETRAIN_BACK_RIGHT);
	
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	public void initDefaultCommand() {
		
	}
	
    public void drive(double FLeft, double FRight, double BLeft, double BRight) {
    	frontLeft.set(FLeft);
    	frontRight.set(FRight);
    	backLeft.set(BLeft);
    	backRight.set(BRight);
    }
}

