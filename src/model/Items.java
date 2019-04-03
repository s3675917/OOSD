package model;

import view.Vector2f;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Items {
    protected int w;
    protected int h;

    protected BufferedImage img;
    protected Vector2f pos;

    public Items(BufferedImage img, Vector2f pos, int w, int h) {
        this.img = img;
        this.pos = pos;
        this.w = w;
        this.h = h;
    }

    public int getWidth() { return w; }
    public int getHeight() { return h; }


    public void render(Graphics g) {
        g.drawImage(img, (int)pos.getWorldVar().x, (int)pos.getWorldVar().y, w, h, null);
    }
}
