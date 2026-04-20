import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        
        Sheep sheep = new Sheep();
        addObject(sheep, 100, 100);
        
        Apple apple = new Apple();
        addObject(apple, 600, 100);
    }
}
