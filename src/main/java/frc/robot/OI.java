package frc.robot;

import frc.robot.commands.*;

public class OI 
{

public OI() 
{
    RobotMap.CargoInFastButton.whileHeld(new CargoInFast());
    RobotMap.CargoInSlowButton.whileHeld(new CargoInSlow());
    RobotMap.CargoOutFastButton.whileHeld(new CargoOutFast());
    RobotMap.CargoOutSlowButton.whileHeld(new CargoOutSlow());

    RobotMap.HatchLooseButton.whileHeld(new HatchLoose());
    RobotMap.HatchLockedButton.whileHeld(new HatchLocked());

    RobotMap.FlashingBlueLEDButton.whileHeld(new FlashingBlueLED());
    RobotMap.FlashingGoldLEDButton.whileHeld(new FlashingGoldLED());
    RobotMap.FlashingRedLEDButton.whileHeld(new FlashingRedLED());
    RobotMap.FlashingWhiteLEDButton.whileHeld(new FlashingWhiteLED());

    RobotMap.ShiftingButton.toggleWhenPressed(new ShiftingButton());
}

}