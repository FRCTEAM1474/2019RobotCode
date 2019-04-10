/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import frc.robot.commands.*;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI 
{

public OI() 
{
	//RobotMap.WinchDownButton.whileHeld(new WinchDownAngle());

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

    RobotMap.frontLifterButton.toggleWhenPressed(new frontLifterButton());
    RobotMap.backLifterButton.toggleWhenPressed(new backLifterButton());
    



}

}