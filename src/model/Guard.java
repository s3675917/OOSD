package model;

public class Guard extends LawEnforcement{
    public Guard(int x, int y)
    {
        this.setPosition(x,y);
    }
    @Override
    public int getPieceValue()
    {
        return 5;
    }
    @Override
    public String toString()
    {
        return "This is Guard at " + getX() + " " + getY();
    }
}
