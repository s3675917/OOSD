package controller;
import model.Board;
import model.Kingpin;
import view.SetupView;

public class SetupController
        {
            public SetupController(SetupView setupView)
            {
                Board board = new Board(16,16);
                board.initPieces();




                System.out.println("Before moving Kingpin\n");
                board.printBoard();
                //This is testing to see if setPiece() and updateBoard() works
                System.out.println("\n");
                //Setting Kingpin from 0,6 to 3,2
                board.setPiece(3,2, 1);
                board.updateBoard();
                //printing to check if piece moved
                System.out.println("After moving Kingpin");
                board.printBoard();

            }
            public void start()
            {

            }
        }
