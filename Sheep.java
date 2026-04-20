import greenfoot.*;  
public class Sheep extends Actor
{
    boolean atTop = true;
    public void act()
    {
        if(Greenfoot.mouseClicked(null)){
            setLocation(100, 100);
            atTop = !atTop;
        }
        if(atTop){
            setLocation(100,100);
        }
        else{
            setLocation(100, 300);
        }
    }
}
