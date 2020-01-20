import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Kucing here.
 * 
 * @author (Ahmad Fathoni) 
 * @version (-)
 */
public class Kucing extends Actor
{
    float ys, xs;
    int x, y;
    boolean Move;
    GreenfootImage left = new GreenfootImage("Idle (10).png");
    GreenfootImage right = new GreenfootImage("Idle (10).png");
    GreenfootImage shooting = new GreenfootImage("Fall (1).png");
    Ground Ground = new Ground();
    int scrollSpeed;
    int hits = 0;
    int x_pos, y_pos;
    
        public Kucing(boolean moveable)
    {
        Move = moveable;
    }
    
    /**
     * Act - do whatever the Kucing wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        x = getX();
        y = getY();
        
        ((duniaKucing) getWorld()).KucingX = getX();
        
        if(((duniaKucing) getWorld()).fall==false)
        {
            bounce();
        }
        if(Move)
            move();

        if(ys>11)
            ys = 10;

        setLocation(x+(int)xs, y+(int)ys);

        gravity();
        wrapAround();
        move();
        tembak();
        scrollUp();
        checkOnBottom();
        kena();
        kena2();
        kena3();
        ((duniaKucing) getWorld()).height = hits;
        
        
        if(Move & y < 400)
            scrollUp();

        /*if(y>400)
            fall();*/

    }
    
    public Kucing()
    {
        GreenfootImage image = getImage();  
        image.scale(100, 80);
        setImage(image);
        Move=true;
    }
    
    public void gravity()
    {
        ys +=0.3f;
    }
    
    public void bounce()
    {
        Ground Ground = (Ground) getOneIntersectingObject(Ground.class);
        if(Ground != null & ys > 0)
        {
            ys = -10;
            if(Move & !Ground.hasBeenBounced)
            {
                Ground.hasBeenBounced=true;
                {
                  getWorld().addObject(new Ground(), Greenfoot.getRandomNumber(899), 0);
                  getWorld().addObject(new Ground(), Greenfoot.getRandomNumber(899), 70);
                }
            }
        }
    }
    
    public void wrapAround()
    {
        if(x>880)
        {
            setLocation(0, getY());
        }
        if(x<0)
        {
            setLocation(799,getY());
        }
    }
    
    public void scrollUp()
    {
        if(y<=790 & y>449)
        {
            ((duniaKucing) getWorld()).scrollSpeed = (int) -ys;
            ((duniaKucing) getWorld()).scroll = true;
            hits++;
        }
        else if(y<=100)
        {
            ((duniaKucing) getWorld()).scrollSpeed = (int) -ys*2;
            ((duniaKucing) getWorld()).scroll = true;
            hits++;
        }

        else
        {
            ((duniaKucing) getWorld()).scroll = true;
        }
    }
    
    /*public void fall()
    {
        ((duniaKucing) getWorld()).fall =true;
        ((duniaKucing) getWorld()).scrollSpeed = (int) -ys;
    }
    */
   public void move()
   {
      int y = getY();
      int x = getX();
      if(Greenfoot.isKeyDown("left")) x-=7;
      setImage(left);
      GreenfootImage image = getImage();  
      image.scale(100, 80);
      if(Greenfoot.isKeyDown("right")) x+=7;
      setLocation(x, y);
    
   }
   
   public void tembak()
   {
        if(Greenfoot.isKeyDown("space") & getWorld().getObjects(bola.class).isEmpty())
        {
         setImage(shooting);GreenfootImage image = getImage();  
        image.scale(100, 80);
        setImage(image);
        getWorld().addObject(new bola(), x, y);
        }
   }
   
   private void checkOnBottom()
    {
       int bottom = getWorld().getHeight() - 3;
       if( getY() >= bottom )
       {
            ((duniaKucing)getWorld()).stopped();
            World Start = getWorld();
            Start = new gameover();
            Greenfoot.setWorld(Start);
       }
    }
    
   private void kena(){
        if(isTouching(Musuh1.class)){
            ((duniaKucing)getWorld()).stopped();
            World Start = getWorld();
            Start = new gameover();
            Greenfoot.setWorld(Start);
     }
    }
    
    private void kena2(){
        if(isTouching(Aneh.class)){
            ((duniaKucing)getWorld()).stopped();
            World Start = getWorld();
            Start = new gameover();
            Greenfoot.setWorld(Start);
     }
    }
    
        private void kena3(){
        if(isTouching(Ganteng.class)){
            ((duniaKucing)getWorld()).stopped();
            World Start = getWorld();
            Start = new gameover();
            Greenfoot.setWorld(Start);
     }
    }
}
