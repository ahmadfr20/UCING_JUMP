import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bola here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bola extends Actor
{
boolean removed;
    /**
     * Act - do whatever the bola wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public bola()
    {
        removed = false;
    }
    public void act() 
    {
        if(removed){return;}
        move();
    }   
    
    public void move()
    {
        if(getY()<=0)
        {
            removed = true;
            getWorld().removeObject(this);
            return;
        }
        setLocation(getX(), getY()-10);
          if(isTouching(Musuh1.class)){
        removeTouching(Musuh1.class);
        
      }
      if(isTouching(Aneh.class)){
        removeTouching(Aneh.class);
        
      }
            if(isTouching(Ganteng.class)){
        removeTouching(Ganteng.class);
        
      }
    }
}
