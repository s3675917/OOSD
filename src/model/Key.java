package model;
//The key should keep moving horizontally,i.e. left and right in the middle of the board automatically, police
//or a prisoner can get the key
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
