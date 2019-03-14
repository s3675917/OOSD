package model;

public abstract class Pieces
{
    private int x,y;
    //x,y are the current positions of the piece
    public void setPosition(int x,int y)
    {
        this.x = x;
        this.y = y;
    }
    public int getX()
    {
        return x;
    }
    public int getY()
    {
        return y;
    }
}
