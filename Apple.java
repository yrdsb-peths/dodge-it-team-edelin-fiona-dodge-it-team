import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Apple extends Actor
{
    public void act()
    {
        move(-10);
    
        if(getX() <= 0)
        {
            resetApple();
        }
        if(isTouching(hero.class))
        {
            Banana banana = new Banana();
            getWorld().addObject(banana, 300, 200);
            getWorld().removeObject(this);
        }
    }
    public void resetApple()
    {
        int num = Greenfoot.getRandomNumber(2);
        if(num == 0)
        {
            setLocation(600, 100);
        }
        else
        {
            setLocation(600, 300);
        }
    }
}
