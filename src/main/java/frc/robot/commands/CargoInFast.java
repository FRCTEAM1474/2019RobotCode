package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import frc.robot.subsystems.CargoConveyer;

public class CargoInFast extends Command {

    public CargoInFast() {
        requires(Robot.CargoConveyer);
    }

    // Called just before this Command runs the first time
    @Override
    protected void initialize() {
        setTimeout(5);
    }

    // Called repeatedly when this Command is scheduled to run
    @Override
    protected void execute() {
        CargoConveyer.CargoMC.set(1.0);
    }

    // Make this return true when this Command no longer needs to run execute()
    @Override
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    @Override
    protected void end() {
        CargoConveyer.CargoMC.set(0.0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    @Override
    protected void interrupted() {
        end();
    }
}
