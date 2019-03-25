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
                //board.printBoard();

            }
            public void start()
            {

            }
        }
