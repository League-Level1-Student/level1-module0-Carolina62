package _01_houses;

import org.jointheleague.graphical.robot.Robot;

public class houses {
public static void main(String[] args) {
	Robot rob = new Robot();
	rob.penDown();
	rob.miniaturize();
	rob.setSpeed(25);
	rob.moveTo(10, 550);
	rob.move(100);
	rob.turn(90);
	rob.move(30);
	rob.turn(90);
	rob.move(100); 
	rob.turn(-90);
	rob.setPenColor(0, 150, 0);
	rob.move(35);

	
}
}

 