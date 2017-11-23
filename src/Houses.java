import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	static Robot robot1 = new Robot(); 
	int height = 0;
	
public static void main(String[] args) {
	
	/*for(int i = 0; i < 10; i++)
	{
		drawHouse(100);
	}
	*/
	drawHouse(50);
	drawHouse(67);
	drawHouse(20);
	drawHouse(100);
	drawHouse(80);
	drawHouse(60);
	drawHouse(108);
	drawHouse(92);
	drawHouse(40);
	
}

public static void drawHouse(int height)
{
	robot1.setSpeed(100);
	robot1.setPenColor(Color.black);
	robot1.penDown();
	robot1.move(height);
	robot1.turn(90);
	robot1.move(23);
	robot1.turn(90);
	robot1.move(height);
	robot1.setPenColor(Color.GREEN);
	robot1.turn(-90);
	robot1.move(20);
	robot1.turn(-90);
	
	
}

}



