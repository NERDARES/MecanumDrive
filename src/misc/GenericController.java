package misc;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

public final class GenericController extends Joystick {

	private Button aButton;
	private Button bButton;
	private Button xButton;
	private Button yButton;
	private Button leftBumper;
	private Button rightBumper;
	private Button backButton;
	private Button startButton;
	private Button leftJoystickButton;
	private Button rightJoystickButton;

	private Button leftTriggerButton;
	private Button rightTriggerButton;

	public DPadButton dPadUp;
	public DPadButton dPadLeft;
	public DPadButton dPadDown;
	public DPadButton dPadRight;

	public GenericController(int port) {
		super(port);
	}

	public void initButtons() {
		aButton = new JoystickButton(this, 1);
		bButton = new JoystickButton(this, 2);
		xButton = new JoystickButton(this, 3);
		yButton = new JoystickButton(this, 4);
		leftBumper = new JoystickButton(this, 5);
		rightBumper = new JoystickButton(this, 6);
		backButton = new JoystickButton(this, 7);
		startButton = new JoystickButton(this, 8);
		leftJoystickButton = new JoystickButton(this, 9);
		rightJoystickButton = new JoystickButton(this, 10);

		leftTriggerButton = new TriggerButton(this, true);
		rightTriggerButton = new TriggerButton(this, false);

		dPadUp = new DPadButton(this, DPadButton.DIRECTION.UP);
		dPadLeft = new DPadButton(this, DPadButton.DIRECTION.LEFT);
		dPadDown = new DPadButton(this, DPadButton.DIRECTION.DOWN);
		dPadRight = new DPadButton(this, DPadButton.DIRECTION.RIGHT);
	}

	/**
	 * Gets the value of the X axis of the left joystick
	 *
	 * @return The left X axis, from -1.0 to 1.0
	 */
	public double getLeftX() {
		return getRawAxis(0);
	}

	/**
	 * Gets the value of the Y axis of the left joystick
	 *
	 * @return The left Y axis, from -1.0 to 1.0
	 */
	public double getLeftY() {
		return getRawAxis(1);
	}

	/**
	 * Gets the value of the X axis of the right joystick
	 *
	 * @return The right X axis, from -1.0 to 1.0
	 */
	public double getRightX() {
		return getRawAxis(4);
	}

	/**
	 * Gets the value of the Y axis of the right joystick
	 *
	 * @return The right Y axis, from -1.0 to 1.0
	 */
	public double getRightY() {
		return getRawAxis(5);
	}

	/**
	 * Gets the value of the left trigger
	 *
	 * @return The left trigger, from 0.0 to 1.0
	 */

	public double getLeftTriggerAxis() {
		return getRawAxis(2);
	}

	/**
	 * Gets the value of the right trigger
	 *
	 * @return The right trigger, from 0.0 to 1.0
	 */
	public double getRightTriggerAxis() {
		return getRawAxis(3);
	}

	public Button getAButton() {
		return aButton;
	}

	public Button getBButton() {
		return bButton;
	}

	public Button getXButton() {
		return xButton;
	}

	public Button getYButton() {
		return yButton;
	}

	public Button getLeftBumper() {
		return leftBumper;
	}

	public Button getRightBumper() {
		return rightBumper;
	}

	public Button getBackButton() {
		return backButton;
	}

	public Button getStartButton() {
		return startButton;
	}

	public Button getLeftJoystickButton() {
		return leftJoystickButton;
	}

	public Button getRightJoystickButton() {
		return rightJoystickButton;
	}

	public Button getLeftTriggerButton() {
		return leftTriggerButton;
	}

	public Button getRightTriggerButton() {
		return rightTriggerButton;
	}
}
