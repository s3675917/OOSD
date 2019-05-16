package view;

import controller.ArrowKeyMonitor;
import controller.DrawingControl;
import controller.GameControl;
import model.DIR;
import model.player.Player;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferStrategy;
import java.util.Observable;
import java.util.Observer;

import static java.lang.Thread.sleep;

public class SetupJFame extends JFrame implements Runnable, Observer {
    private BufferStrategy bs;
    private Boolean isDrawing = true;
    public static final long serialVersionUID = 1L;
    private GamePanel gp;
    private Thread thread;
    //The menu should show a squared board and the pieces placed on the board

    public SetupJFame() {
        setTitle("Game");
        setSize(1280, 720);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setIgnoreRepaint(true);
        setVisible(true);
        pack();
        gp.addKeyListener(new ArrowKeyMonitor(this));
    }

    public void addNotify() {
        super.addNotify();

        createBufferStrategy(2);
        bs = getBufferStrategy();
        gp = new GamePanel(bs, 1280, 720);
        add(gp);

        if (thread == null) {
            thread = new Thread(this, "GameThread");
            thread.start();
        }
    }


    @Override
    public void run() {
        while (true) {
            long time = System.currentTimeMillis();
            try {
                sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            while (isDrawing) {
                //if (System.currentTimeMillis() - time > 1300) isDrawing = false;
                gp.render();
                gp.draw();

            }
        }

    }


    @Override
    public void update(Observable o, Object arg) {
        switch (String.valueOf(arg)) {
            case "draw":
                isDrawing = true;
                System.out.println("drawing");
                break;

            case "stop":
                isDrawing = false;
                System.out.println("stop drawing");
                break;
        }
    }
}


