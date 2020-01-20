import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class duniaKucing extends World
{
    boolean bStarted,started = false;
    boolean once;
    int transparency = 0;
    int scrollSpeed;
    int count;
    boolean scroll;
    boolean fall;
    boolean ended;

    int height = 0;
    int KucingX;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public duniaKucing()
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
        Kucing kucing = new Kucing();
        addObject(kucing,75,246);
        kucing.setLocation(84,266);

        Ground ground = new Ground();
        addObject(ground,114,352);
        ground.setLocation(68,332);
        kucing.setLocation(134,248);
        kucing.setLocation(48,289);
        kucing.setLocation(61,271);
        Ground ground2 = new Ground();
        addObject(ground2,483,201);
        ground2.setLocation(322,259);
        Ground ground3 = new Ground();
        addObject(ground3,606,95);
        ground3.setLocation(523,139);
        Ketinggian ketinggian = new Ketinggian();
        addObject(ketinggian,669,21);
        ketinggian.setLocation(711,24);
        removeObject(ketinggian);
        addObject(ketinggian,677,419);

        Musuh1 musuh1 = new Musuh1();
        addObject(musuh1,104,57);
        musuh1.setLocation(55,54);
        musuh1.setLocation(46,35);
        Aneh aneh = new Aneh();
        addObject(aneh,746,137);
        removeObject(aneh);
    }
    
    public void act()
    {
      if (Greenfoot.getRandomNumber(10000) < 15 ) 
            {
                int x = Greenfoot.getRandomNumber(450);
                int y = Greenfoot.getRandomNumber(150);
                addObject(new Aneh(), x, y);
            }
              
      if (Greenfoot.getRandomNumber(10000) < 15 ) 
            {
                int x = Greenfoot.getRandomNumber(450);
                int y = Greenfoot.getRandomNumber(150);
                addObject(new Musuh1(), x, y);
         }
      
      if (Greenfoot.getRandomNumber(10000) < 20 ) 
         {
                int x = Greenfoot.getRandomNumber(450);
                int y = Greenfoot.getRandomNumber(150);
                addObject(new Ganteng(), x, y);
         }  
    }
    
}
