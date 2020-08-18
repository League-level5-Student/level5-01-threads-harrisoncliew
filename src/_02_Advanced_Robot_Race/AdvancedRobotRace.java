package _02_Advanced_Robot_Race;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class AdvancedRobotRace {
	// Re-do the robot race recipe from level 3 module 0. 
	// This time, use threads to make all of the robots go at the same time.
	static boolean keepGoing = true;
	static int winner=0;
	static Random r = new Random();
	public static void main(String[] args) {
		Robot[] robots;
		robots = new Robot[10];
		
		for (int i = 0; i < robots.length; i++) {
			robots[i] = new Robot("mini");
		}

		int xval = 200;
		for (int i = 0; i < robots.length; i++) {
			robots[i].setSpeed(150);
			robots[i].moveTo(xval, 550);
			xval += 100;
		}

		
		
		
		
//		while (keepGoing) {
//			for (int i = 0; i < robots.length; i++) {
//				robots[i].setSpeed(1000);
//				robots[i].move(r.nextInt(51));
//				if (robots[i].getY() <= 0) {
//					keepGoing=false;
//					winner = i+1;
//				}
//			}
//		}
		
		Thread r0 = new Thread(()-> {while(keepGoing) {
			robots[0].move(r.nextInt(51));
			if(robots[0].getY()<=0) {
				keepGoing = false;
				winner = 1;
			}
			
		} });
		
		Thread r1 = new Thread(()-> {while(keepGoing) {
			robots[1].move(r.nextInt(51));
			if(robots[1].getY()<=0) {
				keepGoing = false;
				winner = 2;
			}
			
		} });
		
		Thread r2 = new Thread(()-> {while(keepGoing) {
			robots[2].move(r.nextInt(51));
			if(robots[2].getY()<=0) {
				keepGoing = false;
				winner = 3;
			}
			
		} });
		
		Thread r3 = new Thread(()-> {while(keepGoing) {
			robots[3].move(r.nextInt(51));
			if(robots[3].getY()<=0) {
				keepGoing = false;
				winner = 4;
			}
			
		} });
		
		Thread r4 = new Thread(()-> {while(keepGoing) {
			robots[4].move(r.nextInt(51));
			if(robots[4].getY()<=0) {
				keepGoing = false;
				winner = 5;
			}
			
		} });
		
		Thread r5 = new Thread(()-> {while(keepGoing) {
			robots[5].move(r.nextInt(51));
			if(robots[5].getY()<=0) {
				keepGoing = false;
				winner = 6;
			}
			
		} });
		
		Thread r6 = new Thread(()-> {while(keepGoing) {
			robots[6].move(r.nextInt(51));
			if(robots[6].getY()<=0) {
				keepGoing = false;
				winner = 7;
			}
			
		} });
		
		Thread r7 = new Thread(()-> {while(keepGoing) {
			robots[7].move(r.nextInt(51));
			if(robots[7].getY()<=0) {
				keepGoing = false;
				winner = 8;
			}
			
		} });
		
		Thread r8 = new Thread(()-> {while(keepGoing) {
			robots[8].move(r.nextInt(51));
			if(robots[8].getY()<=0) {
				keepGoing = false;
				winner = 9;
			}
			
		} });
		
		Thread r9 = new Thread(()-> {while(keepGoing) {
			robots[9].move(r.nextInt(51));
			if(robots[9].getY()<=0) {
				keepGoing = false;
				winner = 10;
			}
			
		} });
		
		r0.start();
		r1.start();
		r2.start();
		r3.start();
		r4.start();
		r5.start();
		r6.start();
		r7.start();
		r8.start();
		r9.start();
		
		int numwinner = winner;

		JOptionPane.showMessageDialog(null, "The winner is robot "+numwinner+". A party has been thrown for the robot." );

	}
}
