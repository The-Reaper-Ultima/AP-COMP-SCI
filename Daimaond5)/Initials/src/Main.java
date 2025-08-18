import kareltherobot.*;

public class Main implements Directions{
   
    public static void main(String[] args) {
        World.setDelay(1);
        World.setSize(11,11);
    World.setVisible(true);// allows us to see the run
   Robot r = new Robot(1,6,East,121);
    // The line below creates a Robot that we will refer to as r.  
    // Find out what the numbers and direction do!
    
		
    // examples of commands you can invoke on a Robot
 for(int i=0;i<5;i++)
 {
    r.putBeeper();
    r.move();
    r.turnLeft();
    r.move();
    r.putBeeper();
    r.turnLeft();
    r.turnLeft();
    r.turnLeft();
 }
 r.turnLeft();
 for(int i =0;i<5;i++)
 {
    r.putBeeper();
    r.move();
    r.turnLeft();
    r.move();
    r.putBeeper();
    r.turnLeft();
    r.turnLeft();
    r.turnLeft();
 }
 r.turnLeft();
 r.turnLeft();
 for(int i = 0; i<5;i++)
 {
   r.putBeeper();
   r.move();
   r.turnLeft();
   r.turnLeft();
   r.turnLeft();
   r.move();
   r.putBeeper();
   r.turnLeft();

 }
for(int i=0;i<5;i++)
{
    r.putBeeper();
    r.move();
    r.turnLeft();
    r.move();
   r.putBeeper();
   r.move();
   r.turnLeft();
   r.turnLeft();
   r.turnLeft();
   r.move();

}
}
}
