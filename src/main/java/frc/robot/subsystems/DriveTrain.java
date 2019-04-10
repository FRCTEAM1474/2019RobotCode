package frc.robot.subsystems;

import frc.robot.commands.joystick_control;

import edu.wpi.first.wpilibj.PWMTalonSRX;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.Talon;

public class DriveTrain extends Subsystem{
	
	static Talon m_frontLeft = new Talon(0);
	static Talon m_rearLeft = new Talon(1);
	static SpeedControllerGroup m_left = new SpeedControllerGroup(m_frontLeft, m_rearLeft);


	static Talon m_frontRight = new Talon(2);
	static Talon m_rearRight = new Talon(3);
	static SpeedControllerGroup m_right = new SpeedControllerGroup(m_frontRight, m_rearRight);


	public static DifferentialDrive RobotDrive = new DifferentialDrive(m_left, m_right);

	public static DoubleSolenoid Shifter = new DoubleSolenoid(0, 1);
	public static DoubleSolenoid frontLifter = new DoubleSolenoid(2, 3);
	public static DoubleSolenoid backLifter = new DoubleSolenoid(6, 7);


//public static DifferentialDrive RobotDrive;	
	
	public static Timer m_timer = new Timer();
	
	public void arcadeDrive(double x, double y) {
		RobotDrive.arcadeDrive(x, y);
	}
	
	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(new joystick_control());
		// TODO Auto-generated method stub
		
	}
	
public void Stop() {
	RobotDrive.arcadeDrive(0,0);
}

}
