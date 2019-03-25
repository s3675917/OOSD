package model;

public class Dog extends LawEnforcement{
    public Dog(int x, int y)
    {
        this.setPosition(x,y);
    }

    @Override
    public int getPieceValue()
    {
        return 4;
    }

    @Override
    public String toString()
    {
        return "This is Dog at " + getX() + " " + getY();
    }
}
