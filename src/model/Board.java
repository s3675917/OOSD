package model;

import java.util.ArrayList;
import java.util.List;

public class Board
{
    private int height;
    private int breadth;

    private int board[][];
    private List<Pieces> pieces = new ArrayList<Pieces>();
    public Board(int height, int breadth)
    {
        this.height = height;
        this.breadth = breadth;
        initBoard();
   }
   private void initBoard()
   {
       for(int i = 0; i < height; i++)
       {
           for(int j = 0; j< breadth; j++)
           {
               board[i][j] = 0;
           }
       }
       initPieces();
   }
    private void initPieces()
    {
        Pieces kingpin = new Kingpin(8,8);
        Pieces key = new Key(3,3);
        pieces.add(kingpin);
        pieces.add(key);
    }
    public void printBoard()
    {
        for(int i = 0; i<pieces.size();i++)
            System.out.println(pieces.get(i).toString());
    }
}
