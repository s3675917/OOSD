package controller;

import model.Board;
import model.Kingpin;
import view.SetupView;

public class SetupController {
    public SetupController() {
        Board board = new Board(16, 16);
        board.initPieces();
        //board.printBoard();

    }

    public void start() {

    }

    public void update(double time) {


            cam.update();
        }

    }

}
