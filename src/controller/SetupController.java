package controller;
import model.Board;
import view.SetupView;

public class SetupController
        {
            public SetupController(SetupView setupView)
            {
                System.out.println("controller aded");
                Board board = new Board(16,16);
                board.printBoard();
            }
            public void start()
            {

            }
        }
