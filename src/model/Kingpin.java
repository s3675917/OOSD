package model;
//Kingpin should have the power to kill a police officer and it can move one position vertically/horizontally
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
