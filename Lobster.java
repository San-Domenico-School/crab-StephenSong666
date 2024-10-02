import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lobster here.
 * 
 * @author (Stephen) 
 * @version (10/1/2024)
 */
public class Lobster extends Actor
{
    /**
     * Act - do whatever the lobster wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int speed;
    private int turnSpeed;
    
    public Lobster()
    {
        speed = 5;
        turnSpeed = 3;
    }
    
    public void act()
    {
        moveAutomatically();
        turnAtEdge();
        randomTurn();
    }
    
    public void moveAutomatically()
    {
        move(speed);
    }
    
    public void turnAtEdge()
    {
        if (isAtEdge())
        {
            turn(180);
        }
    }
    
    public void randomTurn()
    {
        int randomAngel = Greenfoot.getRandomNumber(10) - turnSpeed;
        turn(randomAngel);
    }
}
