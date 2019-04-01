package view;/*
 * *Network programming lab 2
 * *@Date:  2019-03-22
 * *@author:  Biao Li
 * *StudentID :  s3675917
 * *@ver 1.0
 * */

import controller.SetupController;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;

public class GamePanel extends JPanel {
    public static int width;
    public static int height;
    private boolean running = false;

    private BufferedImage img;
    private Graphics2D g;

    private SetupController sc;

    public GamePanel(BufferStrategy bs, int width, int height) {
        GamePanel.width = width;
        GamePanel.height = height;
        setPreferredSize(new Dimension(width, height));
        setFocusable(true);
        requestFocus();
    }

    private void init() {
        running = true;

        img = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        g = (Graphics2D) img.getGraphics();

//        mouse = new MouseHandler(this);
//        key = new KeyHandler(this);

        sc = new SetupController();
    }

    public void run() {
        init();

        while (running) {


                sc.update();

            }



        }


    public void update(double time) {
        sc.update(time);
    }


}
