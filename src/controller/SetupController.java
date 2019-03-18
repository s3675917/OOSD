package controller;
import model.Board;
import model.Kingpin;
import view.SetupView;

public class SetupController
        {
            public SetupController(SetupView setupView)
            {
                System.out.println("controller aded");
                Board board = new Board(16,16);
                board.initPieces();
                board.printBoard();
                System.out.println("\n");
                board.setPiece(0,0, 1);
                board.updateBoard();
                board.printBoard();
                //This is testing to see if setPiece() and updateBoard() works
            }
            public void start()
            {

            }
        }
