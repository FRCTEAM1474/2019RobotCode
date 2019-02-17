package frc.robot.subsystems;

import edu.wpi.first.wpilibj.PWMTalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;

public class CargoConveyer extends Subsystem{
	
	public static PWMTalonSRX CargoMC = new PWMTalonSRX(4);
	
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}	
	
public void CargoInFast() {
}

public void CargoOutFast() {
}

public static void CargoInSlow() {
}

public static void CargoOutSlow() {
}


}