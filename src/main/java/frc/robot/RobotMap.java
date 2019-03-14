package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;


public class RobotMap {

public static Joystick DriverStick = new Joystick(0);
public static Joystick NonDriverStick = new Joystick(1);

static Button CargoInFastButton = new JoystickButton(DriverStick, 1);
static Button CargoOutFastButton = new JoystickButton(DriverStick, 2);
static Button CargoInSlowButton = new JoystickButton(NonDriverStick, 1);
static Button CargoOutSlowButton = new JoystickButton(NonDriverStick, 2);

static Button HatchLockedButton = new JoystickButton(DriverStick, 3);
static Button HatchLooseButton = new JoystickButton(DriverStick, 4);

static Button FlashingGoldLEDButton = new JoystickButton(NonDriverStick, 3);
static Button FlashingBlueLEDButton = new JoystickButton(NonDriverStick, 4);
static Button FlashingRedLEDButton = new JoystickButton(NonDriverStick, 5);
static Button FlashingWhiteLEDButton = new JoystickButton(NonDriverStick, 6);

static Button ShiftingButton = new JoystickButton(DriverStick, 5);

static Button FrontLiftButton = new JoystickButton(DriverStick, 7);
static Button BackLiftButton = new JoystickButton(DriverStick, 9);
}
