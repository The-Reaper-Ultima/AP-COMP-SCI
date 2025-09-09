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
	JOptionPane.showMessageDialog(null,"Please remember to load world file before running!");
	String world = JOptionPane.showInputDialog("Enter world file name");
	String tempx = JOptionPane.showInputDialog("Enter Avenue");
	String tempy = JOptionPane.showInputDialog("Enter street");
	String tempBeeps = JOptionPane.showInputDialog("Enter number of Beepers");	
	
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



		World.readWorld(world);
    World.setVisible(true);
	World.setDelay(0); // you can change the speed
    


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
		int xpos = 0;
		int ypos = 0;
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
					 xpos = roomba.avenue();
					 ypos = roomba.street();

				}
				if (roomba.nextToABeeper() == false)
				{
					pile++;
				}
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
		String newline = "\n";
		JOptionPane.showMessageDialog(null,"Room Cleaned" + newline + 
		"Height : " + height + newline + 
		"Width : " + width + newline + 
		"Area : " + (height * width) + " square units" + newline + 
		"Total Beepers Collected : " + count + newline + 
		"Greatest number of beepers in a pile : " + greatest + newline + 
		"Number of piles : " + pile + newline + 
		"Average number of beepers per pile : " + (count/(float)pile) + newline + 
		"Percentage dirty : " + ((pile/(float)(height * width))*100) + "%" + newline + 
		"Location of largest pile : (" + xpos + ", " + ypos + ")" );
	
	}


	/** This method displays the results of cleaning the room.  All of the info
	 * in the pdf that describes the problem need to be displayed.  You can present
	 * this info in the console (boring) or you can present using JOptionPane (cool!)
	 */
		



  }


