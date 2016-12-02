package misc;

import edu.wpi.first.wpilibj.buttons.Button;

public class TriggerButton extends Button {
	public static final double TRIGGER_GIVE = 0.75;

	private final GenericController controller;
	private final boolean isLeft;

	TriggerButton(GenericController controller, boolean left) {
		this.controller = controller;
		isLeft = left;
	}

	@Override
	public boolean get() {
		if (isLeft) {
			return controller.getLeftTriggerAxis() >= TRIGGER_GIVE;
		} else {
			return controller.getRightTriggerAxis() >= TRIGGER_GIVE;
		}
	}
}