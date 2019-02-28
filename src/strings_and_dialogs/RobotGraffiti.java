package strings_and_dialogs;

import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
public static void main(String[] args) {
	
	// This recipe draws a square using the Robot

	
	//  Make a new Robot
Robot lilbapoo= new Robot();
	
    //  Put the robot's pen down
lilbapoo.penDown();
lilbapoo.setAngle(180);	
    //  Make the robot move as fast as possible
//lilbapoo.move(200);
    // try to make the letter L 

	lilbapoo.move(70);
	lilbapoo.turn(-90);
   lilbapoo.move(90);
	
   
}
}
