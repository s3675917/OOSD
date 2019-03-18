package model;

public class Guard extends Pieces{
    public Guard(int x, int y)
    {
        this.setPosition(x,y);
    }
    @Override
    public String toString()
    {
        return "This is Guard at " + getX() + " " + getY();
    }
}
