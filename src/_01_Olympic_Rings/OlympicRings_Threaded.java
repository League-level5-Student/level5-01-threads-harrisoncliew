package _01_Olympic_Rings;
import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One robot should draw one ring simultaneously with the other 4 robots.
	public static void main(String[] args) {
		Robot ring0 = new Robot("mini");
		Robot ring1 = new Robot("mini");
		Robot ring2 = new Robot("mini");
		Robot ring3 = new Robot("mini");
		Robot ring4 = new Robot("mini");
		
		Robot[] rings = new Robot[5];
		
		rings[0] = ring0;
		rings[1] = ring1;
		rings[2] = ring2;
		rings[3] = ring3;
		rings[4] = ring4;
		
		for (int i = 0; i < rings.length; i++) {
			rings[i].penUp();
		}
		ring0.moveTo(300,400);
		ring1.moveTo(375,475);
		ring2.moveTo(450,400);
		ring3.moveTo(525,475);
		ring4.moveTo(600,400);
		
		
		ring0.setPenColor(Color.blue);
		ring1.setPenColor(Color.yellow);
		ring2.setPenColor(Color.black);
		ring3.setPenColor(Color.green);
		ring4.setPenColor(Color.red);
		
		
		
		for (int i = 0; i < rings.length; i++) {
			rings[i].penDown();
			rings[i].setSpeed(60);
			
		}
		
		Thread r0 = new Thread(()-> {for (int i = 0; i < 360; i++) {
			ring0.move(1);
			ring0.turn(1);
		}});
		Thread r1 = new Thread(()-> {for (int i = 0; i < 360; i++) {
			ring1.move(1);
			ring1.turn(1);
		}});	
		Thread r2 = new Thread(()-> {for (int i = 0; i < 360; i++) {
			ring2.move(1);
			ring2.turn(1);
		}});	
		Thread r3 = new Thread(()-> {for (int i = 0; i < 360; i++) {
			ring3.move(1);
			ring3.turn(1);
		}});
		Thread r4 = new Thread(()-> {for (int i = 0; i < 360; i++) {
			ring4.move(1);
			ring4.turn(1);
		}});	
		
		r0.start();
		r1.start();
		r2.start();
		r3.start();
		r4.start();
		
		
	}
	
	
	
	
	
	
	
	
}

