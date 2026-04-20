import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        
        Sheep sheep = new Sheep();
        addObject(sheep, 100, 100);
        
        Apple Apple = new Apple();
        addObject(Apple, 600, 100);
    }
}
