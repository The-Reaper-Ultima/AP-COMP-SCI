import java.util.Scanner;  //may be necessary for input

import javax.swing.JOptionPane;  //may be necessary for input

import kareltherobot.*;

public class Driver implements Directions {
// declared here so it is visible in all the methods!! 
// It will be assigned a value in the getInfo method
	private static Robot roomba; 


	// You will add very many variables!!
// basicRoom.wld
	
	public static void main(String[] args) {
		// LEAVE THIS ALONE!!!!!!
		Driver d = new Driver();

		Scanner world = new Scanner(System.in);
		Scanner stree = new Scanner(System.in);
		Scanner ave = new Scanner(System.in);
		Scanner bees = new Scanner(System.in);
		System.out.println("Please remember to load world file before running!");
		System.out.println("Enter world file name");
		String name = world.nextLine();
		System.out.println("Loading " + name);
		System.out.println("Enter Avenue");
		String tempx = ave.nextLine();
		System.out.println("Enter street");
		String tempy = stree.nextLine();
		System.out.println("Enter number of Beepers");
		String tempBeeps = bees.nextLine();
int x = Integer.parseInt(tempx);
int y = Integer.parseInt(tempy);	
int Beeps = Integer.parseInt(tempBeeps);
world.close();
stree.close();
ave.close();
bees.close();

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
	World.setDelay(1); // you can change the speed
    


	/** This section will have all the logic that takes the Robot to every location 
	 * and cleans up all piles of beepers.  Think about ways you can break this
	 * large, complex task into smaller, easier to solve problems.
	 */
	 
	 roomba = new Robot(x, y, North, Beeps);
		// the line below causes a null pointer exception
		// what is that and why are we getting it?
		int height = 1;
		int width = 1;
		int count = 0;
		int greatest = 0;
		int track = 0;
		int pile = 0;
		while (true)
		{
			if (roomba.frontIsClear())
			{
				roomba.move();
				height ++;
				if(!roomba.frontIsClear())
				{
					break;
				}
			}
		
		}
		while (true) {
			while (!roomba.facingEast())
			{
				roomba.turnLeft();
			}
			
			if (roomba.frontIsClear())
			{
				roomba.move();
				width ++;
				if (!roomba.frontIsClear())
				{
					break;
				}
			
			}
			
			
		}
			roomba.turnLeft();
			roomba.turnLeft();
			roomba.turnLeft();
		while (true) {
			if (roomba.nextToABeeper()) 
			{
				roomba.pickBeeper();
				count++;
				track++;
				if (track > greatest)
				{
					greatest = track;
				}
				pile++;
			}
			
			else if (roomba.frontIsClear()) 
			{
				track = 0;
				roomba.move();
				
				
				
			}
				else  if (!roomba.frontIsClear() && roomba.facingNorth())
			{
				roomba.turnLeft();
				roomba.move();
				roomba.turnLeft();
				
				

			}
			else if (!roomba.frontIsClear() && roomba.facingSouth())
			{
				roomba.turnLeft();
				roomba.turnLeft();
				roomba.turnLeft();
				roomba.move();
				roomba.turnLeft();
				roomba.turnLeft();
				roomba.turnLeft();
			}
			else 
			{
				roomba.turnOff();
				System  . out  . println  ("Room Cleaned");
				break;
			}
		}
	System.out.println("Height : " + height);
	System.out.println("Width : " + width);
	int area = height * width;
	System.out.println("Area : " + area);
	System.out.println("Total Beepers Collected : " + count);
	System.out.println("Greatest number of beepers in a pile : " + greatest);
	System.out.println("Number of piles : " + pile);
	System.out.println("Average number of beepers per pile : " + (count/(float)pile) );

	}


	/** This method displays the results of cleaning the room.  All of the info
	 * in the pdf that describes the problem need to be displayed.  You can present
	 * this info in the console (boring) or you can present using JOptionPane (cool!)
	 */
		



  }


