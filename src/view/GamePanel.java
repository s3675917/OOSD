package view;/*
 * *OOSD
 * *@Date:  2019-03-22
 * *@author:  Biao Li
 * *StudentID :  s3675917
 * *@ver 1.0
 * */

import controller.GameControl;
import controller.TileManager;
import controller.state.ErrorState;
import model.Position;
import model.player.Player;
import model.tile.Tiles;
import model.tile.Trap;
import view.tilesMap.TileMap;
import view.tilesMap.TileMapReader;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class GamePanel extends JPanel {

    private int width;
    private int height;
    BufferStrategy bs;
    Image img;
    Graphics g;

    public GamePanel(BufferStrategy bs, int width, int height) {
        this.bs = bs;
        this.width = width;
        this.height = height;
        setPreferredSize(new Dimension(width, height));
        setFocusable(true);
        requestFocus();
        init();
    }

    private void init() {
        img = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        g = img.getGraphics();
        new GameControl();
        new TileMapReader("res/tile/untitled.xml");
    }

    public void render() {
        // drawing map
        ArrayList<TileMap> tileMaps = TileManager.getTileMaps();
        for (TileMap tilemap : tileMaps) {
            Tiles[] blocks = tilemap.getBlocks();

            for (Tiles tile : blocks) {
                if (tile != null)
                    g.drawImage(tile.getImg(), tile.getPos().getX(), tile.getPos().getY(), tile.getWidth(),
                            tile.getHeight(), null);
            }

        }


        // drawing player
        for (int x = 0; x < GameControl.players.size(); x++) {
            Player player = GameControl.players.get(x);
            //g.drawImage(player.getSpriteImage(), oldPosXxH + j * (pos.getX() - oldPos.getX()), oldPosYxH + j * (pos.getY() - oldPos.getY()), null);

            long now;
            int wh = player.getWh();
            Position pos = player.getPos();
            Position oldPos = player.getOldPos();

            if (player.isWalking()) {
                now = System.currentTimeMillis();
                int oldPosXxH = oldPos.getX() * 32;
                int oldPosYxH = oldPos.getY() * 32;
                if (now - player.getStart() < 1000) {
                    Double i = new Double((now - player.getStart()) / 30);
                    int j = i.intValue();
                    player.AnimationAddNum();
                    g.drawImage(player.getSpriteImage(), oldPosXxH + j * (pos.getX() - oldPos.getX()), oldPosYxH + j * (pos.getY() - oldPos.getY()), null);
                } else {
                    player.setWalking(false);
                }
            } else {
                int newPosXxH = pos.getX() * 32;
                int newPosYxH = pos.getY() * 32;

                //draw the pointer on the next movable player
                if (x == GameControl.playerCounter) {
                    g.drawImage(player.getNextStandingImage(), newPosXxH, newPosYxH - 32, null);
                }
                //draw non-moving player
                g.drawImage(player.getStandingImage(), newPosXxH, newPosYxH, null);
            }
        }
    }

    public void draw() {
        do {
            Graphics g2 = bs.getDrawGraphics();
            g2.drawImage(img, 8, 31, width, height, null);

            //drawing error message
            g2.drawString(ErrorState.getErrorMessage(), 100, 660);
            g2.dispose();
            bs.show();
        } while (bs.contentsLost());

    }

}
