package model;

public class Kingpin extends Pieces
{
    public Kingpin(int x, int y)
    {
        this.setPosition(x,y);
    }
    @Override
    public String toString()
    {
        return "This is Kingpin at " + getX() + " " + getY();
    }
}
