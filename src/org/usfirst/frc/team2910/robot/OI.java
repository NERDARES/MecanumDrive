package org.usfirst.frc.team2910.robot;

import edu.wpi.first.wpilibj.buttons.Button;
import org.usfirst.frc.team2910.robot.commands.ExampleCommand;

import misc.GenericController;;
/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	
	
	public GenericController controller;
	
	public OI() {
		controller = new GenericController(0);
		{
			controller.initButtons();
			
		}
		
	}
}

