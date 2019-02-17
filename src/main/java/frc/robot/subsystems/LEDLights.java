package frc.robot.subsystems;

import edu.wpi.first.wpilibj.PWMTalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;

public class LEDLights extends Subsystem {

	public static PWMTalonSRX LEDMC = new PWMTalonSRX(6);

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub

	}

	public static void FlashingGoldLED() {
	}

	public static void FlashingRedLED() {
	}

	public static void FlashingBlueLED() {
	}

	public static void FlashingWhiteLED() {
	}
}


