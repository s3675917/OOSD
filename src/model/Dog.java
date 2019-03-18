package model;

public class Dog {
    public Dog(int x, int y)
    {
        this.setPosition(x,y);
    }
    @Override
    public String toString()
    {
        return "This is Dog at " + getX() + " " + getY();
    }
}
