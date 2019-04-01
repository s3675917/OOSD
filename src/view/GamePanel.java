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

    private BufferStrategy bs;
    private BufferedImage img;
    private Graphics2D g;

    private SetupController sc;

    public GamePanel(BufferStrategy bs, int width, int height) {
        this.bs = bs;
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


                this.render();

            }



        }


    public void render() {
        sc.render(g);
    }

    public void draw(Graphics2D g) {
        do {
            Graphics g2 = (Graphics) bs.getDrawGraphics();
            g2.drawImage(img, 8, 31, width, height, null);
            g2.dispose();
            bs.show();
        } while (bs.contentsLost());
    }
}
