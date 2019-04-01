package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferStrategy;

public class SetupView extends JFrame implements KeyListener {
    private GamePanel mp;
    private JFrame frame = new JFrame("UI");
    public static final long serialVersionUID = 1L;



    //The menu should show a squared board and the pieces placed on the board
    public SetupView() {
        mp = new GamePanel();
        frame.add(mp);
        frame.addKeyListener(this);

        frame.setSize(600, 600);
        frame.setLocationRelativeTo(null);
        frame.setResizable(true);
        frame.setVisible(true);

        System.out.println("View started\n");
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int x = 0;
        switch (e.getKeyCode()) {
            case KeyEvent.VK_DOWN:
                x = 1;
            case KeyEvent.VK_UP:
                x = 2;
            case KeyEvent.VK_RIGHT:
                x = 3;
            case KeyEvent.VK_LEFT:
                x = 4;
            case KeyEvent.VK_ESCAPE:
                x = 5;


        }


//        switch (x) {
//            case 1:
//                xpos = player.getX();
//                if (xpos == 0 || xpos == (_game.getSize() - 1) / 2 || xpos == (_game.getSize() - 1)) {
//                    if (player.getY() < _game.getSize() - 1) {
//                        player.setY(player.getY() + 1);
//                        System.out.println("down");
//                        break;
//                    }
//
//                } else
//                    System.out.println("out of border");
//                return;
//
//            case 2:
//                xpos = player.getX();
//                if (xpos == 0 || xpos == (_game.getSize() - 1) / 2 || xpos == (_game.getSize() - 1)) {
//                    if (player.getY() > 0) {
//                        player.setY(player.getY() - 1);
//                        System.out.println("up");
//                        break;
//                    }
//                } else
//                    System.out.println("out of border");
//                return;
//            case 3:
//                ypos = player.getY();
//                if (ypos == 0 || ypos == (_game.getSize() - 1) / 2 || ypos == (_game.getSize() - 1)) {
//                    if (player.getX() < _game.getSize() - 1) {
//                        player.setX(player.getX() + 1);
//                        System.out.println("to right");
//                        break;
//                    }
//                } else
//                    System.out.println("out of border");
//                return;
//            case 4:
//                ypos = player.getY();
//                if (ypos == 0 || ypos == (_game.getSize() - 1) / 2 || ypos == (_game.getSize() - 1)) {
//                    if (player.getX() > 0) {
//                        player.setX(player.getX() - 1);
//                        System.out.println("to left");
//                        break;
//                    }
//                } else
//                    System.out.println("out of border");
//                return;
//            case 5:
//                JOptionPane.showMessageDialog(mp, "Game pause", "Game", JOptionPane.WARNING_MESSAGE);
//                return;
//            default:
//                return;
//        }
        //chase();
        frame.add(mp);
        frame.repaint();

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }



}