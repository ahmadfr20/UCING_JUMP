import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Roket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Aneh extends Rintangan
{
    /**
     * Act - do whatever the Roket wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
                move(3);
        if (getWorld().getObjects(Kucing.class).isEmpty()) return; 
        Actor tank = (Actor)getWorld().getObjects(Kucing.class).get(0); 
        turnTowards(tank.getX(), tank.getY());
    }
    /*private int velocity=2;
    public void followHuman()
    {
        int dist = 800;
        Actor closest = null;
        velocity = velocity * -1;  
        if(!getObjectsInRange(dist, Kucing.class).isEmpty())
        {
        for (Object obj: getObjectsInRange(dist, Kucing.class))
        {
            Actor guy = (Actor) obj;
            int guyDist = (int) Math.hypot(guy.getX() - getX(), guy.getY() - getY());
            if (closest == null || guyDist< dist)
            {
                    closest = guy;
                    dist = guyDist;
            }
        }
        turnTowards(closest.getX(),closest.getY());
        }   
    }
    */
}
