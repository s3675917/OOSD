package model;

public class LockSmith extends Prisoner{
    public LockSmith(int x, int y)
    {
        this.setPosition(x,y);
    }
    @Override
    public int getPieceValue()
    {
        return 1;
    }
    @Override
    public String toString()
    {
        return "This is Locksmith at " + getX() + " " + getY();
    }
}
