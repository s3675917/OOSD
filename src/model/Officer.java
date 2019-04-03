package model;

public class Officer extends LawEnforcement {
    public Officer(int x, int y)
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