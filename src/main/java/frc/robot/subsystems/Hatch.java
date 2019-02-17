package frc.robot.subsystems;

import edu.wpi.first.wpilibj.PWMTalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Hatch extends Subsystem {

	public static PWMTalonSRX HatchMC = new PWMTalonSRX(5);

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub

	}

	public void HatchLocked() {
	}

	public void HatchLoose() {
	}

}
	
