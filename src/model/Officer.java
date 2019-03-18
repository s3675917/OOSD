package model;

public class Officer extends Pieces {
    public Officer(int x, int y)
    {
        this.setPosition(x,y);
    }
    @Override
    public String toString()
    {
        return "This is Officer at " + getX() + " " + getY();
    }
}
