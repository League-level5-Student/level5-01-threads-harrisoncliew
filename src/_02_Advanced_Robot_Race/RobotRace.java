package _02_Advanced_Robot_Race;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class RobotRace {
	// 1. make a main method
	public static void main(String[] args) {

		// 2. create an array of 5 robots.
		Robot[] robots;
		robots = new Robot[10];

		// 3. use a for loop to initialize the robots.
		for (int i = 0; i < robots.length; i++) {
			robots[i] = new Robot();
		}

		// 4. make each robot start at the bottom of the screen, side by side, facing up
		int xval = 200;
		for (int i = 0; i < robots.length; i++) {
			robots[i].moveTo(xval, 550);
			xval += 100;
		}

		// 5. use another for loop to iterate through the array and make each robot move
		// a random amount less than 50.
		boolean keepGoing = true;
		int winner=0;
		Random r = new Random();
		while (keepGoing) {
			for (int i = 0; i < robots.length; i++) {
				robots[i].setSpeed(1000);
				robots[i].move(r.nextInt(51));
				if (robots[i].getY() <= 0) {
					keepGoing=false;
					winner = i+1;
				}
			}
		}

		// 6. use a while loop to repeat step 5 until a robot has reached the top of the
		// screen.

		// 7. declare that robot the winner and throw it a party!
		JOptionPane.showMessageDialog(null, "The winner is robot "+winner+". A party has been thrown for the robot." );

		// 8. try different races with different amounts of robots.
		

		// 9. make the robots race around a circular track.

	}
}
