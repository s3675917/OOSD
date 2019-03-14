package model;
//Board should know all the pieces and the
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

   //Initializes the board[][] array, creates walls if necessary, walls are -1, empty is 0
   private void initBoard()
   {
       for(int i = 0; i < height; i++)
       {
           for(int j = 0; j< breadth; j++)
           {
               board[i][j] = 0;
           }
       }
   }

   //Initializes all the pieces according to how player selects it from gui. User can rearrange the position of
   // their 4 pieces however they want.
    public void initPieces()
    {
        Pieces kingpin = new Kingpin(8,8);
        Pieces key = new Key(3,3);
        pieces.add(kingpin);
        pieces.add(key);
    }

    //Prints out all the pieces and their positions
    public void printBoard()
    {
        for(int i = 0; i<pieces.size();i++)
            System.out.println(pieces.get(i).toString());
    }

    //Updates the positions of pieces in board[][] array
    public void updateBoard()
    {

    }
}
