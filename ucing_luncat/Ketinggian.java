import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Skor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ketinggian extends Actor
{
    GreenfootImage image = new GreenfootImage(100,10);
    /**
     * Act - do whatever the Skor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        image.clear();
        image.drawString(((duniaKucing) getWorld()).height + " Ketinggian.", 10,10);
        setImage(image);
    } 
    
    public Ketinggian()
    {
        setImage(image);
    }
}
