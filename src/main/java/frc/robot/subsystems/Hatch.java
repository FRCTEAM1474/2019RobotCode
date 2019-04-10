package frc.robot.subsystems;

import edu.wpi.first.wpilibj.PWMTalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Hatch extends Subsystem {

	public static PWMTalonSRX HatchMC = new PWMTalonSRX(5);

	

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub

	}

	@Override
	public void periodic() {
	}
	public void HatchLocked() {
	}

	public void HatchLoose() {
	}

}
	
