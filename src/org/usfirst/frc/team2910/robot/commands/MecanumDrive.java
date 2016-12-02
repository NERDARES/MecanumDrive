package org.usfirst.frc.team2910.robot.commands;

import org.usfirst.frc.team2910.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class MecanumDrive extends Command {

	public static final double SPEED_LIMIT = 1.0;
    public MecanumDrive() {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.driveTrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	
    	double fLeft = 	-Robot.oi.controller.getLeftY() * SPEED_LIMIT;
    	double bLeft = Robot.oi.controller.getRightY() * SPEED_LIMIT;
    	
    	double fRight = Robot.oi.controller.getRightY() * SPEED_LIMIT;
    	double bRight = -Robot.oi.controller.getRightY() * SPEED_LIMIT;
    	Robot.driveTrain.drive(fLeft, fRight, bLeft, bRight);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
