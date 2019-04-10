package frc.robot.commands;

import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import frc.robot.RobotMap;
import frc.robot.subsystems.DriveTrain;

public class frontLifterButton extends Command{
    public frontLifterButton() {
    }

    // Called just before this Command runs the first time
    @Override
    protected void initialize() {
        setTimeout(5);
    }

    // Called repeatedly when this Command is scheduled to run
    @Override
    protected void execute() {
        DriveTrain.frontLifter.set(Value.kReverse);
    }

    // Make this return true when this Command no longer needs to run execute()
    @Override
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    @Override
    protected void end(){
        DriveTrain.frontLifter.set(Value.kForward);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    @Override
    protected void interrupted() {
        end();
    }
}
