import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ground here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ground extends Actor
{
    boolean hasBeenBounced;
    int x_pos, y_pos;
    /**
     * Act - do whatever the Ground wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(((duniaKucing) getWorld()).scroll==true)
        {
            scroll(((duniaKucing) getWorld()).scrollSpeed);
        }

        if(((duniaKucing) getWorld()).fall==true)
        {
            fall(((duniaKucing) getWorld()).scrollSpeed);
        }

        if(y_pos > 449)
        {
            getWorld().removeObject(this);
            return;
        }
        
        if(y_pos < 1)
        {
            getWorld().removeObject(this);
            return;
        }
    }
    
    public Ground()
    {
        this(100, 25);
        hasBeenBounced=false;
    }
    
        public Ground(boolean bounceable)
    {
        hasBeenBounced=true;
    }
    
    
    public Ground(int width, int height)
    {
        GreenfootImage image = getImage();
        image.scale(width, height);
        setImage(image);
    }
    
    protected void addedToWorld(World world)
    {
        x_pos = getX();
        y_pos = getY();
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
    
}
