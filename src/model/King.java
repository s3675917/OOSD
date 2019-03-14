package model;

public class King extends Pieces
{
    public King(int x,int y)
    {
        this.setPosition(x,y);
    }
    @Override
    public String toString()
    {
        return "This is King at" + getX() + " " + getY();
    }
}
