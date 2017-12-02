import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	static Robot robot1 = new Robot(); 
	static int height = 0;
    static String height2 = "";
    static boolean flatRoof;
public static void main(String[] args) {
	
	/*for(int i = 0; i < 10; i++)
	{
		drawHouse(100);
	}
	*/
	
	robot1.moveTo(20, 590);
	drawHouse("small", Color.pink);
	drawHouse("medium", Color.blue);
	drawHouse("small", Color.orange);
	drawHouse("large", Color.CYAN);
	drawHouse("medium", Color.yellow);
	drawHouse("large", Color.MAGENTA);
	drawHouse("small", Color.black);
	drawHouse("medium", Color.red);
	drawHouse("small", Color.lightGray);
	
}

public static void drawHouse(String height2, Color color1)
{
	if(height2 == "small")
{
	height = 60;
	flatRoof = false;
}
if(height2 == "medium")
{
	height = 120;
	flatRoof = false;
}
if(height2 == "large")
{
	height = 250;
	flatRoof = true;
}
    
	robot1.setSpeed(100);
	robot1.setPenColor(color1);
	robot1.penDown();
	robot1.move(height);
	if(flatRoof == true)
	{
		drawFlatRoof();
	}
	else if(flatRoof == false)
	{
		drawPointyRoof();
	}
		
	robot1.move(height);
	robot1.setPenColor(Color.GREEN);
	robot1.turn(-90);
	robot1.move(20);
	robot1.turn(-90);

	}
	
public static void drawPointyRoof()
{
	robot1.turn(45);
	robot1.move(20);
	robot1.turn(90);
	robot1.move(20);
	robot1.turn(45);
	
}

public static void drawFlatRoof()
{
	robot1.turn(90);
	robot1.move(23);
	robot1.turn(90);
	
}
}









