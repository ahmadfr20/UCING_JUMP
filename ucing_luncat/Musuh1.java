import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class musuh1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Musuh1 extends Rintangan
{
    int x_pos, y_pos;
    
    /**
     * Act - do whatever the musuh wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move();
        
    }
    
    public Musuh1()
    {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/5;
        int myNewWidth = (int)myImage.getWidth()/5;
        myImage.scale(myNewWidth,myNewHeight);
    }
    
    public void scroll(int speed)
    {
        if(speed>0)
        {
            y_pos = y_pos + speed;
            setLocation(x_pos, y_pos);
        }
    }
    
        public void fall(int speed)
    {
        if(((duniaKucing) getWorld()).ended==false)
        {
            y_pos = y_pos + speed;
            setLocation(x_pos, y_pos);
        }
    }
    
    private int velocity = 2;
    public void move()
     {
    move(velocity);
     if ( isAtEdge() )
     {
        // flip velocity to change direction
        velocity = velocity * -1; 
     }
    }
      
}
