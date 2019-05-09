import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class checkpoint {
	public static void main(String[] args) {
String FavColor= JOptionPane.showInputDialog("what is your fav color");		
	JOptionPane.showMessageDialog(null,"my fav color is   "+FavColor);	
	Robot babop= new Robot();
	babop.setSpeed(100);
	
	babop.penDown();
	for (int i = 0; i < 3; i++) {
		babop.move(100);
		babop.turn(120);
	}
	
		
		
		
		
		
		
}}
