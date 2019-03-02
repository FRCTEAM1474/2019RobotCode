package frc.robot;

import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import frc.robot.subsystems.*;
import frc.robot.commands.*;

public class Robot extends IterativeRobot 
{
	public static DriveTrain DriveTrain;
	public static CargoConveyer CargoConveyer;
	public static Hatch Hatch;
	public static LEDLights LEDLights;
	public static OI OI;
	public static Compressor compressor;
	public static HABClimb HABClimb;


	Command m_autonomousCommand;
	SendableChooser<Command> m_chooser = new SendableChooser<>();

	@Override
	public void robotInit() {
		System.out.println("Robot INIT");
		
		DriveTrain = new DriveTrain();
		CargoConveyer = new CargoConveyer();
		Hatch = new Hatch();
		LEDLights = new LEDLights();
		OI = new OI();
		compressor = new Compressor();
		HABClimb = new HABClimb();

		CameraServer.getInstance().startAutomaticCapture();
		CameraServer.getInstance().startAutomaticCapture();
		CameraServer.getInstance().startAutomaticCapture();
	
	}

	@Override
	public void disabledInit()
	{

	}

	@Override
	public void disabledPeriodic() 
	{
		Scheduler.getInstance().run();
	}

	@Override
	public void autonomousInit() 
	{

	}

	@Override
	public void autonomousPeriodic() {
		Scheduler.getInstance().run();
	}

	@Override
	public void teleopInit() 
	{
		if (m_autonomousCommand != null) 
		{
			m_autonomousCommand.cancel();
		}
	}
	
	@Override
	public void teleopPeriodic() 
	{
		Scheduler.getInstance().run();
	}

	@Override
	public void testPeriodic() 
	{

	}
}
