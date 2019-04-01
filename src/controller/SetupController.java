package controller;

import model.Board;
import model.Kingpin;
import view.SetupView;

import java.awt.*;

public class SetupController {
    public SetupController() {
        Board board = new Board(16, 16);
        board.initPieces();
        //board.printBoard();

    }

    public void start() {

    }

    public void render(Graphics2D g) {


    }




}
