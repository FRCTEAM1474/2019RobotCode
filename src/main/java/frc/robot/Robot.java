/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/
package frc.robot;


import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.smartdashboard.*;
import edu.wpi.first.networktables.*;
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


	Command m_autonomousCommand;
	SendableChooser<Command> m_chooser = new SendableChooser<>();

	//SmartDashboard.putNumber("LimelightX", x);
	//SmartDashboard.putNumber("LimelightY", y);
	//SmartDashboard.putNumber("LimelightArea", area);



	/**
	 * This function is run when the robot is first started up and should be
	 * used for any initialization code.
	 */
	@Override
	public void robotInit() {
		System.out.println("Robot INIT");
		DriveTrain = new DriveTrain();
		CargoConveyer = new CargoConveyer();
		Hatch = new Hatch();
		LEDLights = new LEDLights();
		OI = new OI();
		compressor = new Compressor();

		CameraServer.getInstance().startAutomaticCapture();


	
	}

	/**
	 * This function is called once each time the robot enters Disabled mode.
	 * You can use it to reset any subsystem information you want to clear when
	 * the robot is disabled.
	 */
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

	/**
	 * This function is called periodically during autonomous.
	 */
	@Override
	public void autonomousPeriodic() {
		Scheduler.getInstance().run();
	}

	@Override
	public void teleopInit() 
	{
		// This makes sure that the autonomous stops running when
		// teleop starts running. If you want the autonomous to
		// continue until interrupted by another command, remove
		// this line or comment it out.
		if (m_autonomousCommand != null) 
		{
			m_autonomousCommand.cancel();
		}
	}

	/**
	 * This function is called periodically during operator control.
	 */
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
