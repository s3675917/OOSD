package model;
//Board should know all the pieces and the
import java.util.ArrayList;
import java.util.List;

public class Board
{
    private int height;
    private int breadth;

    private int [][] board;
    private List<Pieces> pieces = new ArrayList<Pieces>();
    public List<Pieces>getPieces()
    {
        return pieces;
    }
    public int [][] getBoard()
    {
        return board;
    }
    public Board(int height, int breadth)
    {
        this.height = height;
        this.breadth = breadth;
        this.board = new int[height][breadth];
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
   // their pieces however they want.
    public void initPieces()
    {
        Prisoner kingpin = new Kingpin(0,6);
        Pieces officer = new Officer(15,6);
        Pieces dog = new Dog(15,7);
        Pieces guard = new Guard(15,8);
        Pieces key = new Key(8,7);
        pieces.add(kingpin);
        pieces.add(officer);
        pieces.add(dog);
        pieces.add(guard);
        pieces.add(key);
        updateBoard();
    }


    //sets the x,y of piece
    public void setPiece(int toX, int toY, int pieceValue)
    {
        for(int k = 0; k < pieces.size(); k++)
        {
            if(pieceValue == pieces.get(k).getPieceValue())
            {
                board [pieces.get(k).getX()][pieces.get(k).getY()] = 0;
                pieces.get(k).setPosition(toX,toY);}
            }
    }

    //Prints out all the pieces and their positions, this is for testing only
    public void printBoard()
    {
        for(int i = 0; i < height; i++)
        {
            for(int j = 0; j< breadth; j++)
            {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    //Updates the positions of pieces in board[][] array, 0 is empty, 1 is Kingpin, 2 is Prisoner, 3 is Officer,
    //4 is dog, 5 is guard and 6 is key
    public void updateBoard()
    {
        for(int i = 0; i < pieces.size(); i++)
        {
            board[pieces.get(i).getX()][pieces.get(i).getY()] = pieces.get(i).getPieceValue();
        }
    }
}

