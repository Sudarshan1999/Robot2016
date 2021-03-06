package org.usfirst.frc.team1165.robot.commands;

import org.usfirst.frc.team1165.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;


public class PrepareForLowBar extends Command
{

	public PrepareForLowBar()
	{
		requires(Robot.robotDrive);
	}

	// Called just before this Command runs the first time
	protected void initialize()
	{
		
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute()
	{
		Robot.arm.moveArmToPoint(Robot.absoluteEncoder.lowerLimit);
	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished()
	{
		return Robot.absoluteEncoder.atLowerLimit();
	}

	// Called once after isFinished returns true
	protected void end()
	{
		Robot.arm.moveArm(0);
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted()
	{
	}
}