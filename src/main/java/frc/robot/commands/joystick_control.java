package frc.robot.commands;

import frc.robot.*;
import edu.wpi.first.wpilibj.command.Command;
import frc.robot.subsystems.DriveTrain;


public class joystick_control extends Command {
	public joystick_control() {
	requires(Robot.DriveTrain);
	}
	protected void initialize() {
		setTimeout(5);
	}
	protected void execute() {
		DriveTrain.RobotDrive.arcadeDrive(RobotMap.DriverStick.getY(), RobotMap.DriverStick.getX());
	}
	protected boolean isFinished() {
		return false;
	}

	@Override
	protected void interrupted() {
		end();
	}
}
