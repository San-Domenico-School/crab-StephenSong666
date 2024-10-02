import greenfoot.*;

/**
 * This class defines a crab. Crabs live on the beach.
 * @author Stephen
 * @version 10/1/2024
 */
public class Crab extends Actor
{
    private int speed;
    private int wormsEaten = 0;
    private int totalWorms = 8;
    
    public Crab() 
    {
        speed = 5;
    }
    
    public void act() 
    {
        checkKeyPress();
        swapAtEdge();
        handleCollisions();
        lastWorm();
    }
    
    public void checkKeyPress() 
    {
        if (Greenfoot.isKeyDown("right")) 
        {
            setLocation(getX() + speed, getY());
        }
        if (Greenfoot.isKeyDown("left"))
        {
            setLocation(getX() - speed, getY());
        }
        if (Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(), getY() - speed);
        }
        if (Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(), getY() + speed);
        }
    }
    
    public void swapAtEdge()
    {
        if (getX() > getWorld().getWidth()) 
        {
            setLocation(0, getY()); 
        }  
        if (getX() < 0)
        {
            setLocation(getWorld().getWidth(), getY());
        } 
        if (getY() > getWorld().getHeight())
        {
            setLocation(getX(), 0);
        } 
        if (getY() < 0)
        {
            setLocation(getX(), getWorld().getHeight());
        }
    }
    
    public void handleCollisions()
    {
        if (isTouching(Lobster.class))
        {
            Greenfoot.stop();
            System.out.println("You Lose");
        }
        
        if (isTouching(Worm.class))
        {
           removeTouching(Worm.class);
           wormsEaten++;
           Greenfoot.playSound("chime.wav");
        }
    }
    
    public void lastWorm()
    {
        if (wormsEaten == totalWorms)
        {
            Greenfoot.playSound("fanfare.wav");
            Greenfoot.stop();
            System.out.println("You Won");
        }
    }
}    
    
    
    



