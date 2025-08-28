import java.util.Scanner;  //may be necessary for input

import javax.swing.JOptionPane;  //may be necessary for input

import kareltherobot.*;

public class Driver implements Directions {
// declared here so it is visible in all the methods!! 
// It will be assigned a value in the getInfo method
	private static Robot roomba; 


	// You will add very many variables!!

	
	public static void main(String[] args) {
		// LEAVE THIS ALONE!!!!!!
		Driver d = new Driver();

		Scanner world = new Scanner(System.in);
		Scanner stree = new Scanner(System.in);
		Scanner ave = new Scanner(System.in);
		Scanner trouve = new Scanner(System.in);
		Scanner bees = new Scanner(System.in);
		System.out.println("Please remember to load world file before running!");
		System.out.println("Enter world file name");
		String name = world.nextLine();
		System.out.println("Loading " + name);
		System.out.println("Enter Avenue");
		String tempx = ave.nextLine();
		System.out.println("Enter street");
		String tempy = stree.nextLine();
		System.out.println("Enter Direction");
		
		System.out.println("Enter number of Beepers");
		String tempBeeps = bees.nextLine();
int x = Integer.parseInt(tempx);
int y = Integer.parseInt(tempy);
int Beeps = Integer.parseInt(tempBeeps);

  /**
	 * This section of code gets info from the user in the following order: 1. Ask the user
	 * which world file they wish to process. Right now, that world file name is
	 * hardcoded in. 2. Ask the user for the starting location and direction of the
	 * Robot. A new Robot should be constructed and assigned to the global
	 * (instance) variable named roomba that is declared on line 10.
	 * 
	 * An inelegant way to interact with the user is via the console, using
	 * System.out.println and a Scanner that scans System.in (input from the
	 * console). A more elegant way to get user input might include using a
	 * JOptionPane.
	 */



		World.readWorld(name);
    World.setVisible(true);

    


	/** This section will have all the logic that takes the Robot to every location 
	 * and cleans up all piles of beepers.  Think about ways you can break this
	 * large, complex task into smaller, easier to solve problems.
	 */
	 
	Robot roomba = new Robot(x, y, dir, Beeps);
		// the line below causes a null pointer exception
		// what is that and why are we getting it?
		roomba.move();


  





  	/** This method displays the results of cleaning the room.  All of the info
	 * in the pdf that describes the problem need to be displayed.  You can present
	 * this info in the console (boring) or you can present using JOptionPane (cool!)
	 */

    System.out.println("The biggest pile was ");








  }

}
