package model;

public class Warden extends LawEnforcement{
    public Warden(int x, int y)
    {
        this.setPosition(x,y);
    }
    @Override
    public int getPieceValue()
    {
        return 3;
    }
    @Override
    public String toString()
    {
        return "This is Officer at " + getX() + " " + getY();
    }
}
