import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ganteng here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ganteng extends Rintangan
{
    /**
     * Act - do whatever the Ganteng wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
                move(1);
        if (getWorld().getObjects(Kucing.class).isEmpty()) return; 
        Actor tank = (Actor)getWorld().getObjects(Kucing.class).get(0);
        turnTowards(tank.getX(), tank.getY());
    }    
}
