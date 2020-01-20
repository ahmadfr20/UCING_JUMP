import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class gameover here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class gameover extends World
{

    /**
     * Constructor for objects of class gameover.
     * 
     */
    public gameover()
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
        kembali2 kembali2 = new kembali2();
        addObject(kembali2,492,277);
        kembali2.setLocation(483,270);
        kembali2.setLocation(471,311);
    }
}
