package model;

public class Key extends Pieces
{
    public Key(int x, int y)
    {
        this.setPosition(x,y);
    }
    @Override
    public String toString()
    {
        return "This is Key at " + getX() + " " + getY();
    }
}
