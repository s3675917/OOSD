package model;
//Kingpin should have the power to kill a police officer and it can move one position vertically/horizontally
public class Kingpin extends Prisoner
{
    public Kingpin(int x, int y)
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
        return "This is Kingpin at " + getX() + " " + getY();
    }
}
