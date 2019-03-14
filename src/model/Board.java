package model;

import java.util.ArrayList;
import java.util.List;

public class Board
{
    private int height;
    private int breadth;

    private List<Pieces> pieces = new ArrayList<Pieces>();
    public Board(int height, int breadth)
    {
        this.height = height;
        this.breadth = breadth;
    }
    public void createPieces()
    {
        Pieces king = new King(8,8);
        pieces.add(king);
    }
    public void printBoard()
    {
        for(int i = 0; i<pieces.size();i++)
            System.out.println(pieces.get(i).toString());
    }
}
