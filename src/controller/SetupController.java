package controller;

import model.Board;
import model.Prisoner;
import view.tilesMap.TileManager;

import java.awt.*;

public class SetupController {
    private Prisoner player;
    private TileManager tm;


    public SetupController() {
        Board board = new Board(16, 16);
        board.initPieces();
        tm = new TileManager("res/tile/untitled.xml");
    }


    public void render(Graphics g) {
        tm.render(g);


//        player.render(g);



    }




}
