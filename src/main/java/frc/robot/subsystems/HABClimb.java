package frc.robot.subsystems;

import frc.robot.commands.joystick_control;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

public class HABClimb extends Subsystem{

    public static DoubleSolenoid FrontLift = new DoubleSolenoid(2, 3);
    public static DoubleSolenoid BackLift = new DoubleSolenoid(4, 5);
	
	public static Timer m_timer = new Timer();
	
	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(new joystick_control());
		// TODO Auto-generated method stub
		
	}

}
