import greenfoot.*;  // (Actor, World, Greenfoot, GreenfootImage)

public class CrabWorld extends World
{
    /**
     * Create the crab world (the beach). Our world has a size 
     * of 560x560 cells, where every cell is just 1 pixel.
     * Author:Stephen
     * Version(10/1/2024)
     */
    
    public CrabWorld() 
    {
        super(560, 560, 1, false);
        prepareScene();

        
        
    }
    
    private void prepareScene()
    {
       Crab crab = new Crab();
       addObject(crab, 50, 50);
       
       Lobster lobster = new Lobster();
       addObject(lobster,200, 200);
       
       for (int i = 0; i < 8; i++) 
       {
            Worm worm = new Worm();
            int x = Greenfoot.getRandomNumber(getWidth());
            int y = Greenfoot.getRandomNumber(getHeight());
            addObject(worm, x, y);
        }
       
    
    }
    
   
}
