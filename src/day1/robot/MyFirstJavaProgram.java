package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
Robot Jeff = new Robot();
Jeff.hide();
Jeff.setPenWidth(5);
Jeff.penDown();
for (int i = 0; i < 4; i++) {
Jeff.move(100);	
Jeff.turn(90);
}	
	}


	}

