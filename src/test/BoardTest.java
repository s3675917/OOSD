package test;

import model.Board;
import org.junit.Test;
import static org.junit.Assert.*;

public class BoardTest {


    @Test
    public void testSetPiece()
    {
        Board board = new Board(16,16);
        board.initPieces();
        //This is testing to see if setPiece() and updateBoard() works
        //Setting Kingpin from 0,6 to 3,2
        board.setPiece(3,2, 1);
        board.updateBoard();
        //printing to check if piece moved
        assertEquals(board.getBoard()[3][2],1);
        assertEquals(board.getBoard()[0][6],0);
    }
}