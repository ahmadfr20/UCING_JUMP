import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Kembali here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Kembali extends Tombol
{
    /**
     * Act - do whatever the Kembali wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            ((Info)getWorld()).stopped();
            World Start = getWorld();
            Start = new Menu();
            Greenfoot.setWorld(Start);
        }
    }
    
    public Kembali()
    {
                GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/6;
        int myNewWidth = (int)myImage.getWidth()/6;
        myImage.scale(myNewWidth,myNewHeight);
    }
}
