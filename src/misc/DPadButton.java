package misc;

import edu.wpi.first.wpilibj.buttons.Button;

/**
 * @author SunnyBat
 */
public class DPadButton extends Button {

	public static enum DIRECTION {

		UP, DOWN, LEFT, RIGHT, UPRIGHT, DOWNRIGHT, DOWNLEFT, LEFTUP, CENTER;
	}

	private GenericController controller;
	private DIRECTION direction;

	public DPadButton(GenericController controller, DIRECTION dir) {
		this.controller = controller;
		this.direction = dir;
	}

	@Override
	public boolean get() {
		int axisValue = controller.getPOV();
		return getDir(axisValue) == direction;
	}

	private DIRECTION getDir(int axisValue) {
		switch (axisValue) {
			case 0:
				return DIRECTION.UP;
			case 45:
				return DIRECTION.UPRIGHT;
			case 90:
				return DIRECTION.RIGHT;
			case 135:
				return DIRECTION.DOWNRIGHT;
			case 180:
				return DIRECTION.DOWN;
			case 225:
				return DIRECTION.DOWNLEFT;
			case 270:
				return DIRECTION.LEFT;
			case 315:
				return DIRECTION.LEFTUP;
			default:
				return DIRECTION.CENTER;
		}
	}

}