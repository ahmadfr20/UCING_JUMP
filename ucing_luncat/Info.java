import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Info here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Info extends World
{

    /**
     * Constructor for objects of class Info.
     * 
     */
    public Info()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 450, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Kembali kembali = new Kembali();
        addObject(kembali,869,363);
        kembali.setLocation(828,382);
    }
}
